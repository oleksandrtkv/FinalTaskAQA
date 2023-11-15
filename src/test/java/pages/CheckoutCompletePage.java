package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckoutCompletePage extends BasePage {

    @FindBy(xpath = "//button[@id='back-to-products']")
    WebElement backHomeButton;
    @FindBy(xpath = "//div[@id='checkout_complete_container']")
    WebElement checkoutCompleteContainer;


    public void clickBackHomeButton(){
        backHomeButton.click();
    }

    public void checkoutCompleteContainerIsPresent(){
        assertThat(checkoutCompleteContainer.isDisplayed()).isTrue();
    }
}
