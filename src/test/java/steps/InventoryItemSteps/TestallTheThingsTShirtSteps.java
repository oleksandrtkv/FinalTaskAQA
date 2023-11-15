package steps.InventoryItemSteps;

import pages.InventoryItemPages.TestallTheThingsTShirtPage;
import steps.ProductsPageSteps;
import steps.YourCartSteps;

public class TestallTheThingsTShirtSteps {

    TestallTheThingsTShirtPage testallTheThingsTShirtPage = new TestallTheThingsTShirtPage();

    public void assertThatTATTTSPageIsLoaded() {
        testallTheThingsTShirtPage.assertThatTATTTSImageIsDisplayed();
        testallTheThingsTShirtPage.assertThatTATTTSTitleNameIsCorrect();
    }

    public TestallTheThingsTShirtSteps addTATTTSToYourCart() {
        testallTheThingsTShirtPage.clickTATTTSAddToCartButton();
        return new TestallTheThingsTShirtSteps();
    }

    public void checkThatTATTTSRemoveButtonAppearedAndShoppingCartBadgeIsDisplaying() {
        testallTheThingsTShirtPage.assertThatTATTTSRemoveButtonAppeared();
        testallTheThingsTShirtPage.assertThatShoppingCartBadgeIsDisplayedCorrect();
    }

    public YourCartSteps transitionToTheYourCartPage() {
        testallTheThingsTShirtPage.clickCartLink();
        return new YourCartSteps();
    }

    public TestallTheThingsTShirtSteps removeTATTTSFromTheCartOnTheTATTTSPage() {
        testallTheThingsTShirtPage.clickTATTTSRemoveButton();
        return new TestallTheThingsTShirtSteps();
    }

    public void checkThatTATTTSAddToCartButtonAppearedAndShoppingCartBadgeIsAbsent() {
        testallTheThingsTShirtPage.assertThatTATTTSAddToCartButtonAppeared();
        testallTheThingsTShirtPage.shoppingCartBadgeIsAbsent();
    }

    public ProductsPageSteps transitionToTheProductsPage() {
        testallTheThingsTShirtPage.clickBackToProductsButton();
        return new ProductsPageSteps();
    }
}
