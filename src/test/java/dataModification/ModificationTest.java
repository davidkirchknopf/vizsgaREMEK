package dataModification;

import base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.ProfilePage;
import util.Util;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModificationTest extends BaseTest {

    @Test
    @DisplayName("Profil adatainak módosítása")
    public void ModificationOurProfilTest() {
        doLogin();
        ProfilePage profilePage = new ProfilePage(driver, wait);
        Util.TakeScreenshot(driver);
        profilePage.clickOnProfileMainButton();
        profilePage.clickOnProfileEditButton();
        profilePage.interactProfileEditIntroducationField();
        profilePage.clickOnProfileSaveButton();
        profilePage.clickOnProfileMainButton();
        profilePage.clickOnprofilProfilButton();
        Util.TakeScreenshot(driver);
        assertEquals(profilePage.getRandomString(), profilePage.getIntroductionText());
    }
}
