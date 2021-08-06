package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyVIPAgiPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public MyVIPAgiPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    private final By newPageAgiMessage = By.xpath("//span[.='message']");
    public static final By agisInfosField = By.xpath("/html/body/div[4]/div/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/ul/li[3]");

    public void clickOnNewPageAgiMessage(){ driver.findElement(newPageAgiMessage).click();}

}
