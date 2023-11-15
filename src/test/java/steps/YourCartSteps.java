package steps;

import pages.YourCartPage;
import steps.InventoryItemSteps.*;

public class YourCartSteps {

    YourCartPage yourCartPage = new YourCartPage();

    public void checkThatCartItemListIsPresent(){
        yourCartPage.cartItemListIsPresent();
    }

    public CheckoutYourInformationSteps transitionToTheCheckoutYourInformationPage() {
        yourCartPage.clickCheckoutButton();
        return new CheckoutYourInformationSteps();
    }

    public void checkThatItemSLBIsPresentInTheCart() {
        yourCartPage.assertThatSLBItemNameIsCorrect();
        yourCartPage.assertThatSLBRemoveButtonIsDisplayed();
    }

    public ProductsPageSteps backToTheProductsPageAfterClickTheContinueShoppingButton() {
        yourCartPage.clickContinueShoppingButton();
        return new ProductsPageSteps();
    }

    public void checkThatItemSLBIsAbsentInTheCart() {
        yourCartPage.assertThatSLBItemNameIsAbsent();
        yourCartPage.assertThatSLBRemoveButtonIsAbsent();
    }

    public void checkThatItemSLBLIsPresentInTheCart() {
        yourCartPage.assertThatSLBLItemNameIsCorrect();
        yourCartPage.assertThatSLBLRemoveButtonIsDisplayed();
    }

    public void checkThatSLBLItemIsAbsentInTheCart() {
        yourCartPage.assertThatSLBLItemNameIsAbsent();
        yourCartPage.assertThatSLBLRemoveButtonIsAbsent();
    }

    public void checkThatSLBTSItemIsPresentInTheCart() {
        yourCartPage.assertThatSLBTSItemNameIsCorrect();
        yourCartPage.assertThatSLBTSRemoveButtonIsDisplayed();
    }

    public void checkThatSLBTSItemIsAbsentInTheCart() {
        yourCartPage.assertThatSLBTSItemNameIsAbsent();
        yourCartPage.assertThatSLBTSRemoveButtonIsAbsent();
    }

    public void checkThatSLFJItemIsPresentInTheCart() {
        yourCartPage.assertThatSLFJItemNameIsCorrect();
        yourCartPage.assertThatSLFJRemoveButtonIsDisplayed();
    }

    public void checkThatSLOItemIsPresentInTheCart() {
        yourCartPage.assertThatSLOItemNameIsCorrect();
        yourCartPage.assertThatSLORemoveButtonIsDisplayed();
    }

    public void checkThatTATTTSItemIsPresentInTheCart() {
        yourCartPage.assertThatTATTTSItemNameIsCorrect();
        yourCartPage.assertThatTATTTSRemoveButtonIsDisplayed();
    }

    public void checkThatSLFJItemIsAbsentInTheCart() {
        yourCartPage.assertThatSLFJItemNameIsAbsent();
        yourCartPage.assertThatSLFJRemoveButtonIsAbsent();
    }

    public void checkThatSLOItemIsAbsentInTheCart() {
        yourCartPage.assertThatSLOItemNameIsAbsent();
        yourCartPage.assertThatSLORemoveButtonIsAbsent();
    }

    public void checkThatTATTTStemIsAbsentInTheCart() {
        yourCartPage.assertThatTATTTSItemNameIsAbsent();
        yourCartPage.assertThatTATTTSRemoveButtonIsAbsent();
    }

    public void checkThatAllProductsArePresentInCart() {
        yourCartPage.assertThatAllRemoveButtonsAreDisplayed();
    }

    public void removeAllProductsFromTheCart() {
        yourCartPage.clickSLBRemoveButton();
        yourCartPage.clickSLBLRemoveButton();
        yourCartPage.clickSLBTSRemoveButton();
        yourCartPage.clickSLFJRemoveButton();
        yourCartPage.clickSLORemoveButton();
        yourCartPage.clickTATTTSRemoveButton();
    }

    public void checkThatAllProductsAreAbsentInCart() {
        yourCartPage.assertThatAllRemoveButtonsAreAbsent();
        yourCartPage.shoppingCartBadgeIsAbsent();

    }

    public SauceLabsBackpackSteps transitionToSLBPageByTitleLink() {
        yourCartPage.clickSLBTitleLink();
        return new SauceLabsBackpackSteps();
    }

    public SauceLabsBikeLightSteps transitionToSLBLPageByTitleLink() {
        yourCartPage.clickSLBLTitleLink();
        return new SauceLabsBikeLightSteps();
    }

    public SauceLabsBoltTShirtSteps transitionToSLBTSPageByTitleLink() {
        yourCartPage.clickSLBTSTitleLink();
        return new SauceLabsBoltTShirtSteps();
    }

    public SauceLabsFleeceJacketSteps transitionToSLFJPageByTitleLink() {
        yourCartPage.clickSLFJTitleLink();
        return new SauceLabsFleeceJacketSteps();
    }

    public SauceLabsOnesieSteps transitionToSLOPageByTitleLink() {
        yourCartPage.clickSLOTitleLink();
        return new SauceLabsOnesieSteps();
    }

    public TestallTheThingsTShirtSteps transitionToTATTTSPageByTitleLink() {
        yourCartPage.clickTATTTSTitleLink();
        return new TestallTheThingsTShirtSteps();
    }
}
