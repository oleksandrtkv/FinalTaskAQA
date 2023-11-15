package pages.InventoryItemPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.fail;

public class SauceLabsBoltTShirtPage extends BasePage {

    @FindBy(xpath = "//button[@id='back-to-products']")
    WebElement backToProductsButton;
    @FindBy(xpath = "//div/img[@alt='Sauce Labs Bolt T-Shirt']")
    WebElement SLBTSImage;
    @FindBy(xpath = "//div/div[@class='inventory_details_name large_size']")
    WebElement SLBTSTitleName;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
    WebElement SLBTSAddToCartButton;
    @FindBy(xpath = "//button[@id='remove-sauce-labs-bolt-t-shirt']")
    WebElement SLBTSRemoveButton;
    @FindBy(xpath = "//div/a/span[@class='shopping_cart_badge']")
    WebElement shoppingCartBadge;
    @FindBy(xpath = "//div/a[@class='shopping_cart_link']")
    WebElement cartLink;


    public void clickBackToProductsButton(){
        backToProductsButton.click();
    }

    public void assertThatSLBTSImageIsDisplayed(){
        assertThat(SLBTSImage.isDisplayed()).isTrue();
    }

    public void assertThatSLBTSTitleNameIsCorrect(){
        assertThat(SLBTSTitleName.getText()).isEqualTo("Sauce Labs Bolt T-Shirt");
    }

    public void clickSLBTSAddToCartButton(){
        SLBTSAddToCartButton.click();
    }

    public void clickSLBTSRemoveButton(){
        SLBTSRemoveButton.click();
    }

    public void assertThatSLBTSRemoveButtonAppeared() {
        assertThat(SLBTSRemoveButton.isDisplayed()).isTrue();
    }

    public void assertThatShoppingCartBadgeIsDisplayedCorrect() {
        assertThat(shoppingCartBadge.getText()).isEqualTo("1");
    }

    public void clickCartLink() {
        cartLink.click();
    }

    public void assertThatSLBTSAddToCartButtonAppeared() {
        assertThat(SLBTSAddToCartButton.isDisplayed()).isTrue();
    }

    public void shoppingCartBadgeIsAbsent() {
        try {
            shoppingCartBadge.isDisplayed();
            fail();
        } catch (Exception ignored){}
    }
}
