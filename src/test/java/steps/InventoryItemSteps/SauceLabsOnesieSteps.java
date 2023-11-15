package steps.InventoryItemSteps;

import pages.InventoryItemPages.SauceLabsOnesiePage;
import steps.ProductsPageSteps;
import steps.YourCartSteps;

public class SauceLabsOnesieSteps {

    SauceLabsOnesiePage sauceLabsOnesiePage = new SauceLabsOnesiePage();

    public void assertThatSLOPageIsLoaded() {
        sauceLabsOnesiePage.assertThatSLOImageIsDisplayed();
        sauceLabsOnesiePage.assertThatSLOTitleNameIsCorrect();
    }

    public SauceLabsOnesieSteps addSLOToYourCart() {
        sauceLabsOnesiePage.clickSLOAddToCartButton();
        return new SauceLabsOnesieSteps();
    }

    public void checkThatSLORemoveButtonAppearedAndShoppingCartBadgeIsDisplaying() {
        sauceLabsOnesiePage.assertThatSLORemoveButtonAppeared();
        sauceLabsOnesiePage.assertThatShoppingCartBadgeIsDisplayedCorrect();
    }

    public YourCartSteps transitionToTheYourCartPage() {
        sauceLabsOnesiePage.clickCartLink();
        return new YourCartSteps();
    }

    public SauceLabsOnesieSteps removeSLOFromTheCartOnTheSLOPage() {
        sauceLabsOnesiePage.clickSLORemoveButton();
        return new SauceLabsOnesieSteps();
    }

    public void checkThatSLOAddToCartButtonAppearedAndShoppingCartBadgeIsAbsent() {
        sauceLabsOnesiePage.assertThatSLOAddToCartButtonAppeared();
        sauceLabsOnesiePage.shoppingCartBadgeIsAbsent();
    }

    public ProductsPageSteps transitionToTheProductsPage() {
        sauceLabsOnesiePage.clickBackToProductsButton();
        return new ProductsPageSteps();
    }
}
