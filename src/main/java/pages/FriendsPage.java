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

    private final By FRIENDS_MAIN_BUTTON = By.xpath("//span[.='Friends']");
    private final By ADVANCED_SEARCH_PLACE_OF_RESIDENCE_DROPDOWN = By.name("homeid");
    private final By ADVANCED_SEARCH_MARITAL_STATUS_DROPDOWN = By.name("maritalstatus");
    private final By ADVANCED_SEARCH_ZODIAC_SIGN_DROPDOWN = By.name("zodiac");
    private final By ADVANCED_SEARCH_GENDER_DROPDOWN = By.name("sex");
    private final By ADVANCED_SEARCH_BUTTON = By.xpath("//span[.='Find!']");
    private final By PAGE_FIRST_BUTTON = By.xpath("//*[@id='pagerform_upper']/div/div[1]/div/a[3]");
    private final By PAGE_SECOND_BUTTON = By.xpath("//form[@id='pagerform_upper']//a[.='25-48']");
    private final By PAGE_LAST_BUTTON = By.xpath("//a[@class='rangepager-jump rangepager-jump-last']");
    private final By PAGE_PREVIOUS_ONE_BUTTON = By.xpath("//form[@id='pagerform_upper']//a[2]");


    public void clickToFriendsMainButton() {
        driver.findElement(FRIENDS_MAIN_BUTTON).click();
    }

    public void dropDownResidence(String option) {
        Select select = new Select(driver.findElement(ADVANCED_SEARCH_PLACE_OF_RESIDENCE_DROPDOWN));
        select.selectByValue(option);
        Util.deleteAds(driver);
    }

    public void dropDownMarital(String option) {
        Select select = new Select(driver.findElement(ADVANCED_SEARCH_MARITAL_STATUS_DROPDOWN));
        select.selectByValue(option);
        Util.deleteAds(driver);
    }

    public void dropDownZodiac(String option) {
        Select select = new Select(driver.findElement(ADVANCED_SEARCH_ZODIAC_SIGN_DROPDOWN));
        select.selectByValue(option);
        Util.deleteAds(driver);
    }

    public void dropDownGender(String option) {
        Select select = new Select(driver.findElement(ADVANCED_SEARCH_GENDER_DROPDOWN));
        select.selectByValue(option);
        Util.deleteAds(driver);
    }

    public void clickOnFindButtonAdvancedSearch() {
        Util.clickElement(driver, ADVANCED_SEARCH_BUTTON);
    }

    public void clickOnPageFirst() {
        Util.clickElement(driver, PAGE_FIRST_BUTTON);
    }

    public void clickOnPageSecond() {
        Util.clickElement(driver, PAGE_SECOND_BUTTON);
    }

    public void clickOnPageLast() {
        Util.clickElement(driver, PAGE_LAST_BUTTON);
    }

    public void clickOnPagePreviousOne() {
        Util.clickElement(driver, PAGE_PREVIOUS_ONE_BUTTON);
    }

    public String getOnPageSecondColor() {
        return driver.findElement(PAGE_SECOND_BUTTON).getCssValue("background-color");
    }
}





