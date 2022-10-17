package b.steps;

import a.pages.CartPage;
import a.pages.ShopPage;
import net.thucydides.core.annotations.Step;

public class CheckoutSteps {
    ShopPage shopPage;
    CartPage cartPage;

    @Step("Navigate to Shop page")
    public void navigateToShopPage() {
        shopPage.visit();
        shopPage.checkTitle();
        shopPage.checkUrl();
    }

    @Step("Navigate to Cart page")
    public void navigateToCartPage() {
        cartPage.visit();
        cartPage.checkTitle();
    }

    @Step("Delete Article from Cart page")
    public void deleteArticleFromCartPage() {
        cartPage.clickDeleteArticleButton();
    }

    @Step("Add product to cart")
    public void addProductToCart() {
        shopPage.addProductToCart();
        shopPage.checkIfProductWasAddedToCart();
    }

    @Step("Check if product exists in cart")
    public void checkIfProductExistsInCart() {
        cartPage.checkIfProductExistsInCart();
    }
}
