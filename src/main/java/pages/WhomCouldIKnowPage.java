package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WhomCouldIKnowPage {

    private WebDriver driver;

    public WhomCouldIKnowPage(WebDriver driver) {
        this.driver = driver;
    }

    public By getFILTER_FOR_NAME_BUTTON() {
        return FILTER_FOR_NAME_BUTTON;
    }

    private final By FILTER_FOR_NAME_BUTTON = By.xpath("//input[@name='namefilter']");
    private final By FILTER_OK_BUTTON = By.xpath("//*[@id=\"filterform\"]/div[2]/div[2]/a");


    public void clickFilterForName() {
        driver.findElement(FILTER_FOR_NAME_BUTTON).click();
    }

    public void typeFilterForName() {
        driver.findElement(FILTER_FOR_NAME_BUTTON).sendKeys("Dávid");
    }

    public void clickFilterOKButton() {
        driver.findElement(FILTER_OK_BUTTON).click();
    }

    public int countingNameDavid() {
        WebElement body = driver.findElement(By.tagName("body"));
        String bodyText = body.getText();
        int count = 0;
        while (bodyText.contains("Dávid")) {
            count++;
            bodyText = bodyText.substring(bodyText.indexOf("Dávid") + "Dávid".length());
        }
        System.out.println(count);
        return count;
    }
}

