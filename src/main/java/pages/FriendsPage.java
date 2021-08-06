package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Util;

public class FriendsPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public FriendsPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    private final By friendsMainButton = By.xpath("//span[.='Friends']");
    private final By advancedSearchPlaceOfOResidence = By.name("homeid");
    private final By advancedSearchMaritalStatus = By.name("maritalstatus");
    private final By advancedSearchZodiacSign = By.name("zodiac");
    private final By advancedSearchGender = By.name("sex");
    private final By findButtonAdvancedSearch = By.xpath("//span[.='Find!']");
    private final By pageFirst = By.xpath("//*[@id='pagerform_upper']/div/div[1]/div/a[3]");
    private final By pageSecond = By.xpath("//form[@id='pagerform_upper']//a[.='25-48']");
    private final By pageLast = By.xpath("//a[@class='rangepager-jump rangepager-jump-last']");
    private final By pagePreviousOne = By.xpath("//form[@id='pagerform_upper']//a[2]");


    public void clickToFriendsMainButton(){ driver.findElement(friendsMainButton).click();}

    public void dropDownResidence(String option) {
        Select select = new Select(driver.findElement(advancedSearchPlaceOfOResidence));
        select.selectByValue(option);
        Util.deleteAds(driver);
    }
    public void dropDownMarital(String option) {
        Select select = new Select(driver.findElement(advancedSearchMaritalStatus));
        select.selectByValue(option);
        Util.deleteAds(driver);
    }
    public void dropDownZodiac(String option) {
        Select select = new Select(driver.findElement(advancedSearchZodiacSign));
        select.selectByValue(option);
        Util.deleteAds(driver);
    }
    public void dropDownGender(String option) {
        Select select = new Select(driver.findElement(advancedSearchGender));
        select.selectByValue(option);
        Util.deleteAds(driver);
    }
    public void clickOnFindButtonAdvancedSearch(){
        Util.clickElement(driver, findButtonAdvancedSearch);
    }
    public void clickOnPageFirst(){
        Util.clickElement(driver, pageFirst);
    }
    public void clickOnPageSecond(){
        Util.clickElement(driver, pageSecond);
    }
    public void clickOnPageLast(){
        Util.clickElement(driver, pageLast);
    }
    public void clickOnPagePreviousOne(){
        Util.clickElement(driver, pagePreviousOne);
    }
    public String getOnPageSecondColor(){
        return driver.findElement(pageSecond).getCssValue("background-color");
    }
}





