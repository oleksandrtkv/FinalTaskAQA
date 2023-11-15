package steps;

import pages.CheckoutYourInformationPage;


public class CheckoutYourInformationSteps {

    CheckoutYourInformationPage checkoutYourInformationPage = new CheckoutYourInformationPage();

    public CheckoutOverviewSteps fillInformationForm(String firstName, String lastName, String code){
        inputInformationData(firstName, lastName, code);
        return new CheckoutOverviewSteps();
    }

    private void inputInformationData(String firstName, String lastName, String code){
        checkoutYourInformationPage.fillFirstNameField(firstName);
        checkoutYourInformationPage.fillLastNameField(lastName);
        checkoutYourInformationPage.fillZipPostalCodeField(code);
        checkoutYourInformationPage.clickContinueButton();
    }

    public void checkThatCheckoutYourInformationPageIsDisplayed() {
        checkoutYourInformationPage.checkoutYourInformationPageIsDisplayed();
    }
}
