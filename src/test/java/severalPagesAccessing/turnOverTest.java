package severalPagesAccessing;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.FriendsPage;
import util.Util;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class turnOverTest extends BaseTest {

    @Test
    public void searchingForFriends() throws InterruptedException {
        doLogin();
        FriendsPage friendsPage = new FriendsPage(driver, wait);
        friendsPage.clickToFriendsMainButton();
        Util.deleteAds(driver);
        friendsPage.dropDownResidence("0");
        friendsPage.dropDownResidence("3298");
        friendsPage.dropDownMarital("0");
        friendsPage.dropDownZodiac("2");
        friendsPage.dropDownGender("1");
        Util.waitForXMillis(2000);
        friendsPage.clickOnFindButtonAdvancedSearch();
        Util.waitForXMillis(2000);
        friendsPage.clickOnPageFirst();
        friendsPage.clickOnPageSecond();
        friendsPage.clickOnPageLast();
        friendsPage.clickOnPagePreviousOne();
        assertEquals("rgba(21, 122, 27, 1)", friendsPage.getOnPageSecondColor());
    }
}
