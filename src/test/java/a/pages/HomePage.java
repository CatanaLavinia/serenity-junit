package a.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;

@DefaultUrl("/")
public class HomePage extends PageObject {

    // Web elements for home page


    public void visit(){
        open();
    }

    public void checkTitle() {
        Assert.assertEquals(getDriver().getTitle(), "FastTrackIT – Just another WordPress site");
    }

    public void checkIfHomePageIsDisplayed() {
        Assert.assertEquals(getDriver().getCurrentUrl(),"http://qa2.fasttrackit.org:8008/");

    }
}