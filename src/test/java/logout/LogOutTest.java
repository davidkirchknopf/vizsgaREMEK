package logout;

import base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import util.Util;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogOutTest extends BaseTest {

    @Test
    @DisplayName("Sikeres kilépés tesztelése")
    public void LoggingOutTest() {
        MainPage mainPage = new MainPage(driver);
        doLogin();
        Util.TakeScreenshot(driver);
        mainPage.clickOnLogoutButton();
        Util.TakeScreenshot(driver);
        assertEquals("http://myvip.com/", getDriver().getCurrentUrl());
    }
}
