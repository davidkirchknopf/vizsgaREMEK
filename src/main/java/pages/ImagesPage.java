package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImagesPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public ImagesPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    private final By IMAGE_UPLOADING_BUTTON = By.xpath("//span[.='feltöltés ide']");

    public void clickOnImageUploadingButton(){ driver.findElement(IMAGE_UPLOADING_BUTTON).click();}

}
