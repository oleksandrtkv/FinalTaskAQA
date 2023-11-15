package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckoutYourInformationPage extends BasePage {

    @FindBy(xpath = "//input[@id='first-name']")
    WebElement firstNameField;
    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lastNameField;
    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement zip_postalCodeField;
    @FindBy(xpath = "//input[@id='continue']")
    WebElement continueButton;


    public void fillFirstNameField(String text){
        firstNameField.clear();
        firstNameField.sendKeys(text);
    }

    public void fillLastNameField(String text){
        lastNameField.clear();
        lastNameField.sendKeys(text);
    }

    public void fillZipPostalCodeField(String text){
        zip_postalCodeField.clear();
        zip_postalCodeField.sendKeys(text);
    }

    public void clickContinueButton(){
        continueButton.click();
    }

    public void checkoutYourInformationPageIsDisplayed() {
        assertThat(firstNameField.isDisplayed()).isTrue();
        assertThat(lastNameField.isDisplayed()).isTrue();
        assertThat(zip_postalCodeField.isDisplayed()).isTrue();
    }
}
