package tests.items;

import org.testng.annotations.Test;
import steps.InventoryItemSteps.SauceLabsBackpackSteps;
import steps.ProductsPageSteps;
import steps.YourCartSteps;
import tests.BaseTest;

public class SauceLabsBackpackTest extends BaseTest {

    @Test (dataProvider = "credentialsForLogin")
    public void testAddingAndDeletingSLBItemOnTheSLBItemPage(String login, String password) {
        visit("");
        ProductsPageSteps doLogin = steps.doLogin(login, password);
        SauceLabsBackpackSteps slbPageByTitleLink = doLogin.transitionToSLBPageByTitleLink();
        SauceLabsBackpackSteps slbToYourCart = slbPageByTitleLink.addSLBToYourCart();
        slbToYourCart.checkThatSLBRemoveButtonAppearedAndShoppingCartBadgeIsDisplaying();
        YourCartSteps theYourCartPage = slbToYourCart.transitionToTheYourCartPage();
        theYourCartPage.checkThatItemSLBIsPresentInTheCart();
        SauceLabsBackpackSteps slbPageByTitleLink1 = theYourCartPage.transitionToSLBPageByTitleLink();
        SauceLabsBackpackSteps removed = slbPageByTitleLink1.removeSLBFromTheCartOnTheSLBPage();
        removed.checkThatSLBAddToCartButtonAppearedAndShoppingCartBadgeIsAbsent();
        YourCartSteps theYourCartPage1 = removed.transitionToTheYourCartPage();
        theYourCartPage1.checkThatItemSLBIsAbsentInTheCart();
    }

    @Test (dataProvider = "credentialsForLogin")
    public void testTransitionWithBackToProductsButtonOnSLBPage(String login, String password) {
        visit("");
        ProductsPageSteps doLogin = steps.doLogin(login, password);
        SauceLabsBackpackSteps slbPageByImageLink = doLogin.transitionToSLBPageByImageLink();
        ProductsPageSteps theProductsPage = slbPageByImageLink.transitionToTheProductsPage();
        theProductsPage.checkThatProductsPageIsDisplayed();
    }
}
