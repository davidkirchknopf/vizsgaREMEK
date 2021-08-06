package registration;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegTest extends BaseTest {

    @Test
    public void Registration() throws InterruptedException {

        homePage.clickRegistrationButton();
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
        assertEquals("http://myvip.com/index.php?act=reg", getDriver().getCurrentUrl());
    }
}
