package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.InventoryItemSteps.*;
import steps.ProductsPageSteps;
import steps.YourCartSteps;

public class ProductsPageTest extends BaseTest {

    @BeforeMethod
    public void setUp() {
        visit("");
    }

    @Test(dataProvider = "validLoginCredentials")
    public void testLoginSuccess(String login, String password) {
        ProductsPageSteps steps1 = steps.doLogin(login, password);
        steps1.checkThatProductsPageIsDisplayed();
    }

    @Test (dataProvider = "credentialsForLogin")
    public void testTwitterLink(String login, String password) {
        ProductsPageSteps steps1 = steps.doLogin(login, password);
        steps1.assertThatTheCorrectUrlIsLoadedAfterClickingTwitterLink();
    }

    @Test (dataProvider = "credentialsForLogin")
    public void testFacebookLink(String login, String password) {
        ProductsPageSteps steps1 = steps.doLogin(login, password);
        steps1.assertThatTheCorrectUrlIsLoadedAfterClickingFacebookLink();
    }

    @Test (dataProvider = "credentialsForLogin")
    public void testLinkedInLink(String login, String password) {
        ProductsPageSteps steps1 = steps.doLogin(login, password);
        steps1.assertThatTheCorrectUrlIsLoadedAfterClickingLinkedInLink();
    }

    @Test (dataProvider = "credentialsForLogin")
    public void testVisitSLBPageAfterClickingTitleLink(String login, String password) {
        ProductsPageSteps steps1 = steps.doLogin(login, password);
        SauceLabsBackpackSteps toSLBPageByTitleLink = steps1.transitionToSLBPageByTitleLink();
        toSLBPageByTitleLink.assertThatSLBPageIsLoaded();
    }

    @Test (dataProvider = "credentialsForLogin")
    public void testVisitSLBPageAfterClickingImageLink(String login, String password) {
        ProductsPageSteps steps1 = steps.doLogin(login, password);
        SauceLabsBackpackSteps toSLBPageByImageLink = steps1.transitionToSLBPageByImageLink();
        toSLBPageByImageLink.assertThatSLBPageIsLoaded();
    }

    @Test (dataProvider = "credentialsForLogin")
    public void testVisitSLBLPageAfterClickingTitleLink(String login, String password) {
        ProductsPageSteps steps1 = steps.doLogin(login, password);
        SauceLabsBikeLightSteps toSLBLPageByTitleLink = steps1.transitionToSLBLPageByTitleLink();
        toSLBLPageByTitleLink.assertThatSLBLPageIsLoaded();
    }

    @Test (dataProvider = "credentialsForLogin")
    public void testVisitSLBLPageAfterClickingImageLink(String login, String password) {
        ProductsPageSteps steps1 = steps.doLogin(login, password);
        SauceLabsBikeLightSteps toSLBLPageByImageLink = steps1.transitionToSLBLPageByImageLink();
        toSLBLPageByImageLink.assertThatSLBLPageIsLoaded();
    }

    @Test (dataProvider = "credentialsForLogin")
    public void testVisitSLBTSPageAfterClickingTitleLink(String login, String password) {
        ProductsPageSteps steps1 = steps.doLogin(login, password);
        SauceLabsBoltTShirtSteps toSLBTSPageByTitleLink = steps1.transitionToSLBTSPageByTitleLink();
        toSLBTSPageByTitleLink.assertThatSLBTSPageIsLoaded();
    }

    @Test (dataProvider = "credentialsForLogin")
    public void testVisitSLBTSPageAfterClickingImageLink(String login, String password) {
        ProductsPageSteps steps1 = steps.doLogin(login, password);
        SauceLabsBoltTShirtSteps toSLBTSPageByImageLink = steps1.transitionToSLBTSPageByImageLink();
        toSLBTSPageByImageLink.assertThatSLBTSPageIsLoaded();
    }

    @Test (dataProvider = "credentialsForLogin")
    public void testVisitSLFJPageAfterClickingTitleLink(String login, String password) {
        ProductsPageSteps steps1 = steps.doLogin(login, password);
        SauceLabsFleeceJacketSteps toSLFJPageByTitleLink = steps1.transitionToSLFJPageByTitleLink();
        toSLFJPageByTitleLink.assertThatSLFJPageIsLoaded();
    }

    @Test (dataProvider = "credentialsForLogin")
    public void testVisitSLFJPageAfterClickingImageLink(String login, String password) {
        ProductsPageSteps steps1 = steps.doLogin(login, password);
        SauceLabsFleeceJacketSteps toSLFJPageByImageLink = steps1.transitionToSLFJPageByImageLink();
        toSLFJPageByImageLink.assertThatSLFJPageIsLoaded();
    }

    @Test (dataProvider = "credentialsForLogin")
    public void testVisitSLOPageAfterClickingTitleLink(String login, String password) {
        ProductsPageSteps steps1 = steps.doLogin(login, password);
        SauceLabsOnesieSteps toSLOPageByTitleLink = steps1.transitionToSLOPageByTitleLink();
        toSLOPageByTitleLink.assertThatSLOPageIsLoaded();
    }

    @Test (dataProvider = "credentialsForLogin")
    public void testVisitSLOPageAfterClickingImageLink(String login, String password) {
        ProductsPageSteps steps1 = steps.doLogin(login, password);
        SauceLabsOnesieSteps toSLOPageByImageLink = steps1.transitionToSLOPageByImageLink();
        toSLOPageByImageLink.assertThatSLOPageIsLoaded();
    }

    @Test (dataProvider = "credentialsForLogin")
    public void testVisitTATTTSPageAfterClickingTitleLink(String login, String password) {
        ProductsPageSteps steps1 = steps.doLogin(login, password);
        TestallTheThingsTShirtSteps toTATTTSPageByTitleLink = steps1.transitionToTATTTSPageByTitleLink();
        toTATTTSPageByTitleLink.assertThatTATTTSPageIsLoaded();
    }

    @Test (dataProvider = "credentialsForLogin")
    public void testVisitTATTTSPageAfterClickingImageLink(String login, String password) {
        ProductsPageSteps steps1 = steps.doLogin(login, password);
        TestallTheThingsTShirtSteps toTATTTSPageByImageLink = steps1.transitionToTATTTSPageByImageLink();
        toTATTTSPageByImageLink.assertThatTATTTSPageIsLoaded();
    }

    @Test (dataProvider = "credentialsForLogin")
    public void testSortingItemsNamesInDescendingOrder(String login, String password) {
        ProductsPageSteps steps1 = steps.doLogin(login, password);
        ProductsPageSteps namesInDescendingOrder = steps1.sortingNamesInDescendingOrder();
        namesInDescendingOrder.assertThatItemsNamesAreSortedInDescendingOrderCorrectly();
    }

    @Test (dataProvider = "credentialsForLogin")
    public void testSortingItemsNamesInAscendingOrder(String login, String password) {
        ProductsPageSteps steps1 = steps.doLogin(login, password);
        ProductsPageSteps namesInAscendingOrder = steps1.sortingNamesInAscendingOrder();
        namesInAscendingOrder.assertThatItemsNamesAreSortedInAscendingOrderCorrectly();
    }

    @Test (dataProvider = "credentialsForLogin")
    public void testSortingItemsPricesInDescendingOrder(String login, String password) {
        ProductsPageSteps steps1 = steps.doLogin(login, password);
        ProductsPageSteps pricesInDescendingOrder = steps1.sortingPricesInDescendingOrder();
        pricesInDescendingOrder.assertThatItemsPricesAreSortedInDescendingOrderCorrectly();
    }

    @Test (dataProvider = "credentialsForLogin")
    public void testSortingItemsPricesInAscendingOrder(String login, String password) {
        ProductsPageSteps steps1 = steps.doLogin(login, password);
        ProductsPageSteps pricesInAscendingOrder = steps1.sortingPricesInAscendingOrder();
        pricesInAscendingOrder.assertThatItemsPricesAreSortedInAscendingOrderCorrectly();
    }

    @Test (dataProvider = "credentialsForLogin")
    public void testAddingAndRemovingSLBOnTheProductsPage(String login, String password) {
        ProductsPageSteps steps1 = steps.doLogin(login, password);
        ProductsPageSteps addSLBToCart = steps1.addSLBToYourCart();
        addSLBToCart.checkThatSLBRemoveButtonAppearedAndShoppingCartBadgeIsDisplaying();
        YourCartSteps theYourCartPage = addSLBToCart.transitionToTheYourCartPage();
        theYourCartPage.checkThatItemSLBIsPresentInTheCart();
        ProductsPageSteps productsPageSteps = theYourCartPage.backToTheProductsPageAfterClickTheContinueShoppingButton();
        ProductsPageSteps removeSLBFromTheCart = productsPageSteps.removeSLBFromTheCartOnTheProductsPage();
        removeSLBFromTheCart.checkThatSLBAddToCartButtonAppearedAndShoppingCartBadgeIsAbsent();
        YourCartSteps finalCheckCart = removeSLBFromTheCart.transitionToTheYourCartPage();
        finalCheckCart.checkThatItemSLBIsAbsentInTheCart();
    }

    @Test (dataProvider = "credentialsForLogin")
    public void testAddingAndRemovingSLBLOnTheProductsPage(String login, String password) {
        ProductsPageSteps steps1 = steps.doLogin(login, password);
        ProductsPageSteps addSLBLToCart = steps1.addSLBLToYourCart();
        addSLBLToCart.checkThatSLBLRemoveButtonAppearedAndShoppingCartBadgeIsDisplaying();
        YourCartSteps theYourCartPage = addSLBLToCart.transitionToTheYourCartPage();
        theYourCartPage.checkThatItemSLBLIsPresentInTheCart();
        ProductsPageSteps productsPageSteps = theYourCartPage.backToTheProductsPageAfterClickTheContinueShoppingButton();
        ProductsPageSteps removeSLBLFromTheCart = productsPageSteps.removeSLBLFromTheCartOnTheProductsPage();
        removeSLBLFromTheCart.checkThatSLBLAddToCartButtonAppearedAndShoppingCartBadgeIsAbsent();
        YourCartSteps finalCheckCart = removeSLBLFromTheCart.transitionToTheYourCartPage();
        finalCheckCart.checkThatSLBLItemIsAbsentInTheCart();
    }

    @Test (dataProvider = "credentialsForLogin")
    public void testAddingAndRemovingSLBTSOnTheProductsPage(String login, String password) {
        ProductsPageSteps steps1 = steps.doLogin(login, password);
        ProductsPageSteps addSLBTSToCart = steps1.addSLBTSToYourCart();
        addSLBTSToCart.checkThatSLBTSRemoveButtonAppearedAndShoppingCartBadgeIsDisplaying();
        YourCartSteps theYourCartPage = addSLBTSToCart.transitionToTheYourCartPage();
        theYourCartPage.checkThatSLBTSItemIsPresentInTheCart();
        ProductsPageSteps productsPageSteps = theYourCartPage.backToTheProductsPageAfterClickTheContinueShoppingButton();
        ProductsPageSteps removeSLBTSFromTheCart = productsPageSteps.removeSLBTSFromTheCartOnTheProductsPage();
        removeSLBTSFromTheCart.checkThatSLBTSAddToCartButtonAppearedAndShoppingCartBadgeIsAbsent();
        YourCartSteps finalCheckCart = removeSLBTSFromTheCart.transitionToTheYourCartPage();
        finalCheckCart.checkThatSLBTSItemIsAbsentInTheCart();
    }

    @Test (dataProvider = "credentialsForLogin")
    public void testAddingAndRemovingSLFJOnTheProductsPage(String login, String password) {
        ProductsPageSteps steps1 = steps.doLogin(login, password);
        ProductsPageSteps addSLFJToCart = steps1.addSLFJToYourCart();
        addSLFJToCart.checkThatSLFJRemoveButtonAppearedAndShoppingCartBadgeIsDisplaying();
        YourCartSteps theYourCartPage = addSLFJToCart.transitionToTheYourCartPage();
        theYourCartPage.checkThatSLFJItemIsPresentInTheCart();
        ProductsPageSteps productsPageSteps = theYourCartPage.backToTheProductsPageAfterClickTheContinueShoppingButton();
        ProductsPageSteps removeSLFJFromTheCart = productsPageSteps.removeSLFJFromTheCartOnTheProductsPage();
        removeSLFJFromTheCart.checkThatSLFJAddToCartButtonAppearedAndShoppingCartBadgeIsAbsent();
        YourCartSteps finalCheckCart = removeSLFJFromTheCart.transitionToTheYourCartPage();
        finalCheckCart.checkThatSLFJItemIsAbsentInTheCart();
    }

    @Test (dataProvider = "credentialsForLogin")
    public void testAddingAndRemovingSLOOnTheProductsPage(String login, String password) {
        ProductsPageSteps steps1 = steps.doLogin(login, password);
        ProductsPageSteps addSLOToCart = steps1.addSLOToYourCart();
        addSLOToCart.checkThatSLORemoveButtonAppearedAndShoppingCartBadgeIsDisplaying();
        YourCartSteps theYourCartPage = addSLOToCart.transitionToTheYourCartPage();
        theYourCartPage.checkThatSLOItemIsPresentInTheCart();
        ProductsPageSteps productsPageSteps = theYourCartPage.backToTheProductsPageAfterClickTheContinueShoppingButton();
        ProductsPageSteps removeSLOFromTheCart = productsPageSteps.removeSLOFromTheCartOnTheProductsPage();
        removeSLOFromTheCart.checkThatSLOAddToCartButtonAppearedAndShoppingCartBadgeIsAbsent();
        YourCartSteps finalCheckCart = removeSLOFromTheCart.transitionToTheYourCartPage();
        finalCheckCart.checkThatSLOItemIsAbsentInTheCart();
    }

    @Test (dataProvider = "credentialsForLogin")
    public void testAddingAndRemovingTATTTSOnTheProductsPage(String login, String password) {
        ProductsPageSteps steps1 = steps.doLogin(login, password);
        ProductsPageSteps addTATTTSToCart = steps1.addTATTTSToYourCart();
        addTATTTSToCart.checkThatTATTTSRemoveButtonAppearedAndShoppingCartBadgeIsDisplaying();
        YourCartSteps theYourCartPage = addTATTTSToCart.transitionToTheYourCartPage();
        theYourCartPage.checkThatTATTTSItemIsPresentInTheCart();
        ProductsPageSteps productsPageSteps = theYourCartPage.backToTheProductsPageAfterClickTheContinueShoppingButton();
        ProductsPageSteps removeTATTTSFromTheCart = productsPageSteps.removeTATTTSFromTheCartOnTheProductsPage();
        removeTATTTSFromTheCart.checkThatTATTTSAddToCartButtonAppearedAndShoppingCartBadgeIsAbsent();
        YourCartSteps finalCheckCart = removeTATTTSFromTheCart.transitionToTheYourCartPage();
        finalCheckCart.checkThatTATTTStemIsAbsentInTheCart();
    }

    @Test (dataProvider = "credentialsForLogin")
    public void testAddingAllProductsForOnceAndDeletingAllProductsFromCart(String login, String password) {
        ProductsPageSteps steps1 = steps.doLogin(login, password);
        ProductsPageSteps allProductsAreAdded = steps1.addAllProductsToYourCart();
        allProductsAreAdded.checkThatAllRemoveButtonsAppearedAndShoppingCartBadgeIsDisplayingCorrectCount();
        YourCartSteps theYourCartPage = allProductsAreAdded.transitionToTheYourCartPage();
        theYourCartPage.checkThatAllProductsArePresentInCart();
        theYourCartPage.removeAllProductsFromTheCart();
        theYourCartPage.checkThatAllProductsAreAbsentInCart();
        ProductsPageSteps productsPageSteps = theYourCartPage.backToTheProductsPageAfterClickTheContinueShoppingButton();
        productsPageSteps.checkThatAllAddToCartButtonsAppeared();
    }
}