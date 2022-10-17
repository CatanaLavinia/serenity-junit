package a.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

@DefaultUrl("/?page_id=5")
public class CartPage extends PageObject {

    @FindBy(css = "div.woocommerce a[data-product_id=\"27\"]")
    private WebElementFacade deleteArticleButton;

    public void visit(){
        open();
    }

    public void checkTitle() {
        Assert.assertEquals(getDriver().getTitle(), "Cart – FastTrackIT");
    }

    public void checkIfProductExistsInCart() {
        Assert.assertTrue(Utils.checkIfWebElementExists(deleteArticleButton));
    }

    public void clickDeleteArticleButton() {
        deleteArticleButton.click();
    }
}
