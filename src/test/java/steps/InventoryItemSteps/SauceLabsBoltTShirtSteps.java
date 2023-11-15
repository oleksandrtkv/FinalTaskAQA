package steps.InventoryItemSteps;

import pages.InventoryItemPages.SauceLabsBoltTShirtPage;
import steps.ProductsPageSteps;
import steps.YourCartSteps;

public class SauceLabsBoltTShirtSteps {

    SauceLabsBoltTShirtPage sauceLabsBoltTShirtPage = new SauceLabsBoltTShirtPage();

    public void assertThatSLBTSPageIsLoaded() {
        sauceLabsBoltTShirtPage.assertThatSLBTSImageIsDisplayed();
        sauceLabsBoltTShirtPage.assertThatSLBTSTitleNameIsCorrect();
    }

    public SauceLabsBoltTShirtSteps addSLBTSToYourCart() {
        sauceLabsBoltTShirtPage.clickSLBTSAddToCartButton();
        return new SauceLabsBoltTShirtSteps();

    }

    public void checkThatSLBTSRemoveButtonAppearedAndShoppingCartBadgeIsDisplaying() {
        sauceLabsBoltTShirtPage.assertThatSLBTSRemoveButtonAppeared();
        sauceLabsBoltTShirtPage.assertThatShoppingCartBadgeIsDisplayedCorrect();
    }

    public YourCartSteps transitionToTheYourCartPage() {
        sauceLabsBoltTShirtPage.clickCartLink();
        return new YourCartSteps();
    }

    public SauceLabsBoltTShirtSteps removeSLBTSFromTheCartOnTheSLBTSPage() {
        sauceLabsBoltTShirtPage.clickSLBTSRemoveButton();
        return new SauceLabsBoltTShirtSteps();
    }

    public void checkThatSLBTSAddToCartButtonAppearedAndShoppingCartBadgeIsAbsent() {
        sauceLabsBoltTShirtPage.assertThatSLBTSAddToCartButtonAppeared();
        sauceLabsBoltTShirtPage.shoppingCartBadgeIsAbsent();
    }

    public ProductsPageSteps transitionToTheProductsPage() {
        sauceLabsBoltTShirtPage.clickBackToProductsButton();
        return new ProductsPageSteps();
    }
}
