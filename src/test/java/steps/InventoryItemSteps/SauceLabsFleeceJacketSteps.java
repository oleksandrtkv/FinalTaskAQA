package steps.InventoryItemSteps;

import pages.InventoryItemPages.SauceLabsFleeceJacketPage;
import steps.ProductsPageSteps;
import steps.YourCartSteps;

public class SauceLabsFleeceJacketSteps {

    SauceLabsFleeceJacketPage sauceLabsFleeceJacketPage = new SauceLabsFleeceJacketPage();

    public void assertThatSLFJPageIsLoaded() {
        sauceLabsFleeceJacketPage.assertThatSLFJImageIsDisplayed();
        sauceLabsFleeceJacketPage.assertThatSLFJTitleNameIsCorrect();
    }

    public SauceLabsFleeceJacketSteps addSLFJToYourCart() {
        sauceLabsFleeceJacketPage.clickSLFJAddToCartButton();
        return new SauceLabsFleeceJacketSteps();
    }

    public void checkThatSLFJRemoveButtonAppearedAndShoppingCartBadgeIsDisplaying() {
        sauceLabsFleeceJacketPage.assertThatSLFJRemoveButtonAppeared();
        sauceLabsFleeceJacketPage.assertThatShoppingCartBadgeIsDisplayedCorrect();
    }

    public YourCartSteps transitionToTheYourCartPage() {
        sauceLabsFleeceJacketPage.clickCartLink();
        return new YourCartSteps();
    }

    public SauceLabsFleeceJacketSteps removeSLFJFromTheCartOnTheSLFJPage() {
        sauceLabsFleeceJacketPage.clickSLFJRemoveButton();
        return new SauceLabsFleeceJacketSteps();
    }

    public void checkThatSLFJAddToCartButtonAppearedAndShoppingCartBadgeIsAbsent() {
        sauceLabsFleeceJacketPage.assertThatSLFJAddToCartButtonAppeared();
        sauceLabsFleeceJacketPage.shoppingCartBadgeIsAbsent();
    }

    public ProductsPageSteps transitionToTheProductsPage() {
        sauceLabsFleeceJacketPage.clickBackToProductsButton();
        return new ProductsPageSteps();
    }
}
