package repeatedAndSequentialDataInputFromSource;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MessagesPage;
import pages.ProfilePage;
import util.Util;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DataInputFromSourceTest extends BaseTest {

    @Test
    @DisplayName("Posztolás tesztelése egy megadott fájlból")
    public void ShareSomethingOnTheWallTest() {
        doLogin();
        Util.TakeScreenshot(driver);
        ProfilePage profilePage = new ProfilePage(driver, wait);
        Util.TakeScreenshot(driver);
        profilePage.clickOnProfileMainButton();
        profilePage.repeatedMultiInputText();
        profilePage.clickOnShareButton();
        Util.TakeScreenshot(driver);
        assertTrue(profilePage.clickOnDeleteEntryFromWallButton());
    }
}
