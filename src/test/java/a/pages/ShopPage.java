package a.pages;


import com.gargoylesoftware.htmlunit.javascript.host.Console;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import utils.Utils;


@DefaultUrl("/?post_type=product")
public class ShopPage extends PageObject {

    @FindBy(css = "#username")
    private WebElementFacade userNameInputField;

    @FindBy(css = "div.action [data-product_id=\"27\"]")
    private WebElementFacade productAddButton;

    @FindBy(css = "a.cart-control span.woocommerce-Price-amount")
    private WebElementFacade cartAmountText;

    @FindBy(css = "p.woocommerce-mini-cart__empty-message")
    private WebElementFacade emptyCartMessageText;


    public void visit() {
        open();
    }

    public void checkTitle() {
        Assert.assertEquals(getDriver().getTitle(), "Products – FastTrackIT");
    }

    public void checkUrl() {
        Assert.assertTrue(getDriver().getCurrentUrl().contains("post_type=product"));
    }

    public void addProductToCart() {
        productAddButton.click();
    }

    public void checkIfProductWasAddedToCart() {
        Assert.assertFalse(Utils.checkIfWebElementExists(emptyCartMessageText));
    }
}
