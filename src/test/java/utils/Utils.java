package utils;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.NoSuchElementException;

public class Utils {

    public static boolean checkIfWebElementExists(WebElementFacade element) {
        try {
            return element.isPresent();
        } catch (NoSuchElementException ex) {
            return false;
        }
    }
}
