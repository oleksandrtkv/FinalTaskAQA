package tests;

import org.testng.annotations.Test;
import steps.LoginSteps;

public class LoginPageTest extends BaseTest {
    
    @Test
    public void testLoginPageIsLoaded() {
        visit("");
        steps.checkThatLoginPageIsDisplayed();
    }

    @Test(dataProvider = "invalidLoginCredentials")
    public void testLoginWithInvalidCredentials(String login, String password) {
        visit("");
        LoginSteps incorrectLogin = steps.doIncorrectLogin(login, password);
        incorrectLogin.checkThatErrorMessageIsShown();
        incorrectLogin.hideErrorMessage();
        incorrectLogin.checkThatErrorMessageIsHided();
    }
}
