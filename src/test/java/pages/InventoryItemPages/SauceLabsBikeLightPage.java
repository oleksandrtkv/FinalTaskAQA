package pages.InventoryItemPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.fail;

public class SauceLabsBikeLightPage extends BasePage {

    @FindBy(xpath = "//button[@id='back-to-products']")
    WebElement backToProductsButton;
    @FindBy(xpath = "//div/img[@alt='Sauce Labs Bike Light']")
    WebElement SLBLImage;
    @FindBy(xpath = "//div/div[@class='inventory_details_name large_size']")
    WebElement SLBLTitleName;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
    WebElement SLBLAddToCartButton;
    @FindBy(xpath = "//button[@id='remove-sauce-labs-bike-light']")
    WebElement SLBLRemoveButton;
    @FindBy(xpath = "//div/a/span[@class='shopping_cart_badge']")
    WebElement shoppingCartBadge;
    @FindBy(xpath = "//div/a[@class='shopping_cart_link']")
    WebElement cartLink;



    public void clickBackToProductsButton(){
        backToProductsButton.click();
    }

    public void assertThatSLBLImageIsDisplayed(){
        assertThat(SLBLImage.isDisplayed()).isTrue();
    }

    public void assertThatSLBLTitleIsCorrect(){
        assertThat(SLBLTitleName.getText()).isEqualTo("Sauce Labs Bike Light");
    }

    public void clickSLBLAddToCartButton(){
        SLBLAddToCartButton.click();
    }

    public void clickSLBLRemoveButton(){
        SLBLRemoveButton.click();
    }

    public void assertThatSLBLRemoveButtonAppeared() {
        assertThat(SLBLRemoveButton.isDisplayed()).isTrue();
    }

    public void assertThatShoppingCartBadgeIsDisplayedCorrect() {
        assertThat(shoppingCartBadge.getText()).isEqualTo("1");
    }

    public void clickCartLink() {
        cartLink.click();
    }

    public void assertThatSLBLAddToCartButtonAppeared() {
        assertThat(SLBLAddToCartButton.isDisplayed()).isTrue();
    }

    public void shoppingCartBadgeIsAbsent() {
        try {
            shoppingCartBadge.isDisplayed();
            fail();
        } catch (Exception ignored){}
    }
}
