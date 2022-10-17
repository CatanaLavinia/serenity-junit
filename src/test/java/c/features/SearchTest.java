package c.features;

import b.steps.SearchSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchTest {

    @Managed
    WebDriver driver;

    @Steps
    SearchSteps searchSteps;

    @Test
    public void checkIfSearchPageIsLoadingWithoutSearchWord() {
        searchSteps.navigateToEmptySearchPage();
    }

    @Test
    public void checkIfSearchPageTitleIsUpdatingBasedOnSearchWord() {
        searchSteps.navigateToFullSearchPage();
    }

    @Test
    public void checkIfSearchResultsContainsProducts() {
        searchSteps.navigateToFullSearchPage();
        searchSteps.checkIfSearchPageContainsAnyProduct();
    }


}
