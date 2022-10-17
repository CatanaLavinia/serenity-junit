package b.steps;

import net.thucydides.core.annotations.Step;
import a.pages.SearchPage;

public class SearchSteps {
    SearchPage searchPage;

    @Step("Navigate to empty search page")
    public void navigateToEmptySearchPage() {
        searchPage.visit();
        searchPage.checkTitleWithoutSearchWord();
    }

    @Step("Navigate to full search page")
    public void navigateToFullSearchPage() {
        searchPage.visitWithSearchWord();
        searchPage.checkTitleWithSearchWord();
    }

    @Step("Check if search page contains any product")
    public void checkIfSearchPageContainsAnyProduct() {
        searchPage.checkIfProductExistsInSearchPage();
    }
}
