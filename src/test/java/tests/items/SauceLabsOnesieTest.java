package tests.items;

import org.testng.annotations.Test;
import steps.InventoryItemSteps.SauceLabsOnesieSteps;
import steps.ProductsPageSteps;
import steps.YourCartSteps;
import tests.BaseTest;

public class SauceLabsOnesieTest extends BaseTest {

    @Test(dataProvider = "credentialsForLogin")
    public void testAddingAndDeletingSLOItemOnTheSLOItemPage(String login, String password) {
        visit("");
        ProductsPageSteps doLogin = steps.doLogin(login, password);
        SauceLabsOnesieSteps sloPageByTitleLink = doLogin.transitionToSLOPageByTitleLink();
        SauceLabsOnesieSteps sloToYourCart = sloPageByTitleLink.addSLOToYourCart();
        sloToYourCart.checkThatSLORemoveButtonAppearedAndShoppingCartBadgeIsDisplaying();
        YourCartSteps theYourCartPage = sloToYourCart.transitionToTheYourCartPage();
        theYourCartPage.checkThatSLOItemIsPresentInTheCart();
        SauceLabsOnesieSteps sloPageByTitleLink1 = theYourCartPage.transitionToSLOPageByTitleLink();
        SauceLabsOnesieSteps removed = sloPageByTitleLink1.removeSLOFromTheCartOnTheSLOPage();
        removed.checkThatSLOAddToCartButtonAppearedAndShoppingCartBadgeIsAbsent();
        YourCartSteps theYourCartPage1 = removed.transitionToTheYourCartPage();
        theYourCartPage1.checkThatSLOItemIsAbsentInTheCart();
    }

    @Test (dataProvider = "credentialsForLogin")
    public void testTransitionWithBackToProductsButtonOnSLOPage(String login, String password) {
        visit("");
        ProductsPageSteps doLogin = steps.doLogin(login, password);
        SauceLabsOnesieSteps sloPageByImageLink = doLogin.transitionToSLOPageByImageLink();
        ProductsPageSteps theProductsPage = sloPageByImageLink.transitionToTheProductsPage();
        theProductsPage.checkThatProductsPageIsDisplayed();
    }
}
