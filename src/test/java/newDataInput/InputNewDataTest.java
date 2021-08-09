package newDataInput;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.MessagesPage;
import pages.MyVIPAgiPage;
import util.Util;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class InputNewDataTest extends BaseTest {


    @Test
    public void WritingAMessageTest() {
        doLogin();
        Util.TakeScreenshot(driver);
        MessagesPage messagesPage = new MessagesPage(driver, wait);
        MyVIPAgiPage myVIPAgiPage = new MyVIPAgiPage(driver, wait);
        messagesPage.clickOnMessagesMainButton();
        messagesPage.clickOnIncommingMessageFromAgi();
        myVIPAgiPage.clickOnNewPageAgiMessage();
        messagesPage.clickInSubjectField();
        messagesPage.typeInSubjectField("Welcome Agi by CodeCool");
        messagesPage.clickIframeMessageField();
        messagesPage.typeInTextFieldNewMessage("Selenium is an umbrella project for a range of tools and libraries that enable and support the automation of web browsers. It provides extensions to emulate user interaction with browsers, a distribution server for scaling browser allocation, and the infrastructure for implementations of the W3C WebDriver specification that lets you write interchangeable code for all major web browsers. This project is made possible by volunteer contributors who have put in thousands of hours of their own time, and made the source code freely available for anyone to use, enjoy, and improve. Selenium brings together browser vendors, engineers, and enthusiasts to further an open discussion around automation of the web platform. The project organises an annual conference to teach and nurture the community.");
        messagesPage.getOutFromIframe();
        messagesPage.clickOnSendTheMessageButton();
        messagesPage.clickOnsendedMessagesButton();
        Util.TakeScreenshot(driver);
        assertTrue(driver.getPageSource().contains("CodeCool"));
    }
}
