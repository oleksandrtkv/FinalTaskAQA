package tests;

import org.testng.annotations.Test;
import steps.*;

public class SmokeTest extends BaseTest{

    @Test (dataProvider = "credentialsForLogin")
    public void testSmoke(String login, String password) {

        visit("");

        ProductsPageSteps productsPageSteps = steps.doLogin(login, password);
        productsPageSteps.checkThatProductsPageIsDisplayed();

        productsPageSteps.addSLBToYourCart();
        productsPageSteps.checkThatShoppingCartBadgeIsDisplayed();

        YourCartSteps yourCartSteps = productsPageSteps.transitionToTheYourCartPage();
        yourCartSteps.checkThatCartItemListIsPresent();

        CheckoutYourInformationSteps checkoutYourInformationSteps = yourCartSteps.transitionToTheCheckoutYourInformationPage();
        checkoutYourInformationSteps.checkThatCheckoutYourInformationPageIsDisplayed();

        CheckoutOverviewSteps checkoutOverviewSteps = checkoutYourInformationSteps.fillInformationForm("Oleksandr", "Tiekoiev", "62103");
        checkoutOverviewSteps.checkThatCheckoutOverviewPageIsDisplayed();

        CheckoutCompleteSteps checkoutCompleteSteps = checkoutOverviewSteps.transitionToTheCheckoutCompletePage();
        checkoutCompleteSteps.checkThatCheckoutCompleteContainerIsPresent();

        ProductsPageSteps productsPageSteps1 = checkoutCompleteSteps.transitionToTheProductsPage();
        productsPageSteps1.checkThatProductsPageIsDisplayed();

        LoginSteps logout = productsPageSteps1.logout();
        logout.checkThatLoginPageIsDisplayed();
    }
}
