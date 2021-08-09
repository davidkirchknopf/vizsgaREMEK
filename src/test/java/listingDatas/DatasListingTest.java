package listingDatas;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.*;
import util.Util;

public class DatasListingTest extends BaseTest {

    @Test
    public void ClickingWhomCouldIKnowTest() {
        try {
            driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]\n")).click();
        } catch (Exception e) {
        }
        doLogin();
        Util.TakeScreenshot(driver);
        MainPage mainPage = new MainPage(driver);
        Util.TakeScreenshot(driver);
        WhomCouldIKnowPage whomCouldIKnowPage = mainPage.clickWhomCouldIKnow();
        whomCouldIKnowPage.clickFilterForName();
        whomCouldIKnowPage.typeFilterForName();
        whomCouldIKnowPage.clickFilterOKButton();
        Util.TakeScreenshot(driver);
        Assertions.assertEquals(24, whomCouldIKnowPage.countingNameDavid());
    }
}

