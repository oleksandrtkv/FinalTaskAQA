package tests.items;

import org.testng.annotations.Test;
import steps.InventoryItemSteps.SauceLabsBikeLightSteps;
import steps.ProductsPageSteps;
import steps.YourCartSteps;
import tests.BaseTest;

public class SauceLabsBikeLightTest extends BaseTest {

    @Test(dataProvider = "credentialsForLogin")
    public void testAddingAndDeletingSLBLItemOnTheSLBLItemPage(String login, String password) {
        visit("");
        ProductsPageSteps doLogin = steps.doLogin(login, password);
        SauceLabsBikeLightSteps slblPageByTitleLink = doLogin.transitionToSLBLPageByTitleLink();
        SauceLabsBikeLightSteps slblToYourCart = slblPageByTitleLink.addSLBLToYourCart();
        slblToYourCart.checkThatSLBLRemoveButtonAppearedAndShoppingCartBadgeIsDisplaying();
        YourCartSteps theYourCartPage = slblToYourCart.transitionToTheYourCartPage();
        theYourCartPage.checkThatItemSLBLIsPresentInTheCart();
        SauceLabsBikeLightSteps slblPageByTitleLink1 = theYourCartPage.transitionToSLBLPageByTitleLink();
        SauceLabsBikeLightSteps removed = slblPageByTitleLink1.removeSLBLFromTheCartOnTheSLBPage();
        removed.checkThatSLBLAddToCartButtonAppearedAndShoppingCartBadgeIsAbsent();
        YourCartSteps theYourCartPage1 = removed.transitionToTheYourCartPage();
        theYourCartPage1.checkThatSLBLItemIsAbsentInTheCart();
    }

    @Test (dataProvider = "credentialsForLogin")
    public void testTransitionWithBackToProductsButtonOnSLBLPage(String login, String password) {
        visit("");
        ProductsPageSteps doLogin = steps.doLogin(login, password);
        SauceLabsBikeLightSteps slblPageByImageLink = doLogin.transitionToSLBLPageByImageLink();
        ProductsPageSteps theProductsPage = slblPageByImageLink.transitionToTheProductsPage();
        theProductsPage.checkThatProductsPageIsDisplayed();
    }
}
