package logout;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogOutTest extends BaseTest {

    @Test
    public void LogOutTest() {
    MainPage mainPage = new MainPage(driver);
    doLogin();
    mainPage.clickOnLogoutButton();
    assertEquals("http://myvip.com/", getDriver().getCurrentUrl());
    }
}
