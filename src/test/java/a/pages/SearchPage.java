package a.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

@DefaultUrl("/?s=")
public class SearchPage extends PageObject{

    @FindBy(css = "[id=\"post-27\"]")
    private WebElementFacade productInSearchPageResult;

    public void visit(){
        open();
    }

    public void visitWithSearchWord(){
        openUrl("http://qa2.fasttrackit.org:8008/?s=album");
    }

    public void checkTitleWithoutSearchWord() {
        Assert.assertEquals(getDriver().getTitle(), "Search Results for “” – FastTrackIT");
    }

    public void checkTitleWithSearchWord() {
        Assert.assertEquals(getDriver().getTitle(), "Search Results for “album” – FastTrackIT");
    }

    public void checkIfProductExistsInSearchPage() {
        Assert.assertTrue(Utils.checkIfWebElementExists(productInSearchPageResult));
    }
}
