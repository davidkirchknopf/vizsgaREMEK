package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.List;

public class ImageUploadPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public ImageUploadPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    private final By imageSelectingButton = By.xpath("//*[@id=\"file_upload\"]\n");
    private final By uploadButton = By.xpath("//*[@id=\"file_uploader\"]/div/div[4]/a/span[2]\n");
    private final By folder = By.xpath("/html/body/div[4]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/h3/a/span[1]");
    private final By imageDeletingButton = By.xpath("//*[text()='Törlés']\n");
    private final By folderSpan = By.xpath("/html/body/div[4]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/h3/a/span[2]");
    private final By parentDiv = By.xpath("//*[@id=\"album_col\"]/div");

    File file = new File("src/main/resources/EU_logoLarge.png");

    public int getNumberOfDivs() {
        List<WebElement> divsList = driver.findElements(parentDiv);
        System.out.println(divsList.size());
        return divsList.size();
    }

    public String getFolderNumber() {
       return driver.findElement(folderSpan).getText();
    }

    public void uploadpicture(){WebElement addFile = driver.findElement(imageSelectingButton);
        addFile.sendKeys(file.getAbsolutePath());}
    public void clickOnUploadButton(){ driver.findElement(uploadButton).click();}
    public void clickOnFolder(){ driver.findElement(folder).click();}
    public void clickOnImageDeletingButton(){
        driver.findElement(imageDeletingButton).click();
        driver.switchTo().alert().accept();}

}
