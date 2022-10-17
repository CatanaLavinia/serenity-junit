package a.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("/?page_id=7")
public class MyAccountPage extends PageObject {

    // Web elements for My Account page
    @FindBy(css = "#username")
    private WebElementFacade userNameInputField;

    @FindBy(css = "#password")
    private WebElementFacade passwordInputField;

    @FindBy(css = "div.woocommerce-MyAccount-content")
    private WebElementFacade welcomeParagraph;

    @FindBy(css = "button[name=\"login\"]")
    private WebElementFacade loginButton;



    public void visit(){
        open();
    }

    public void checkTitle(){
        Assert.assertEquals(getDriver().getTitle(),"My account – FastTrackIT");
    }

    public void enterUserCredentials() {
        userNameInputField.type("admin");
        passwordInputField.type("parola11");
    }

    public void enterWrongUserCredentials() {
        userNameInputField.type("admin");
        passwordInputField.type("parola");
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public void checkIfWelcomeParagraphIsDisplayed(){
        Assert.assertTrue(welcomeParagraph.containsText("Hello admin"));

    }


}
