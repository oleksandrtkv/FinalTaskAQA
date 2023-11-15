package steps;

import pages.CheckoutCompletePage;

public class CheckoutCompleteSteps {

    CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage();

    public void checkThatCheckoutCompleteContainerIsPresent(){
        checkoutCompletePage.checkoutCompleteContainerIsPresent();
    }

    public ProductsPageSteps transitionToTheProductsPage(){
        checkoutCompletePage.clickBackHomeButton();
        return new ProductsPageSteps();
    }
}
