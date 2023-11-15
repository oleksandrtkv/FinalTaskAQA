package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckoutOverviewPage extends BasePage {

    @FindBy(xpath = "//div[@class='cart_list']")
    WebElement cartList;
    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishButton;


    public void checkoutOverviewPageIsDisplayed(){
        assertThat(cartList.isDisplayed()).isTrue();
    }

    public void clickFinishButton(){
        finishButton.click();
    }
}
