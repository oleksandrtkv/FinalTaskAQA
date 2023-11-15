package pages.InventoryItemPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.fail;

public class SauceLabsBackpackPage extends BasePage {

    @FindBy(xpath = "//button[@id='back-to-products']")
    WebElement backToProductsButton;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    WebElement SLBAddToCartButton;
    @FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
    WebElement SLBRemoveButton;
    @FindBy(xpath = "//div/img[@alt='Sauce Labs Backpack']")
    WebElement SLBImage;
    @FindBy(xpath = "//div/div[@class='inventory_details_name large_size']")
    WebElement SLBTitleName;
    @FindBy(xpath = "//div/a/span[@class='shopping_cart_badge']")
    WebElement shoppingCartBadge;
    @FindBy(xpath = "//div/a[@class='shopping_cart_link']")
    WebElement cartLink;


    public void clickBackToProductsButton(){
        backToProductsButton.click();
    }

    public void clickSLBAddToCartButton(){
        SLBAddToCartButton.click();
    }

    public void clickSLBRemoveButton(){
        SLBRemoveButton.click();
    }

    public void assertThatSLBImageIsDisplayed(){
        assertThat(SLBImage.isDisplayed()).isTrue();
    }

    public void assertThatSLBTitleIsCorrect(){
        assertThat(SLBTitleName.getText()).isEqualTo("Sauce Labs Backpack");
    }

    public void assertThatSLBRemoveButtonAppeared() {
        assertThat(SLBRemoveButton.isDisplayed()).isTrue();
    }

    public void assertThatShoppingCartBadgeIsDisplayedCorrect() {
        assertThat(shoppingCartBadge.getText()).isEqualTo("1");
    }

    public void clickCartLink(){
        cartLink.click();
    }

    public void assertThatSLBAddToCartButtonAppeared() {
        assertThat(SLBAddToCartButton.isDisplayed()).isTrue();
    }

    public void shoppingCartBadgeIsAbsent() {
        try {
            shoppingCartBadge.isDisplayed();
            fail();
        } catch (Exception ignored){}
    }
}
