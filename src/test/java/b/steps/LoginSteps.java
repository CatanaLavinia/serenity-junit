package b.steps;

import net.thucydides.core.annotations.Step;
import a.pages.HomePage;
import a.pages.MyAccountPage;

public class LoginSteps {
    HomePage homePage;
    MyAccountPage myAccountPage;

    @Step("Navigate to Home page")
    public void navigateToHomePage() {
        homePage.visit();
        homePage.checkTitle();
    }

    @Step("Navigate to My Account page")
    public void navigateToMyAccountPage() {
        myAccountPage.visit();
        myAccountPage.checkTitle();
    }

    @Step("Perform login")
    public void performLogin() {
        myAccountPage.enterUserCredentials();
        myAccountPage.clickLoginButton();
    }

    @Step("Perform login with wrong credentials")
    public void performLoginWithWrongCredentials() {
        myAccountPage.enterWrongUserCredentials();
        myAccountPage.clickLoginButton();
        myAccountPage.checkTitle();

    }

    @Step("Perform login without credentials")
    public void performLoginWithoutCredentials() {
        myAccountPage.clickLoginButton();
        myAccountPage.checkTitle();
    }

    @Step("Check if login was successful")
    public void checkIfLoginWasSuccessful() {
        myAccountPage.checkIfWelcomeParagraphIsDisplayed();
    }
}