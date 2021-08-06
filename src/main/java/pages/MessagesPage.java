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

    private final By friendsMainButton = By.xpath("//span[.='Friends']");
    private final By messagesMainButton = By.xpath("//span[.='My messages']");
    private final By incomingMessageButton = By.xpath("//a[.='Bejövő levelek']");
    private final By incommingMessageFromAgi = By.xpath("/html/body/div[4]/div/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/div/div[1]/div[2]/form/div/div/div/div/div[2]/div/div[2]/div[1]/a");
    private final By subjectFieldNewMessage = By.xpath("//input[@id='subject']\n");
    private final By sendTheMessageButton = By.xpath("//*[@id=\"messageform\"]/a/span");
    private final By sendedMessagesButton = By.xpath("//*[@id=\"messagescont\"]/div/div[1]/div/div[2]/ul/li[4]/a");


    public void clickOnFriendsMainButton(){ driver.findElement(friendsMainButton).click();}
    public void clickOnMessagesMainButton(){
        Util.clickElement(driver, messagesMainButton);
    }
    public void clickOnIncommingMessageFromAgi(){ driver.findElement(incommingMessageFromAgi).click();}

    public void clickInSubjectField(){ driver.findElement(subjectFieldNewMessage).click();}

    public void typeInSubjectField(String keyWord){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(subjectFieldNewMessage));
        driver.findElement(subjectFieldNewMessage).sendKeys(keyWord);
    }
    public void clickIframeMessageField(){driver.switchTo().frame("msgtextarea_ifr");}
    public void typeInTextFieldNewMessage(String keyWord){
        driver.findElement(By.xpath("//*[@id=\"tinymce\"]")).sendKeys(keyWord);
    }
    public void getOutFromIframe(){
        driver.switchTo().defaultContent();
    }
    public void clickOnSendTheMessageButton(){ driver.findElement(sendTheMessageButton).click();}
    public void clickOnsendedMessagesButton(){ driver.findElement(sendedMessagesButton).click();}
    }

