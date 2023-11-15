package pages.InventoryItemPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.fail;

public class TestallTheThingsTShirtPage extends BasePage {

    @FindBy(xpath = "//button[@id='back-to-products']")
    WebElement backToProductsButton;
    @FindBy(xpath = "//div/img[@alt='Test.allTheThings() T-Shirt (Red)']")
    WebElement TATTTSImage;
    @FindBy(xpath = "//div/div[@class='inventory_details_name large_size']")
    WebElement TATTTSTitleName;
    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    WebElement TATTTSAddToCartButton;
    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    WebElement TATTTSRemoveButton;
    @FindBy(xpath = "//div/a/span[@class='shopping_cart_badge']")
    WebElement shoppingCartBadge;
    @FindBy(xpath = "//div/a[@class='shopping_cart_link']")
    WebElement cartLink;


    public void clickBackToProductsButton(){
        backToProductsButton.click();
    }

    public void assertThatTATTTSImageIsDisplayed(){
        assertThat(TATTTSImage.isDisplayed()).isTrue();
    }

    public void assertThatTATTTSTitleNameIsCorrect(){
        assertThat(TATTTSTitleName.getText()).isEqualTo("Test.allTheThings() T-Shirt (Red)");
    }

    public void clickTATTTSAddToCartButton(){
        TATTTSAddToCartButton.click();
    }

    public void clickTATTTSRemoveButton(){
        TATTTSRemoveButton.click();
    }

    public void assertThatTATTTSRemoveButtonAppeared() {
        assertThat(TATTTSRemoveButton.isDisplayed()).isTrue();
    }

    public void assertThatShoppingCartBadgeIsDisplayedCorrect() {
        assertThat(shoppingCartBadge.getText()).isEqualTo("1");
    }

    public void clickCartLink() {
        cartLink.click();
    }

    public void assertThatTATTTSAddToCartButtonAppeared() {
        assertThat(TATTTSAddToCartButton.isDisplayed()).isTrue();
    }

    public void shoppingCartBadgeIsAbsent() {
        try {
            shoppingCartBadge.isDisplayed();
            fail();
        } catch (Exception ignored){}
    }
}
