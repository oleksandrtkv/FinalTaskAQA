package tests.items;

import org.testng.annotations.Test;
import steps.InventoryItemSteps.SauceLabsFleeceJacketSteps;
import steps.ProductsPageSteps;
import steps.YourCartSteps;
import tests.BaseTest;

public class SauceLabsFleeceJacketTest extends BaseTest {

    @Test(dataProvider = "credentialsForLogin")
    public void testAddingAndDeletingSLFJItemOnTheSLFJItemPage(String login, String password) {
        visit("");
        ProductsPageSteps doLogin = steps.doLogin(login, password);
        SauceLabsFleeceJacketSteps slfjPageByTitleLink = doLogin.transitionToSLFJPageByTitleLink();
        SauceLabsFleeceJacketSteps slfjToYourCart = slfjPageByTitleLink.addSLFJToYourCart();
        slfjToYourCart.checkThatSLFJRemoveButtonAppearedAndShoppingCartBadgeIsDisplaying();
        YourCartSteps theYourCartPage = slfjToYourCart.transitionToTheYourCartPage();
        theYourCartPage.checkThatSLFJItemIsPresentInTheCart();
        SauceLabsFleeceJacketSteps slfjPageByTitleLink1 = theYourCartPage.transitionToSLFJPageByTitleLink();
        SauceLabsFleeceJacketSteps removed = slfjPageByTitleLink1.removeSLFJFromTheCartOnTheSLFJPage();
        removed.checkThatSLFJAddToCartButtonAppearedAndShoppingCartBadgeIsAbsent();
        YourCartSteps theYourCartPage1 = removed.transitionToTheYourCartPage();
        theYourCartPage1.checkThatSLFJItemIsAbsentInTheCart();
    }

    @Test (dataProvider = "credentialsForLogin")
    public void testTransitionWithBackToProductsButtonOnSLFJPage(String login, String password) {
        visit("");
        ProductsPageSteps doLogin = steps.doLogin(login, password);
        SauceLabsFleeceJacketSteps slfjPageByImageLink = doLogin.transitionToSLFJPageByImageLink();
        ProductsPageSteps theProductsPage = slfjPageByImageLink.transitionToTheProductsPage();
        theProductsPage.checkThatProductsPageIsDisplayed();
    }
}
