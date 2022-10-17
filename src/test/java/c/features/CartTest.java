package c.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import b.steps.CheckoutSteps;
import b.steps.LoginSteps;

@RunWith(SerenityRunner.class)
public class CartTest {
    @Managed
    WebDriver driver;

    @Steps
    CheckoutSteps checkoutSteps;

    @Steps
    LoginSteps loginSteps;

    @Test
    public void checkIfAddToCartIsWorkingProperly() {
        loginSteps.navigateToMyAccountPage();
        loginSteps.performLogin();
        checkoutSteps.navigateToShopPage();
        checkoutSteps.addProductToCart();
        checkoutSteps.navigateToCartPage();
        checkoutSteps.checkIfProductExistsInCart();
        }

    @Test
    public void checkDeleteArticleFromCart() {
        loginSteps.navigateToMyAccountPage();
        loginSteps.performLogin();
        checkoutSteps.navigateToShopPage();
        checkoutSteps.addProductToCart();
        checkoutSteps.navigateToCartPage();
        checkoutSteps.deleteArticleFromCartPage();
        checkoutSteps.checkIfProductExistsInCart();
    }
}
