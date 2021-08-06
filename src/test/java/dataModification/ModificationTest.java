package dataModification;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.ProfilePage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModificationTest extends BaseTest {

    @Test
    public void ModificationTest() {
            doLogin();
            ProfilePage profilePage = new ProfilePage(driver, wait);
            profilePage.clickOnProfileMainButton();
            profilePage.clickOnProfileEditButton();
            profilePage.interactProfileEditIntroducationField();
            profilePage.clickOnProfileSaveButton();
            profilePage.clickOnProfileMainButton();
            profilePage.clickOnprofilProfilButton();
            assertEquals(profilePage.getRandomString(), profilePage.getIntroductionText());
    }
}
