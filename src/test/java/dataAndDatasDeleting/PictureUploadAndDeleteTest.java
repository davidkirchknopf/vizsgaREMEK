package dataAndDatasDeleting;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.ImageUploadPage;
import pages.ImagesPage;
import pages.ProfilePage;
import util.Util;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PictureUploadAndDeleteTest extends BaseTest {

    @Test
    public void ModificationTest() throws InterruptedException {
        doLogin();
        ProfilePage profilePage = new ProfilePage(driver, wait);
        ImagesPage imagesPage = new ImagesPage(driver, wait);
        ImageUploadPage imageUploadPage = new ImageUploadPage(driver, wait);
        profilePage.clickOnProfileMainButton();
        profilePage.clickOnPhotosPage();
        imagesPage.clickOnImageUploadingButton();
        imageUploadPage.uploadpicture();
        imageUploadPage.clickOnUploadButton();
        imageUploadPage.clickOnFolder();
        imageUploadPage.clickOnImageDeletingButton();
        Util.waitForXMillis(2000);
        assertEquals(imageUploadPage.getNumberOfDivs(), imageUploadPage.getFolderNumber());
    }
}
