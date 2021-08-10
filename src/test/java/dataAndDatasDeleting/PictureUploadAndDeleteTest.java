package dataAndDatasDeleting;

import base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.ImageUploadPage;
import pages.ImagesPage;
import pages.ProfilePage;
import util.Util;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PictureUploadAndDeleteTest extends BaseTest {

    @Test
    @DisplayName("Új kép feltöltése, törlése és pontos számozása")
    public void PictureUploadAndDeleteTesting() throws InterruptedException {
        doLogin();
        Util.TakeScreenshot(driver);
        ProfilePage profilePage = new ProfilePage(driver, wait);
        ImagesPage imagesPage = new ImagesPage(driver, wait);
        ImageUploadPage imageUploadPage = new ImageUploadPage(driver, wait);
        profilePage.clickOnProfileMainButton();
        profilePage.clickOnPhotosPage();
        imagesPage.clickOnImageUploadingButton();
        imageUploadPage.uploadpicture();
        imageUploadPage.clickOnUploadButton();
        Util.TakeScreenshot(driver);
        imageUploadPage.clickOnFolder();
        imageUploadPage.clickOnImageDeletingButton();
        Util.waitForXMillis(2000);
        assertEquals(imageUploadPage.getNumberOfDivs(), imageUploadPage.getFolderNumber());
    }
}
