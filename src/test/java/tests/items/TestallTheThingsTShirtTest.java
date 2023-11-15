package tests.items;

import org.testng.annotations.Test;
import steps.InventoryItemSteps.TestallTheThingsTShirtSteps;
import steps.ProductsPageSteps;
import steps.YourCartSteps;
import tests.BaseTest;

public class TestallTheThingsTShirtTest extends BaseTest {

    @Test(dataProvider = "credentialsForLogin")
    public void testAddingAndDeletingTATTTSItemOnTheTATTTSItemPage(String login, String password) {
        visit("");
        ProductsPageSteps doLogin = steps.doLogin(login, password);
        TestallTheThingsTShirtSteps tatttsPageByTitleLink = doLogin.transitionToTATTTSPageByTitleLink();
        TestallTheThingsTShirtSteps tatttsToYourCart = tatttsPageByTitleLink.addTATTTSToYourCart();
        tatttsToYourCart.checkThatTATTTSRemoveButtonAppearedAndShoppingCartBadgeIsDisplaying();
        YourCartSteps theYourCartPage = tatttsToYourCart.transitionToTheYourCartPage();
        theYourCartPage.checkThatTATTTSItemIsPresentInTheCart();
        TestallTheThingsTShirtSteps tatttsPageByTitleLink1 = theYourCartPage.transitionToTATTTSPageByTitleLink();
        TestallTheThingsTShirtSteps removed = tatttsPageByTitleLink1.removeTATTTSFromTheCartOnTheTATTTSPage();
        removed.checkThatTATTTSAddToCartButtonAppearedAndShoppingCartBadgeIsAbsent();
        YourCartSteps theYourCartPage1 = removed.transitionToTheYourCartPage();
        theYourCartPage1.checkThatTATTTStemIsAbsentInTheCart();
    }

    @Test (dataProvider = "credentialsForLogin")
    public void testTransitionWithBackToProductsButtonOnTATTTSPage(String login, String password) {
        visit("");
        ProductsPageSteps doLogin = steps.doLogin(login, password);
        TestallTheThingsTShirtSteps tatttsPageByImageLink = doLogin.transitionToTATTTSPageByImageLink();
        ProductsPageSteps theProductsPage = tatttsPageByImageLink.transitionToTheProductsPage();
        theProductsPage.checkThatProductsPageIsDisplayed();
    }
}
