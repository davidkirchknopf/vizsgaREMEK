package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Util;

public class MessagesPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public MessagesPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    private final By FRIENDS_MAIN_BUTTON = By.xpath("//span[.='Friends']");
    private final By MY_MESSAGES_MAIN_BUTTON = By.xpath("//span[.='My messages']");
    //private final By incomingMessageButton = By.xpath("//a[.='Bejövő levelek']");
    private final By INCOMING_MESSAGE_FROM_VIP_AGI = By.xpath("/html/body/div[4]/div/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/div/div[1]/div[2]/form/div/div/div/div/div[2]/div/div[2]/div[1]/a");
    private final By NEW_MESSAGE_SUBJECT_FIELD = By.xpath("//input[@id='subject']\n");
    private final By SEND_MESSAGE_BUTTON = By.xpath("//*[@id=\"messageform\"]/a/span");
    private final By SENDED_MESSAGES_BUTTON = By.xpath("//*[@id=\"messagescont\"]/div/div[1]/div/div[2]/ul/li[4]/a");


    public void clickOnFriendsMainButton() {
        driver.findElement(FRIENDS_MAIN_BUTTON).click();
    }

    public void clickOnMessagesMainButton() {
        Util.clickElement(driver, MY_MESSAGES_MAIN_BUTTON);
    }

    public void clickOnIncommingMessageFromAgi() {
        driver.findElement(INCOMING_MESSAGE_FROM_VIP_AGI).click();
    }

    public void clickInSubjectField() {
        driver.findElement(NEW_MESSAGE_SUBJECT_FIELD).click();
    }

    public void typeInSubjectField(String keyWord) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(NEW_MESSAGE_SUBJECT_FIELD));
        driver.findElement(NEW_MESSAGE_SUBJECT_FIELD).sendKeys(keyWord);
    }

    public void clickIframeMessageField() {
        driver.switchTo().frame("msgtextarea_ifr");
    }

    public void typeInTextFieldNewMessage(String keyWord) {
        driver.findElement(By.xpath("//*[@id=\"tinymce\"]")).sendKeys(keyWord);
    }

    public void getOutFromIframe() {
        driver.switchTo().defaultContent();
    }

    public void clickOnSendTheMessageButton() {
        driver.findElement(SEND_MESSAGE_BUTTON).click();
    }

    public void clickOnsendedMessagesButton() {
        driver.findElement(SENDED_MESSAGES_BUTTON).click();
    }
}

