package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.fail;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement usernameField;
    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordField;
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement loginButton;
    @FindBy(xpath = "//h3[@data-test='error']")
    WebElement errorMessage;
    @FindBy(xpath = "//button[@class='error-button']")
    WebElement errorButton;


    public void fillUsernameField(String text){
        usernameField.clear();
        usernameField.sendKeys(text);
    }

    public void fillPasswordField(String text){
        passwordField.clear();
        passwordField.sendKeys(text);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public void errorMessageIsShown(){
        assertThat(errorMessage.isDisplayed()).isTrue();
    }

    public void errorMessageIsHided(){
        try {
            errorMessage.isDisplayed();
            fail();
        } catch (Exception ignored){}
    }

    public void clickErrorButton(){
        errorButton.click();
    }

    public void loginFormIsDisplayed(){
        assertThat(usernameField.isDisplayed()).isTrue();
        assertThat(passwordField.isDisplayed()).isTrue();
        assertThat(loginButton.isDisplayed()).isTrue();
    }
}
