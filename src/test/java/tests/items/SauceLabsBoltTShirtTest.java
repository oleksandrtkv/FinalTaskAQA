package tests.items;

import org.testng.annotations.Test;
import steps.InventoryItemSteps.SauceLabsBoltTShirtSteps;
import steps.ProductsPageSteps;
import steps.YourCartSteps;
import tests.BaseTest;

public class SauceLabsBoltTShirtTest extends BaseTest {

    @Test(dataProvider = "credentialsForLogin")
    public void testAddingAndDeletingSLBTSItemOnTheSLBTSItemPage(String login, String password) {
        visit("");
        ProductsPageSteps doLogin = steps.doLogin(login, password);
        SauceLabsBoltTShirtSteps slbtsPageByTitleLink = doLogin.transitionToSLBTSPageByTitleLink();
        SauceLabsBoltTShirtSteps slbtsToYourCart = slbtsPageByTitleLink.addSLBTSToYourCart();
        slbtsToYourCart.checkThatSLBTSRemoveButtonAppearedAndShoppingCartBadgeIsDisplaying();
        YourCartSteps theYourCartPage = slbtsToYourCart.transitionToTheYourCartPage();
        theYourCartPage.checkThatSLBTSItemIsPresentInTheCart();
        SauceLabsBoltTShirtSteps slbtsPageByTitleLink1 = theYourCartPage.transitionToSLBTSPageByTitleLink();
        SauceLabsBoltTShirtSteps removed = slbtsPageByTitleLink1.removeSLBTSFromTheCartOnTheSLBTSPage();
        removed.checkThatSLBTSAddToCartButtonAppearedAndShoppingCartBadgeIsAbsent();
        YourCartSteps theYourCartPage1 = removed.transitionToTheYourCartPage();
        theYourCartPage1.checkThatSLBTSItemIsAbsentInTheCart();
    }

    @Test (dataProvider = "credentialsForLogin")
    public void testTransitionWithBackToProductsButtonOnSLBTSPage(String login, String password) {
        visit("");
        ProductsPageSteps doLogin = steps.doLogin(login, password);
        SauceLabsBoltTShirtSteps slbtsPageByImageLink = doLogin.transitionToSLBTSPageByImageLink();
        ProductsPageSteps theProductsPage = slbtsPageByImageLink.transitionToTheProductsPage();
        theProductsPage.checkThatProductsPageIsDisplayed();
    }
}
