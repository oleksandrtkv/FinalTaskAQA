package steps.InventoryItemSteps;

import pages.InventoryItemPages.SauceLabsBikeLightPage;
import steps.ProductsPageSteps;
import steps.YourCartSteps;

public class SauceLabsBikeLightSteps {

    SauceLabsBikeLightPage sauceLabsBikeLightPage = new SauceLabsBikeLightPage();

    public void assertThatSLBLPageIsLoaded() {
        sauceLabsBikeLightPage.assertThatSLBLImageIsDisplayed();
        sauceLabsBikeLightPage.assertThatSLBLTitleIsCorrect();
    }

    public SauceLabsBikeLightSteps addSLBLToYourCart() {
        sauceLabsBikeLightPage.clickSLBLAddToCartButton();
        return new SauceLabsBikeLightSteps();
    }

    public void checkThatSLBLRemoveButtonAppearedAndShoppingCartBadgeIsDisplaying() {
        sauceLabsBikeLightPage.assertThatSLBLRemoveButtonAppeared();
        sauceLabsBikeLightPage.assertThatShoppingCartBadgeIsDisplayedCorrect();
    }

    public YourCartSteps transitionToTheYourCartPage() {
        sauceLabsBikeLightPage.clickCartLink();
        return new YourCartSteps();
    }

    public SauceLabsBikeLightSteps removeSLBLFromTheCartOnTheSLBPage() {
        sauceLabsBikeLightPage.clickSLBLRemoveButton();
        return new SauceLabsBikeLightSteps();
    }

    public void checkThatSLBLAddToCartButtonAppearedAndShoppingCartBadgeIsAbsent() {
        sauceLabsBikeLightPage.assertThatSLBLAddToCartButtonAppeared();
        sauceLabsBikeLightPage.shoppingCartBadgeIsAbsent();
    }

    public ProductsPageSteps transitionToTheProductsPage() {
        sauceLabsBikeLightPage.clickBackToProductsButton();
        return new ProductsPageSteps();
    }
}
