package login;

import base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import util.Util;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest extends BaseTest {

    @Test
    @DisplayName("Sikeres belépés tesztelése")
    public void LoginTesting() {
        Util.TakeScreenshot(driver);
        homePage.typeEmailAddressFieldLogin(email);
        homePage.typePasswordFieldLogin(pw);
        homePage.clickLoginRememberEmailCheckbox();
        homePage.clickLoginRememberPasswordCheckbox();
        homePage.clickLoginHiddenCheckbox();
        Util.TakeScreenshot(driver);
        homePage.clickLoginLoginButton();
        assertEquals("http://myvip.com/homeent.php?", getDriver().getCurrentUrl());
    }
}
