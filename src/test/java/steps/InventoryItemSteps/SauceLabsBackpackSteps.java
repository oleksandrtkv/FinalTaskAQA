package steps.InventoryItemSteps;

import pages.InventoryItemPages.SauceLabsBackpackPage;
import steps.ProductsPageSteps;
import steps.YourCartSteps;

public class SauceLabsBackpackSteps {

    SauceLabsBackpackPage sauceLabsBackpackPage = new SauceLabsBackpackPage();

    public void assertThatSLBPageIsLoaded() {
        sauceLabsBackpackPage.assertThatSLBImageIsDisplayed();
        sauceLabsBackpackPage.assertThatSLBTitleIsCorrect();
    }

    public SauceLabsBackpackSteps addSLBToYourCart() {
        sauceLabsBackpackPage.clickSLBAddToCartButton();
        return new SauceLabsBackpackSteps();
    }

    public void checkThatSLBRemoveButtonAppearedAndShoppingCartBadgeIsDisplaying() {
        sauceLabsBackpackPage.assertThatSLBRemoveButtonAppeared();
        sauceLabsBackpackPage.assertThatShoppingCartBadgeIsDisplayedCorrect();
    }

    public YourCartSteps transitionToTheYourCartPage() {
        sauceLabsBackpackPage.clickCartLink();
        return new YourCartSteps();
    }

    public SauceLabsBackpackSteps removeSLBFromTheCartOnTheSLBPage() {
        sauceLabsBackpackPage.clickSLBRemoveButton();
        return new SauceLabsBackpackSteps();
    }

    public void checkThatSLBAddToCartButtonAppearedAndShoppingCartBadgeIsAbsent() {
        sauceLabsBackpackPage.assertThatSLBAddToCartButtonAppeared();
        sauceLabsBackpackPage.shoppingCartBadgeIsAbsent();
    }

    public ProductsPageSteps transitionToTheProductsPage() {
        sauceLabsBackpackPage.clickBackToProductsButton();
        return new ProductsPageSteps();
    }
}
