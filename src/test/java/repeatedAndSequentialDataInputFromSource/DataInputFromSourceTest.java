package repeatedAndSequentialDataInputFromSource;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.MessagesPage;
import pages.ProfilePage;
import util.Util;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DataInputFromSourceTest extends BaseTest {

    @Test
    public void DataInputFromSource() throws InterruptedException {
        doLogin();
        ProfilePage profilePage = new ProfilePage(driver, wait);
        Util.TakeScreenshot(driver);
        profilePage.clickOnProfileMainButton();
        profilePage.repeatedMultiInputText();
        profilePage.clickOnShareButton();
        assertTrue(profilePage.clickOnDeleteEntryFromWallButton());
    }
}
