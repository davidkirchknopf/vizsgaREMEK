package util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Util {


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

    public static void deleteAds(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("var ads=document.getElementsByTagName('ins');"
                + "for(var i = 0; i < ads.length; i++){ads[i].remove();}");
    }

    public static void clickElement(WebDriver driver, By locator){
        driver.findElement(locator).click();
        deleteAds(driver);
    }
}
