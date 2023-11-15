package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.fail;

public class ProductsPage extends BasePage {
    @FindBy(xpath = "//a/div[@class='inventory_item_name']")
    List<WebElement> inventoryItemNames;
    @FindBy(xpath = "//div[@class='inventory_item_price']")
    List<WebElement> inventoryItemPrices;
    @FindBy(xpath = "//div[@class='inventory_list']")
    WebElement inventoryList;
    @FindBy(xpath = "//div/button[@id='react-burger-menu-btn']")
    WebElement burgerMenuButton;
    @FindBy(xpath = "//nav/a[@id='logout_sidebar_link' and @tabindex='0']")
    WebElement visibleLogoutLink;
    @FindBy(xpath = "//div/a[@class='shopping_cart_link']")
    WebElement cartLink;
    @FindBy(xpath = "//div/a/span[@class='shopping_cart_badge']")
    WebElement shoppingCartBadge;
    @FindBy(xpath = "//select/option[@value='az']")
    WebElement azSelect;
    @FindBy(xpath = "//select/option[@value='za']")
    WebElement zaSelect;
    @FindBy(xpath = "//select/option[@value='lohi']")
    WebElement lohiSelect;
    @FindBy(xpath = "//select/option[@value='hilo']")
    WebElement hiloSelect;
    @FindBy(xpath = "//div/a[@id='item_4_img_link']")
    WebElement SLBImageLink;
    @FindBy(xpath = "//div/a[@id='item_4_title_link']")
    WebElement SLBTitleLink;
    @FindBy(xpath = "//div/button[@id='add-to-cart-sauce-labs-backpack']")
    WebElement SLBAddToCartButton;
    @FindBy(xpath = "//div/button[@id='remove-sauce-labs-backpack']")
    WebElement SLBRemoveButton;
    @FindBy(xpath = "//div/a[@id='item_0_img_link']")
    WebElement SLBLImageLink;
    @FindBy(xpath = "//div/a[@id='item_0_title_link']")
    WebElement SLBLTitleLink;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
    WebElement SLBLAddToCartButton;
    @FindBy(xpath = "//button[@id='remove-sauce-labs-bike-light']")
    WebElement SLBLRemoveButton;
    @FindBy(xpath = "//div/a[@id='item_1_img_link']")
    WebElement SLBTSImageLink;
    @FindBy(xpath = "//div/a[@id='item_1_title_link']")
    WebElement SLBTSTitleLink;
    @FindBy(xpath = "//div/button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
    WebElement SLBTSAddToCartButton;
    @FindBy(xpath = "//div/button[@id='remove-sauce-labs-bolt-t-shirt']")
    WebElement SLBTSRemoveButton;
    @FindBy(xpath = "//div/a[@id='item_5_img_link']")
    WebElement SLFJImageLink;
    @FindBy(xpath = "//div/a[@id='item_5_title_link']")
    WebElement SLFJTitleLink;
    @FindBy(xpath = "//div/button[@id='add-to-cart-sauce-labs-fleece-jacket']")
    WebElement SLFJAddToCartButton;
    @FindBy(xpath = "//div/button[@id='remove-sauce-labs-fleece-jacket']")
    WebElement SLFJRemoveButton;
    @FindBy(xpath = "//div/a[@id='item_2_img_link']")
    WebElement SLOImageLink;
    @FindBy(xpath = "//div/a[@id='item_2_title_link']")
    WebElement SLOTitleLink;
    @FindBy(xpath = "//div/button[@id='add-to-cart-sauce-labs-onesie']")
    WebElement SLOAddToCartButton;
    @FindBy(xpath = "//div/button[@id='remove-sauce-labs-onesie']")
    WebElement SLORemoveButton;
    @FindBy(xpath = "//div/a[@id='item_3_img_link']")
    WebElement TATTTSImageLink;
    @FindBy(xpath = "//div/a[@id='item_3_title_link']")
    WebElement TATTTSTitleLink;
    @FindBy(xpath = "//div/button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    WebElement TATTTSAddToCartButton;
    @FindBy(xpath = "//div/button[@id='remove-test.allthethings()-t-shirt-(red)']")
    WebElement TATTTSRemoveButton;
    @FindBy(xpath = "//*[@id='page_wrapper']/footer/ul/li[1]/a")
    WebElement twitterLink;
    @FindBy(xpath = "//*[@id='page_wrapper']/footer/ul/li[2]/a")
    WebElement facebookLink;
    @FindBy(xpath = "//*[@id='page_wrapper']/footer/ul/li[3]/a")
    WebElement linkedinLink;


    public void inventoryListIsPresent(){
        assertThat(inventoryList.isDisplayed()).isTrue();
    }

    public void clickBurgerMenuButton(){
        burgerMenuButton.click();
    }

    public void clickCartLink(){
        cartLink.click();
    }

    public void shoppingCartBadgeIsPresent(){
        assertThat(shoppingCartBadge.isDisplayed()).isTrue();
    }

    public void shoppingCartBadgeIsAbsent(){
        try {
            shoppingCartBadge.isDisplayed();
            fail();
        } catch (Exception ignored){}
    }

    public void clickA_ZSort(){
        azSelect.click();
    }

    public void clickZ_ASort(){
        zaSelect.click();
    }

    public void click0_9Sort(){
        lohiSelect.click();
    }

    public void click9_0Sort(){
        hiloSelect.click();
    }

    public void clickSLBImageLink(){
        SLBImageLink.click();
    }

    public void clickSLBTitleLink(){
        SLBTitleLink.click();
    }

    public void clickSLBAddToCartButton(){
        SLBAddToCartButton.click();
    }

    public void clickSLBRemoveButton(){
        SLBRemoveButton.click();
    }

    public void clickSLBLImageLink(){
        SLBLImageLink.click();
    }

    public void clickSLBLTitleLink(){
        SLBLTitleLink.click();
    }

    public void clickSLBLAddToCartButton(){
        SLBLAddToCartButton.click();
    }

    public void clickSLBLRemoveButton(){
        SLBLRemoveButton.click();
    }

    public void clickSLBTSImageLink(){
        SLBTSImageLink.click();
    }

    public void clickSLBTSTitleLink(){
        SLBTSTitleLink.click();
    }

    public void clickSLBTSAddToCartButton(){
        SLBTSAddToCartButton.click();
    }

    public void clickSLBTSRemoveButton(){
        SLBTSRemoveButton.click();
    }

    public void clickSLFJImageLink(){
        SLFJImageLink.click();
    }

    public void clickSLFJTitleLink(){
        SLFJTitleLink.click();
    }

    public void clickSLFJAddToCartButton(){
        SLFJAddToCartButton.click();
    }

    public void clickSLFJRemoveButton(){
        SLFJRemoveButton.click();
    }

    public void clickSLOImageLink(){
        SLOImageLink.click();
    }

    public void clickSLOTitleLink(){
        SLOTitleLink.click();
    }

    public void clickSLOAddToCartButton(){
        SLOAddToCartButton.click();
    }

    public void clickSLORemoveButton(){
        SLORemoveButton.click();
    }

    public void clickTATTTSImageLink(){
        TATTTSImageLink.click();
    }

    public void clickTATTTSTitleLink(){
        TATTTSTitleLink.click();
    }

    public void clickTATTTSAddToCartButton(){
        TATTTSAddToCartButton.click();
    }

    public void clickTATTTSRemoveButton(){
        TATTTSRemoveButton.click();
    }

    public void clickTwitterLink(){
        twitterLink.click();
    }

    public void checkTwitterUrl(){
        String mainWindowHandle = driver.getWindowHandle();

        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        assertThat(driver.getCurrentUrl()).isEqualTo("https://twitter.com/saucelabs");
        driver.close();
        driver.switchTo().window(mainWindowHandle);
    }

    public void clickFacebookLink(){
        facebookLink.click();
    }

    public void checkFacebookUrl(){
        String mainWindowHandle = driver.getWindowHandle();

        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        assertThat(driver.getCurrentUrl()).isEqualTo("https://www.facebook.com/saucelabs");
        driver.close();
        driver.switchTo().window(mainWindowHandle);
    }

    public void clickLinkedinLink(){
        linkedinLink.click();
    }

    public void checkLinkedinUrl(){
        String mainWindowHandle = driver.getWindowHandle();

        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        assertThat(driver.getCurrentUrl()).isEqualTo("https://www.linkedin.com/company/sauce-labs/");
        driver.close();
        driver.switchTo().window(mainWindowHandle);
    }

    public void assertThatItemsNamesAreSortedInDescendingOrderCorrectly(){
        List<String> originalItemNamesListFromPage = new ArrayList<>();

        for (WebElement item : inventoryItemNames) {
            originalItemNamesListFromPage.add(item.getText());
        }

        List<String> sortedItemNamesInDescendingAlphabeticalOrder = new ArrayList<>(originalItemNamesListFromPage);
        sortedItemNamesInDescendingAlphabeticalOrder.sort(Collections.reverseOrder());

        assertThat(originalItemNamesListFromPage).isEqualTo(sortedItemNamesInDescendingAlphabeticalOrder);
    }

    public void assertThatItemsNamesAreSortedInAscendingOrderCorrectly() {
        List<String> originalItemNamesListFromPage = new ArrayList<>();

        for (WebElement item : inventoryItemNames) {
            originalItemNamesListFromPage.add(item.getText());
        }

        List<String> sortedItemNamesInAlphabeticalOrder = new ArrayList<>(originalItemNamesListFromPage);
        Collections.sort(sortedItemNamesInAlphabeticalOrder);

        assertThat(originalItemNamesListFromPage).isEqualTo(sortedItemNamesInAlphabeticalOrder);
    }

    public void assertThatItemsPricesAreSortedInDescendingOrderCorrectly(){
        List<String> originalItemsPricesListFromPage = new ArrayList<>();

        for (WebElement item : inventoryItemPrices) {
            originalItemsPricesListFromPage.add(item.getText());
        }

        List<Double> originalItemsPricesList = new ArrayList<>(originalItemsPricesListFromPage.stream()
                .map(price -> Double.parseDouble(price.replace("$", "")))
                .toList());

        List<Double> sortedItemsPricesInDescendingOrder = new ArrayList<>(originalItemsPricesList);
        sortedItemsPricesInDescendingOrder.sort(Collections.reverseOrder());

        assertThat(originalItemsPricesList).isEqualTo(sortedItemsPricesInDescendingOrder);
    }

    public void assertThatItemsPricesAreSortedInAscendingOrderCorrectly(){
        List<String> originalItemsPricesListFromPage = new ArrayList<>();

        for (WebElement item : inventoryItemPrices) {
            originalItemsPricesListFromPage.add(item.getText());
        }

        List<Double> originalItemsPricesList = new ArrayList<>(originalItemsPricesListFromPage.stream()
                .map(price -> Double.parseDouble(price.replace("$", "")))
                .toList());

        List<Double> sortedItemsPricesInAscendingOrder = new ArrayList<>(originalItemsPricesList);
        Collections.sort(sortedItemsPricesInAscendingOrder);

        assertThat(originalItemsPricesList).isEqualTo(sortedItemsPricesInAscendingOrder);
    }

    public void assertThatSLBRemoveButtonAppeared() {
        assertThat(SLBRemoveButton.isDisplayed()).isTrue();
    }

    public void assertThatShoppingCartBadgeIsDisplayedCorrect() {
        assertThat(shoppingCartBadge.getText()).isEqualTo("1");
    }

    public void assertThatSLBAddToCartButtonAppeared() {
        assertThat(SLBAddToCartButton.isDisplayed()).isTrue();
    }

    public void assertThatSLBLRemoveButtonAppeared() {
        assertThat(SLBLRemoveButton.isDisplayed()).isTrue();
    }

    public void assertThatSLBLAddToCartButtonAppeared() {
        assertThat(SLBLAddToCartButton.isDisplayed()).isTrue();
    }

    public void assertThatSLBTSRemoveButtonAppeared() {
        assertThat(SLBTSRemoveButton.isDisplayed()).isTrue();
    }

    public void assertThatSLBTSAddToCartButtonAppeared() {
        assertThat(SLBTSAddToCartButton.isDisplayed()).isTrue();
    }

    public void assertThatSLFJRemoveButtonAppeared() {
        assertThat(SLFJRemoveButton.isDisplayed()).isTrue();
    }

    public void assertThatSLORemoveButtonAppeared() {
        assertThat(SLORemoveButton.isDisplayed()).isTrue();
    }

    public void assertThatTATTTSRemoveButtonAppeared() {
        assertThat(TATTTSRemoveButton.isDisplayed()).isTrue();
    }

    public void assertThatSLFJAddToCartButtonAppeared() {
        assertThat(SLFJAddToCartButton.isDisplayed()).isTrue();
    }

    public void assertThatSLOAddToCartButtonAppeared() {
        assertThat(SLOAddToCartButton.isDisplayed()).isTrue();
    }

    public void assertThatTATTTSAddToCartButtonAppeared() {
        assertThat(TATTTSAddToCartButton.isDisplayed()).isTrue();
    }

    public void assertThatAllRemoveButtonsAppeared() {
        assertThat(SLBRemoveButton.isDisplayed()).isTrue();
        assertThat(SLBLRemoveButton.isDisplayed()).isTrue();
        assertThat(SLBTSRemoveButton.isDisplayed()).isTrue();
        assertThat(SLFJRemoveButton.isDisplayed()).isTrue();
        assertThat(SLORemoveButton.isDisplayed()).isTrue();
        assertThat(TATTTSRemoveButton.isDisplayed()).isTrue();
    }

    public void assertThatShoppingCartBadgeIsDisplayedCorrectCount() {
        assertThat(shoppingCartBadge.getText()).isEqualTo("6");
    }

    public void assertThatAllAddToCartButtonsAppeared() {
        assertThat(SLBAddToCartButton.isDisplayed()).isTrue();
        assertThat(SLBLAddToCartButton.isDisplayed()).isTrue();
        assertThat(SLBTSAddToCartButton.isDisplayed()).isTrue();
        assertThat(SLFJAddToCartButton.isDisplayed()).isTrue();
        assertThat(SLOAddToCartButton.isDisplayed()).isTrue();
        assertThat(TATTTSAddToCartButton.isDisplayed()).isTrue();
    }

    public void clickVisibleLogoutLink(){
        visibleLogoutLink.click();
    }
}