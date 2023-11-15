package steps;

import pages.CheckoutOverviewPage;

public class CheckoutOverviewSteps {

    CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage();

    public void checkThatCheckoutOverviewPageIsDisplayed() {
        checkoutOverviewPage.checkoutOverviewPageIsDisplayed();
    }

    public CheckoutCompleteSteps transitionToTheCheckoutCompletePage() {
        checkoutOverviewPage.clickFinishButton();
        return new CheckoutCompleteSteps();
    }
}
