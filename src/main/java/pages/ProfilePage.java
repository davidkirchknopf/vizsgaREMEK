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

    private final By PROFILE_MAIN_BUTTON = By.xpath("//div[4]/div/a[1]");
    private final By POST_A_MESSAGE_ON_THE_WALL_FIELD = By.xpath("//*[@id=\"entry_share_form\"]/div[1]/span/textarea");
    private final By SHARE_BUTTON = By.xpath("//*[@id=\"entry_share_form\"]/div[3]/span[2]/a/span[2]");
    private final By DELETE_ENTRY_FROM_WALL_BUTTON = By.xpath("//div[@class='entry-item-inner cf']/div[@class='entry-item-delete-wrapper']//span[1]/a[@href='javascript:;']");
    private final By EDIT_PROFILE_BUTTON = By.xpath("//span[.='edit profile']");
    private final By EDIT_PROFILE_INTRODUCTION_FIELD = By.xpath("//*[@id=\"formrow_pform_profile_intro\"]/div/div[2]/span/textarea\n");
    private final By SAVE_PROFILE_BUTTON = By.xpath("//div[29]//a[contains(.,'Save')]");
    private final By PROFIL_PROFIL_BUTTON = By.xpath("/html/body/div[4]/div/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/ul/li[2]/a");
    private final By PROFILE_INTRODUCTION = By.xpath("/html/body/div[4]/div/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/ul/li[16]/span[2]/div\n");
    private final By PHOTOS_PAGE_BUTTON = By.xpath("//a[.='Photos']");

    public String getRandomString() {
        return randomString;
    }

    private String randomString;

    public String randomString() {
        int max = 90;
        int min = 65;
        int range = max - min + 1;
        String randomString = "";
        for (int i = 0; i < 10; i++) {
            int randomNumber = (int) (Math.random() * range) + min;
            char randomChar = (char) randomNumber;
            randomString += randomChar;
        }
        this.randomString = randomString;
        return randomString;
    }

    public void clickOnProfileMainButton() {
        driver.findElement(PROFILE_MAIN_BUTTON).click();
    }

    public void repeatedMultiInputText() {
        String[] dataItem;
        for (int i = 0; i < 15; i++) {
            try {
                File myfile = new File("src/main/resources/codecool.txt");
                Scanner scanner = new Scanner(myfile);
                while (scanner.hasNextLine()) {
                    String data = scanner.nextLine();
                    dataItem = data.split(",");
                    driver.findElement(POST_A_MESSAGE_ON_THE_WALL_FIELD).sendKeys(dataItem[i]);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public void clickOnShareButton() {
        driver.findElement(SHARE_BUTTON).click();
    }

    public boolean clickOnDeleteEntryFromWallButton() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.visibilityOfElementLocated(DELETE_ENTRY_FROM_WALL_BUTTON));
            driver.findElement(DELETE_ENTRY_FROM_WALL_BUTTON);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public void clickOnProfileEditButton() {
        driver.findElement(EDIT_PROFILE_BUTTON).click();
    }

    public void interactProfileEditIntroducationField() {
        driver.findElement(EDIT_PROFILE_INTRODUCTION_FIELD);
        driver.findElement(EDIT_PROFILE_INTRODUCTION_FIELD).click();
        driver.findElement(EDIT_PROFILE_INTRODUCTION_FIELD).clear();
        driver.findElement(EDIT_PROFILE_INTRODUCTION_FIELD).sendKeys(randomString());
    }

    public void clickOnProfileSaveButton() {
        driver.findElement(SAVE_PROFILE_BUTTON).click();
    }

    public void clickOnprofilProfilButton() {
        driver.findElement(PROFIL_PROFIL_BUTTON).click();
    }

    public String getIntroductionText() {
        return driver.findElement(PROFILE_INTRODUCTION).getText();
    }

    public void clickOnPhotosPage() {
        driver.findElement(PHOTOS_PAGE_BUTTON).click();
    }
}