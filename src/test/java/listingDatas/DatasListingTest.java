package listingDatas;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.*;

public class DatasListingTest extends BaseTest {

    @Test
    public void clickingWhomCouldIKnow() throws InterruptedException {
        try { driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]\n")).click();
        } catch(Exception e){
        }
        doLogin();
        MainPage mainPage = new MainPage(driver);
        WhomCouldIKnowPage whomCouldIKnowPage = mainPage.clickWhomCouldIKnow();
        whomCouldIKnowPage.clickFilterForName();
        whomCouldIKnowPage.typeFilterForName();
        whomCouldIKnowPage.clickFilterOKButton();
        Assertions.assertEquals(24, whomCouldIKnowPage.countingNameDavid());
        }
    }

