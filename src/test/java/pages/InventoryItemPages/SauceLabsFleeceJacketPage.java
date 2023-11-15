package pages.InventoryItemPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.fail;

public class SauceLabsFleeceJacketPage extends BasePage {

    @FindBy(xpath = "//button[@id='back-to-products']")
    WebElement backToProductsButton;
    @FindBy(xpath = "//div/img[@alt='Sauce Labs Fleece Jacket']")
    WebElement SLFJImage;
    @FindBy(xpath = "//div/div[@class='inventory_details_name large_size']")
    WebElement SLFJTitleName;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
    WebElement SLFJAddToCartButton;
    @FindBy(xpath = "//button[@id='remove-sauce-labs-fleece-jacket']")
    WebElement SLFJRemoveButton;
    @FindBy(xpath = "//div/a/span[@class='shopping_cart_badge']")
    WebElement shoppingCartBadge;
    @FindBy(xpath = "//div/a[@class='shopping_cart_link']")
    WebElement cartLink;


    public void clickBackToProductsButton(){
        backToProductsButton.click();
    }

    public void assertThatSLFJImageIsDisplayed(){
        assertThat(SLFJImage.isDisplayed()).isTrue();
    }

    public void assertThatSLFJTitleNameIsCorrect(){
        assertThat(SLFJTitleName.getText()).isEqualTo("Sauce Labs Fleece Jacket");
    }

    public void clickSLFJAddToCartButton(){
        SLFJAddToCartButton.click();
    }

    public void clickSLFJRemoveButton(){
        SLFJRemoveButton.click();
    }

    public void assertThatSLFJRemoveButtonAppeared() {
        assertThat(SLFJRemoveButton.isDisplayed()).isTrue();
    }

    public void assertThatShoppingCartBadgeIsDisplayedCorrect() {
        assertThat(shoppingCartBadge.getText()).isEqualTo("1");
    }

    public void clickCartLink() {
        cartLink.click();
    }

    public void assertThatSLFJAddToCartButtonAppeared() {
        assertThat(SLFJAddToCartButton.isDisplayed()).isTrue();
    }

    public void shoppingCartBadgeIsAbsent() {
        try {
            shoppingCartBadge.isDisplayed();
            fail();
        } catch (Exception ignored){}
    }
}
