package steps;

import pages.ProductsPage;
import steps.InventoryItemSteps.*;

public class ProductsPageSteps {

    ProductsPage productsPage = new ProductsPage();

    public void checkThatProductsPageIsDisplayed(){
        productsPage.inventoryListIsPresent();
    }

    public LoginSteps logout(){
        productsPage.clickBurgerMenuButton();
        productsPage.clickVisibleLogoutLink();
        return new LoginSteps();
    }

    public ProductsPageSteps addSLBToYourCart(){
        productsPage.clickSLBAddToCartButton();
        return new ProductsPageSteps();
    }

    public void checkThatShoppingCartBadgeIsDisplayed() {
        productsPage.shoppingCartBadgeIsPresent();
    }

    public YourCartSteps transitionToTheYourCartPage() {
        productsPage.clickCartLink();
        return new YourCartSteps();
    }

    public ProductsPageSteps sortingNamesInAscendingOrder() {
        productsPage.clickA_ZSort();
        return new ProductsPageSteps();
    }

    public ProductsPageSteps sortingNamesInDescendingOrder() {
        productsPage.clickZ_ASort();
        return new ProductsPageSteps();
    }

    public ProductsPageSteps sortingPricesInDescendingOrder() {
        productsPage.click9_0Sort();
        return new ProductsPageSteps();
    }

    public ProductsPageSteps sortingPricesInAscendingOrder() {
        productsPage.click0_9Sort();
        return new ProductsPageSteps();
    }

    public SauceLabsBackpackSteps transitionToSLBPageByTitleLink(){
        productsPage.clickSLBTitleLink();
        return new SauceLabsBackpackSteps();
    }

    public SauceLabsBackpackSteps transitionToSLBPageByImageLink() {
        productsPage.clickSLBImageLink();
        return new SauceLabsBackpackSteps();
    }

    public SauceLabsBikeLightSteps transitionToSLBLPageByTitleLink() {
        productsPage.clickSLBLTitleLink();
        return new SauceLabsBikeLightSteps();
    }

    public SauceLabsBikeLightSteps transitionToSLBLPageByImageLink() {
        productsPage.clickSLBLImageLink();
        return new SauceLabsBikeLightSteps();
    }

    public SauceLabsBoltTShirtSteps transitionToSLBTSPageByTitleLink() {
        productsPage.clickSLBTSTitleLink();
        return new SauceLabsBoltTShirtSteps();
    }

    public SauceLabsBoltTShirtSteps transitionToSLBTSPageByImageLink() {
        productsPage.clickSLBTSImageLink();
        return new SauceLabsBoltTShirtSteps();
    }

    public SauceLabsFleeceJacketSteps transitionToSLFJPageByTitleLink() {
        productsPage.clickSLFJTitleLink();
        return new SauceLabsFleeceJacketSteps();
    }

    public SauceLabsFleeceJacketSteps transitionToSLFJPageByImageLink() {
        productsPage.clickSLFJImageLink();
        return new SauceLabsFleeceJacketSteps();
    }

    public SauceLabsOnesieSteps transitionToSLOPageByTitleLink() {
        productsPage.clickSLOTitleLink();
        return new SauceLabsOnesieSteps();
    }

    public SauceLabsOnesieSteps transitionToSLOPageByImageLink() {
        productsPage.clickSLOImageLink();
        return new SauceLabsOnesieSteps();
    }

    public TestallTheThingsTShirtSteps transitionToTATTTSPageByTitleLink() {
        productsPage.clickTATTTSTitleLink();
        return new TestallTheThingsTShirtSteps();
    }

    public TestallTheThingsTShirtSteps transitionToTATTTSPageByImageLink() {
        productsPage.clickTATTTSImageLink();
        return new TestallTheThingsTShirtSteps();
    }

    public void assertThatItemsNamesAreSortedInDescendingOrderCorrectly() {
        productsPage.assertThatItemsNamesAreSortedInDescendingOrderCorrectly();
    }

    public void assertThatItemsNamesAreSortedInAscendingOrderCorrectly() {
        productsPage.assertThatItemsNamesAreSortedInAscendingOrderCorrectly();
    }

    public void assertThatItemsPricesAreSortedInDescendingOrderCorrectly() {
        productsPage.assertThatItemsPricesAreSortedInDescendingOrderCorrectly();
    }

    public void assertThatItemsPricesAreSortedInAscendingOrderCorrectly() {
        productsPage.assertThatItemsPricesAreSortedInAscendingOrderCorrectly();
    }

    public void checkThatSLBRemoveButtonAppearedAndShoppingCartBadgeIsDisplaying() {
        productsPage.assertThatSLBRemoveButtonAppeared();
        productsPage.assertThatShoppingCartBadgeIsDisplayedCorrect();
    }

    public ProductsPageSteps removeSLBFromTheCartOnTheProductsPage() {
        productsPage.clickSLBRemoveButton();
        return new ProductsPageSteps();
    }

    public void checkThatSLBAddToCartButtonAppearedAndShoppingCartBadgeIsAbsent() {
        productsPage.assertThatSLBAddToCartButtonAppeared();
        productsPage.shoppingCartBadgeIsAbsent();
    }

    public ProductsPageSteps addSLBLToYourCart() {
        productsPage.clickSLBLAddToCartButton();
        return new ProductsPageSteps();
    }

    public void checkThatSLBLRemoveButtonAppearedAndShoppingCartBadgeIsDisplaying() {
        productsPage.assertThatSLBLRemoveButtonAppeared();
        productsPage.assertThatShoppingCartBadgeIsDisplayedCorrect();
    }

    public ProductsPageSteps removeSLBLFromTheCartOnTheProductsPage() {
        productsPage.clickSLBLRemoveButton();
        return new ProductsPageSteps();
    }

    public void checkThatSLBLAddToCartButtonAppearedAndShoppingCartBadgeIsAbsent() {
        productsPage.assertThatSLBLAddToCartButtonAppeared();
        productsPage.shoppingCartBadgeIsAbsent();
    }

    public ProductsPageSteps addSLBTSToYourCart() {
        productsPage.clickSLBTSAddToCartButton();
        return new ProductsPageSteps();
    }

    public void checkThatSLBTSRemoveButtonAppearedAndShoppingCartBadgeIsDisplaying() {
        productsPage.assertThatSLBTSRemoveButtonAppeared();
        productsPage.assertThatShoppingCartBadgeIsDisplayedCorrect();
    }

    public ProductsPageSteps removeSLBTSFromTheCartOnTheProductsPage() {
        productsPage.clickSLBTSRemoveButton();
        return new ProductsPageSteps();
    }

    public void checkThatSLBTSAddToCartButtonAppearedAndShoppingCartBadgeIsAbsent() {
        productsPage.assertThatSLBTSAddToCartButtonAppeared();
        productsPage.shoppingCartBadgeIsAbsent();
    }

    public ProductsPageSteps addSLFJToYourCart() {
        productsPage.clickSLFJAddToCartButton();
        return new ProductsPageSteps();
    }

    public ProductsPageSteps addSLOToYourCart() {
        productsPage.clickSLOAddToCartButton();
        return new ProductsPageSteps();
    }

    public ProductsPageSteps addTATTTSToYourCart() {
        productsPage.clickTATTTSAddToCartButton();
        return new ProductsPageSteps();
    }

    public void checkThatSLFJRemoveButtonAppearedAndShoppingCartBadgeIsDisplaying() {
        productsPage.assertThatSLFJRemoveButtonAppeared();
        productsPage.assertThatShoppingCartBadgeIsDisplayedCorrect();
    }

    public void checkThatSLORemoveButtonAppearedAndShoppingCartBadgeIsDisplaying() {
        productsPage.assertThatSLORemoveButtonAppeared();
        productsPage.assertThatShoppingCartBadgeIsDisplayedCorrect();
    }

    public void checkThatTATTTSRemoveButtonAppearedAndShoppingCartBadgeIsDisplaying() {
        productsPage.assertThatTATTTSRemoveButtonAppeared();
        productsPage.assertThatShoppingCartBadgeIsDisplayedCorrect();
    }

    public ProductsPageSteps removeSLFJFromTheCartOnTheProductsPage() {
        productsPage.clickSLFJRemoveButton();
        return new ProductsPageSteps();
    }

    public ProductsPageSteps removeSLOFromTheCartOnTheProductsPage() {
        productsPage.clickSLORemoveButton();
        return new ProductsPageSteps();
    }

    public ProductsPageSteps removeTATTTSFromTheCartOnTheProductsPage() {
        productsPage.clickTATTTSRemoveButton();
        return new ProductsPageSteps();
    }

    public void checkThatSLFJAddToCartButtonAppearedAndShoppingCartBadgeIsAbsent() {
        productsPage.assertThatSLFJAddToCartButtonAppeared();
        productsPage.shoppingCartBadgeIsAbsent();
    }

    public void checkThatSLOAddToCartButtonAppearedAndShoppingCartBadgeIsAbsent() {
        productsPage.assertThatSLOAddToCartButtonAppeared();
        productsPage.shoppingCartBadgeIsAbsent();
    }

    public void checkThatTATTTSAddToCartButtonAppearedAndShoppingCartBadgeIsAbsent() {
        productsPage.assertThatTATTTSAddToCartButtonAppeared();
        productsPage.shoppingCartBadgeIsAbsent();
    }

    public void assertThatTheCorrectUrlIsLoadedAfterClickingTwitterLink() {
        productsPage.clickTwitterLink();
        productsPage.checkTwitterUrl();
    }

    public void assertThatTheCorrectUrlIsLoadedAfterClickingFacebookLink() {
       productsPage.clickFacebookLink();
       productsPage.checkFacebookUrl();
    }

    public void assertThatTheCorrectUrlIsLoadedAfterClickingLinkedInLink() {
        productsPage.clickLinkedinLink();
        productsPage.checkLinkedinUrl();
    }

    public ProductsPageSteps addAllProductsToYourCart() {
        productsPage.clickSLBAddToCartButton();
        productsPage.clickSLBLAddToCartButton();
        productsPage.clickSLBTSAddToCartButton();
        productsPage.clickSLFJAddToCartButton();
        productsPage.clickSLOAddToCartButton();
        productsPage.clickTATTTSAddToCartButton();
        return new ProductsPageSteps();
    }

    public void checkThatAllRemoveButtonsAppearedAndShoppingCartBadgeIsDisplayingCorrectCount() {
        productsPage.assertThatAllRemoveButtonsAppeared();
        productsPage.assertThatShoppingCartBadgeIsDisplayedCorrectCount();
    }

    public void checkThatAllAddToCartButtonsAppeared() {
        productsPage.assertThatAllAddToCartButtonsAppeared();
    }
}
