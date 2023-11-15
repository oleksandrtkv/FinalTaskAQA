package pages.InventoryItemPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.fail;

public class SauceLabsOnesiePage extends BasePage {

    @FindBy(xpath = "//button[@id='back-to-products']")
    WebElement backToProductsButton;
    @FindBy(xpath = "//div/img[@alt='Sauce Labs Onesie']")
    WebElement SLOImage;
    @FindBy(xpath = "//div/div[@class='inventory_details_name large_size']")
    WebElement SLOTitleName;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    WebElement SLOAddToCartButton;
    @FindBy(xpath = "//button[@id='remove-sauce-labs-onesie']")
    WebElement SLORemoveButton;
    @FindBy(xpath = "//div/a/span[@class='shopping_cart_badge']")
    WebElement shoppingCartBadge;
    @FindBy(xpath = "//div/a[@class='shopping_cart_link']")
    WebElement cartLink;


    public void clickBackToProductsButton(){
        backToProductsButton.click();
    }

    public void assertThatSLOImageIsDisplayed(){
        assertThat(SLOImage.isDisplayed()).isTrue();
    }

    public void assertThatSLOTitleNameIsCorrect(){
        assertThat(SLOTitleName.getText()).isEqualTo("Sauce Labs Onesie");
    }

    public void clickSLOAddToCartButton(){
        SLOAddToCartButton.click();
    }

    public void clickSLORemoveButton(){
        SLORemoveButton.click();
    }

    public void assertThatSLORemoveButtonAppeared() {
        assertThat(SLORemoveButton.isDisplayed()).isTrue();
    }

    public void assertThatShoppingCartBadgeIsDisplayedCorrect() {
        assertThat(shoppingCartBadge.getText()).isEqualTo("1");
    }

    public void clickCartLink() {
        cartLink.click();
    }

    public void assertThatSLOAddToCartButtonAppeared() {
        assertThat(SLOAddToCartButton.isDisplayed()).isTrue();
    }

    public void shoppingCartBadgeIsAbsent() {
        try {
            shoppingCartBadge.isDisplayed();
            fail();
        } catch (Exception ignored){}
    }
}
