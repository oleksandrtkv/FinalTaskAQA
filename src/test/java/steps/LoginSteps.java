package steps;

import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    public ProductsPageSteps doLogin(String login, String password){
        inputLoginData(login, password);
        return new ProductsPageSteps();
    }

    private void inputLoginData(String login, String password){
        loginPage.fillUsernameField(login);
        loginPage.fillPasswordField(password);
        loginPage.clickLoginButton();
    }

    public void checkThatLoginPageIsDisplayed(){
        loginPage.loginFormIsDisplayed();
        loginPage.errorMessageIsHided();
    }

    public LoginSteps doIncorrectLogin(String login, String password){
        inputLoginData(login, password);
        return new LoginSteps();
    }

    public void checkThatErrorMessageIsShown() {
        loginPage.errorMessageIsShown();
    }

    public void hideErrorMessage() {
        loginPage.clickErrorButton();
    }

    public void checkThatErrorMessageIsHided() {
        loginPage.errorMessageIsHided();
    }
}
