package tests;

import lombok.Getter;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import steps.LoginSteps;

import java.io.BufferedReader;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Properties;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class BaseTest {

    @Getter
    static WebDriver driver = null;

    Properties properties;

    protected LoginSteps steps;

    @SneakyThrows
    @BeforeClass
    public void beforeClass() {
        properties = new Properties();
        try(BufferedReader reader = Files.newBufferedReader(Path.of("config.properties"))){
            properties.load(reader);
            String driverName = properties.getProperty("driver");
            File file = new File(properties.getProperty("path"));
            System.setProperty(driverName, file.getAbsolutePath());
            if(driverName.contains("chrome")){
                driver = new ChromeDriver();
            } else if (driverName.contains("edge")){
                driver = new EdgeDriver();
            } else {
                driver = new FirefoxDriver();
            }
            assertThat(driver).isNotNull();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

            steps = new LoginSteps();
        }
    }

    public void visit(String path){
        driver.navigate().to(properties.getProperty("site") + path);
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

    @DataProvider(name="credentialsForLogin")
    public Object[][] validLogin(){
        return new Object[][]{
                {"standard_user", "secret_sauce"}
        };
    }

    @DataProvider(name="validLoginCredentials")
    public Object[][] loginSuccessData(){
        return new Object[][]{
                {"standard_user", "secret_sauce"},
                {"problem_user", "secret_sauce"},
                {"performance_glitch_user", "secret_sauce"}
        };
    }

    @DataProvider(name="invalidLoginCredentials")
    public Object[][] loginFailedData(){
        return new Object[][]{
                {"standard_user", ""},
                {"standard_user", "invalid_password"},
                {"", ""},
                {"", "invalid_password"},
                {"", "secret_sauce"},
                {"invalid_login", "invalid_password"},
                {"invalid_login", "secret_sauce"},
                {"invalid_login", ""}
        };
    }
}
