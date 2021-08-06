package login;

import base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest extends BaseTest {

    @Test
    public void Login(){
        homePage.typeEmailAddressFieldLogin(email);
        homePage.typePasswordFieldLogin(pw);
        homePage.clickLoginRememberEmailCheckbox();
        homePage.clickLoginRememberPasswordCheckbox();
        homePage.clickLoginHiddenCheckbox();
        homePage.clickLoginLoginButton();
        assertEquals("http://myvip.com/homeent.php?", getDriver().getCurrentUrl());
    }
}
