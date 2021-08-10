package registration;

import base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import util.Util;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegTest extends BaseTest {

    @Test
    @DisplayName("Sikeres regisztráció automatizálásának a tesztelése")
    public void RegistrationTest() throws InterruptedException {
        Util.TakeScreenshot(driver);
        homePage.clickRegistrationButton();
        homePage.clickOnAcceptCookie();
        homePage.typeInLastNameField();
        homePage.typeInFirstNameField();
        homePage.typeEmailAddressField(email);
        homePage.typePasswordField(pw);
        homePage.clickGenderButtonMale();
        homePage.clickDateOfBirthYear("1986");
        homePage.clickDateOfBirthMonth("October");
        homePage.clickDateOfBirthDay("3.");
        homePage.clickAgreementCheckBox();
        //homePage.clickCaptchaCheckBox();//
        homePage.clickRegistrationFinishingButton();
        Util.TakeScreenshot(driver);
        assertEquals("http://myvip.com/index.php?act=reg", getDriver().getCurrentUrl());
    }
}
