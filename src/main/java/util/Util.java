package util;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.ByteArrayInputStream;
import java.util.NoSuchElementException;

public class Util {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public Util(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    private final By HANDLE_TOO_MANY_LOGIN = By.xpath("//*[@id=\"alertPopup\"]/div[2]/div/div/div/div[2]/div[2]/div/a/span[2]");
    public static void scrollUp(WebDriver driver, By locator){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, -400)");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(locator));
    }

    public static void refresh(WebDriver driver){
        driver.navigate().refresh();
    }

    public static void waitForXMillis(int time) throws InterruptedException {
        Thread.sleep(time);
    }

    public boolean clickOnHANDLE_TOO_MANY_LOGIN(){
        try{
            WebDriverWait wait = new WebDriverWait(driver, 1);
            wait.until(ExpectedConditions.visibilityOfElementLocated(HANDLE_TOO_MANY_LOGIN));
            driver.findElement(HANDLE_TOO_MANY_LOGIN).click();
        }catch (NoSuchElementException e){
        }
        return true;
    }
    public static void deleteAds(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("var ads=document.getElementsByTagName('ins');"
                + "for(var i = 0; i < ads.length; i++){ads[i].remove();}");
    }

    public static void clickElement(WebDriver driver, By locator){
        driver.findElement(locator).click();
        deleteAds(driver);
    }
    @Step("TakeScreenshot")
    public static void TakeScreenshot(WebDriver driver){
        Allure.addAttachment("Screenshot", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        System.out.println(driver.getCurrentUrl());
    }
}
