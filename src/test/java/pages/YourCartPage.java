package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.fail;

public class YourCartPage extends BasePage {
    @FindBy(xpath = "//div/a/span[@class='shopping_cart_badge']")
    WebElement shoppingCartBadge;
    @FindBy(xpath = "//div[@class='cart_item']")
    WebElement cartItem;
    @FindBy(xpath = "//div/button[@id='remove-sauce-labs-backpack']")
    WebElement SLBRemoveButton;
    @FindBy(xpath = "//button[@id='continue-shopping']")
    WebElement continueShoppingButton;
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkoutButton;
    @FindBy(xpath = "//a/div[@class='inventory_item_name']")
    WebElement itemName;
    @FindBy(xpath = "//div[@class='inventory_item_name' and text()='Sauce Labs Backpack']")
    WebElement SLBTitleLink;
    @FindBy(xpath = "//div[@class='inventory_item_name' and text()='Sauce Labs Bike Light']")
    WebElement SLBLTitleLink;
    @FindBy(xpath = "//div[@class='inventory_item_name' and text()='Sauce Labs Bolt T-Shirt']")
    WebElement SLBTSTitleLink;
    @FindBy(xpath = "//div[@class='inventory_item_name' and text()='Sauce Labs Fleece Jacket']")
    WebElement SLFJTitleLink;
    @FindBy(xpath = "//div[@class='inventory_item_name' and text()='Sauce Labs Onesie']")
    WebElement SLOTitleLink;
    @FindBy(xpath = "//div[@class='inventory_item_name' and text()='Test.allTheThings() T-Shirt (Red)']")
    WebElement TATTTSTitleLink;
    @FindBy(xpath = "//div/button[@id='remove-sauce-labs-bike-light']")
    WebElement SLBLRemoveButton;
    @FindBy(xpath = "//div/button[@id='remove-sauce-labs-bolt-t-shirt']")
    WebElement SLBTSRemoveButton;
    @FindBy(xpath = "//div/button[@id='remove-sauce-labs-fleece-jacket']")
    WebElement SLFJRemoveButton;
    @FindBy(xpath = "//div/button[@id='remove-sauce-labs-onesie']")
    WebElement SLORemoveButton;
    @FindBy(xpath = "//div/button[@id='remove-test.allthethings()-t-shirt-(red)']")
    WebElement TATTTSRemoveButton;

    public void cartItemListIsPresent(){
        assertThat(cartItem.isDisplayed()).isTrue();
    }

    public void clickSLBRemoveButton(){
        SLBRemoveButton.click();
    }

    public void clickSLBLRemoveButton(){
        SLBLRemoveButton.click();
    }

    public void clickSLBTSRemoveButton(){
        SLBTSRemoveButton.click();
    }

    public void clickSLFJRemoveButton(){
        SLFJRemoveButton.click();
    }

    public void clickSLORemoveButton(){
        SLORemoveButton.click();
    }

    public void clickTATTTSRemoveButton(){
        TATTTSRemoveButton.click();
    }

    public void clickContinueShoppingButton(){
        continueShoppingButton.click();
    }

    public void clickCheckoutButton(){
        checkoutButton.click();
    }

    public void assertThatSLBItemNameIsCorrect() {
        assertThat(itemName.getText()).isEqualTo("Sauce Labs Backpack");
    }

    public void assertThatSLBRemoveButtonIsDisplayed() {
        assertThat(SLBRemoveButton.isDisplayed()).isTrue();
    }

    public void assertThatSLBItemNameIsAbsent() {
        try {
            assertThat(itemName.getText()).isEqualTo("Sauce Labs Backpack");
            fail();
        } catch (Exception ignored){}
    }

    public void assertThatSLBRemoveButtonIsAbsent() {
        try {
            assertThat(SLBRemoveButton.isDisplayed()).isTrue();
            fail();
        } catch (Exception ignored){}
    }

    public void assertThatSLBLItemNameIsCorrect() {
        assertThat(itemName.getText()).isEqualTo("Sauce Labs Bike Light");
    }

    public void assertThatSLBLRemoveButtonIsDisplayed() {
        assertThat(SLBLRemoveButton.isDisplayed()).isTrue();
    }

    public void assertThatSLBLItemNameIsAbsent() {
        try {
            assertThat(itemName.getText()).isEqualTo("Sauce Labs Bike Light");
            fail();
        } catch (Exception ignored){}
    }

    public void assertThatSLBLRemoveButtonIsAbsent() {
        try {
            assertThat(SLBLRemoveButton.isDisplayed()).isTrue();
            fail();
        } catch (Exception ignored){}
    }

    public void assertThatSLBTSItemNameIsCorrect() {
        assertThat(itemName.getText()).isEqualTo("Sauce Labs Bolt T-Shirt");
    }

    public void assertThatSLBTSRemoveButtonIsDisplayed() {
        assertThat(SLBTSRemoveButton.isDisplayed()).isTrue();
    }

    public void assertThatSLBTSItemNameIsAbsent() {
        try {
            assertThat(itemName.getText()).isEqualTo("Sauce Labs Bolt T-Shirt");
            fail();
        } catch (Exception ignored){}
    }

    public void assertThatSLBTSRemoveButtonIsAbsent() {
        try {
            assertThat(SLBTSRemoveButton.isDisplayed()).isTrue();
            fail();
        } catch (Exception ignored){}
    }

    public void assertThatSLFJItemNameIsCorrect() {
        assertThat(itemName.getText()).isEqualTo("Sauce Labs Fleece Jacket");
    }

    public void assertThatSLOItemNameIsCorrect() {
        assertThat(itemName.getText()).isEqualTo("Sauce Labs Onesie");
    }

    public void assertThatTATTTSItemNameIsCorrect() {
        assertThat(itemName.getText()).isEqualTo("Test.allTheThings() T-Shirt (Red)");
    }

    public void assertThatSLFJRemoveButtonIsDisplayed() {
        assertThat(SLFJRemoveButton.isDisplayed()).isTrue();
    }

    public void assertThatSLORemoveButtonIsDisplayed() {
        assertThat(SLORemoveButton.isDisplayed()).isTrue();
    }

    public void assertThatTATTTSRemoveButtonIsDisplayed() {
        assertThat(TATTTSRemoveButton.isDisplayed()).isTrue();
    }

    public void assertThatSLFJItemNameIsAbsent() {
        try {
            assertThat(itemName.getText()).isEqualTo("Sauce Labs Fleece Jacket");
            fail();
        } catch (Exception ignored){}
    }

    public void assertThatSLOItemNameIsAbsent() {
        try {
            assertThat(itemName.getText()).isEqualTo("Sauce Labs Onesie");
            fail();
        } catch (Exception ignored){}
    }

    public void assertThatTATTTSItemNameIsAbsent() {
        try {
            assertThat(itemName.getText()).isEqualTo("Test.allTheThings() T-Shirt (Red)");
            fail();
        } catch (Exception ignored){}
    }

    public void assertThatSLFJRemoveButtonIsAbsent() {
        try {
            assertThat(SLFJRemoveButton.isDisplayed()).isTrue();
            fail();
        } catch (Exception ignored){}
    }

    public void assertThatSLORemoveButtonIsAbsent() {
        try {
            assertThat(SLORemoveButton.isDisplayed()).isTrue();
            fail();
        } catch (Exception ignored){}
    }

    public void assertThatTATTTSRemoveButtonIsAbsent() {
        try {
            assertThat(TATTTSRemoveButton.isDisplayed()).isTrue();
            fail();
        } catch (Exception ignored){}
    }

    public void assertThatAllRemoveButtonsAreDisplayed() {
        assertThat(SLBRemoveButton.isDisplayed()).isTrue();
        assertThat(SLBLRemoveButton.isDisplayed()).isTrue();
        assertThat(SLBTSRemoveButton.isDisplayed()).isTrue();
        assertThat(SLFJRemoveButton.isDisplayed()).isTrue();
        assertThat(SLORemoveButton.isDisplayed()).isTrue();
        assertThat(TATTTSRemoveButton.isDisplayed()).isTrue();
    }

    public void assertThatAllRemoveButtonsAreAbsent() {
        try {
            assertThat(SLBRemoveButton.isDisplayed()).isTrue();
            fail();
            assertThat(SLBLRemoveButton.isDisplayed()).isTrue();
            fail();
            assertThat(SLBTSRemoveButton.isDisplayed()).isTrue();
            fail();
            assertThat(SLFJRemoveButton.isDisplayed()).isTrue();
            fail();
            assertThat(SLORemoveButton.isDisplayed()).isTrue();
            fail();
            assertThat(TATTTSRemoveButton.isDisplayed()).isTrue();
            fail();
        } catch (Exception ignored){}
    }

    public void shoppingCartBadgeIsAbsent(){
        try {
            shoppingCartBadge.isDisplayed();
            fail();
        } catch (Exception ignored){}
    }

    public void clickSLBTitleLink(){
        SLBTitleLink.click();
    }

    public void clickSLBLTitleLink() {
        SLBLTitleLink.click();
    }

    public void clickSLBTSTitleLink() {
        SLBTSTitleLink.click();
    }

    public void clickSLFJTitleLink() {
        SLFJTitleLink.click();
    }

    public void clickSLOTitleLink() {
        SLOTitleLink.click();
    }

    public void clickTATTTSTitleLink() {
        TATTTSTitleLink.click();
    }
}
