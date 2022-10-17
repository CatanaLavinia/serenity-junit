package c.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import b.steps.LoginSteps;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed
    WebDriver driver;

    @Steps
    LoginSteps loginSteps;

    @Test
    public void checkIfLoginAsAdministratorIsWorking() {
        loginSteps.navigateToMyAccountPage();
        loginSteps.performLogin();
        loginSteps.checkIfLoginWasSuccessful();
    }

    @Test
    public void checkIfNormalUserIsWorking() {
        loginSteps.navigateToMyAccountPage();
        loginSteps.performLogin();
        loginSteps.checkIfLoginWasSuccessful();
    }

    @Test
    public void checkIfLoginWithoutCredentialsIsWorking() {
        loginSteps.navigateToMyAccountPage();
        loginSteps.performLoginWithoutCredentials();
    }

    @Test
    public void checkIfLoginWithWrongCredentialsIsWorking() {
        loginSteps.navigateToMyAccountPage();
        loginSteps.performLoginWithWrongCredentials();
    }
}
