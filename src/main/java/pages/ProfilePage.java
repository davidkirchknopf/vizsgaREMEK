package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProfilePage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public ProfilePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    private final By profileMainButton = By.xpath("//span[.='Profile']\n");
    private final By enterTextOnTheWall = By.xpath("//*[@id=\"entry_share_form\"]/div[1]/span/textarea");
    private final By shareButton = By.xpath("//*[@id=\"entry_share_form\"]/div[3]/span[2]/a/span[2]");
    private final By deleteEntryFromWallButton = By.xpath("//div[@class='entry-item-inner cf']/div[@class='entry-item-delete-wrapper']//span[1]/a[@href='javascript:;']");
    private final By profileEditButton = By.xpath("//span[.='edit profile']");
    private final By profileEditIntroducationField = By.xpath("//*[@id=\"formrow_pform_profile_intro\"]/div/div[2]/span/textarea\n");
    private final By profileSaveButton = By.xpath("//div[29]//a[contains(.,'Save')]");
    private final By profilProfilButton = By.xpath("/html/body/div[4]/div/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/ul/li[2]/a");
    private final By profileIntroduction = By.xpath("/html/body/div[4]/div/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/ul/li[16]/span[2]/div\n");
    private final By photosPage = By.xpath("//a[.='Photos']");

    public String getRandomString() {
        return randomString;
    }

    private String randomString;

    public String randomString(){
        int max = 90;
        int min = 65;
        int range = max - min + 1;
        String randomString = "";
        for (int i = 0; i < 10; i++) {
            int randomNumber = (int)(Math.random() * range) + min;
            char randomChar = (char)randomNumber;
            randomString += randomChar;}
        this.randomString = randomString;
        return randomString;
    }

    public void clickOnProfileMainButton(){
        driver.findElement(profileMainButton).click();
    }
    public void repeatedMultiInputSearch() {
        String[] dataItem;
        for (int i = 0; i < 15; i++) {
            try {
                File myfile = new File("src/main/resources/codecool.txt");
                Scanner scanner = new Scanner(myfile);
                while (scanner.hasNextLine()) {
                    String data = scanner.nextLine();
                    dataItem = data.split(",");
                    driver.findElement(enterTextOnTheWall).sendKeys(dataItem[i]);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
    public void clickOnShareButton(){
        driver.findElement(shareButton).click();
    }
    public boolean clickOnDeleteEntryFromWallButton(){
        try{
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.visibilityOfElementLocated(deleteEntryFromWallButton));
            driver.findElement(deleteEntryFromWallButton);
        }catch (Exception e){
            return false;
        }
        return true;
    }
    public void clickOnProfileEditButton(){
        driver.findElement(profileEditButton).click(); }

    public void interactProfileEditIntroducationField() { driver.findElement(profileEditIntroducationField);
        driver.findElement(profileEditIntroducationField).click();
        driver.findElement(profileEditIntroducationField).clear();
        driver.findElement(profileEditIntroducationField).sendKeys(randomString());
    }

    public void clickOnProfileSaveButton(){
        driver.findElement(profileSaveButton).click();}

    public void clickOnprofilProfilButton(){
        driver.findElement(profilProfilButton).click();
    }
    public String getIntroductionText(){
        return driver.findElement(profileIntroduction).getText();
    }
    public void clickOnPhotosPage(){
        driver.findElement(photosPage).click();
    }
}