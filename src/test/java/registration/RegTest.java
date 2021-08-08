package registration;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import util.Util;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegTest extends BaseTest {

    @Test
    public void Registration() throws InterruptedException {
        Util.TakeScreenshot(driver);
        homePage.clickRegistrationButton();
        Util.TakeScreenshot(driver);
        homePage.clickOnAcceptCookie();
        Util.TakeScreenshot(driver);
        homePage.typeInLastNameField();
        Util.TakeScreenshot(driver);
        homePage.typeInFirstNameField();
        Util.TakeScreenshot(driver);
        homePage.typeEmailAddressField(email);
        Util.TakeScreenshot(driver);
        homePage.typePasswordField(pw);
        Util.TakeScreenshot(driver);
        homePage.clickGenderButtonMale();
        Util.TakeScreenshot(driver);
        homePage.clickDateOfBirthYear("1986");
        Util.TakeScreenshot(driver);
        homePage.clickDateOfBirthMonth("October");
        Util.TakeScreenshot(driver);
        homePage.clickDateOfBirthDay("3.");
        Util.TakeScreenshot(driver);
        homePage.clickAgreementCheckBox();
        Util.TakeScreenshot(driver);
        //homePage.clickCaptchaCheckBox();//
        homePage.clickRegistrationFinishingButton();
        assertEquals("http://myvip.com/index.php?act=reg", getDriver().getCurrentUrl());
    }
}
