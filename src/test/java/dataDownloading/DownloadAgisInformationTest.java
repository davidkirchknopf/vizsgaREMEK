package dataDownloading;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MessagesPage;
import pages.MyVIPAgiPage;
import util.Util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DownloadAgisInformationTest extends BaseTest {


    @Test
    @DisplayName("MyVIP Ági nevének letöltése")
    public void DownloadAgisInformationTesting() {
        doLogin();
        Util.TakeScreenshot(driver);
        MessagesPage messagesPage = new MessagesPage(driver, wait);
        MyVIPAgiPage myVIPAgiPage = new MyVIPAgiPage(driver, wait);
        messagesPage.clickOnMessagesMainButton();
        messagesPage.clickOnIncommingMessageFromAgi();
        Util.TakeScreenshot(driver);
        try {
            FileWriter fileWriter = new FileWriter("AgisProfilInformation.txt");
            fileWriter.append(driver.findElement(MyVIPAgiPage.agisInfosField).getText());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String data = "";
        try {
            File file = new File("AgisProfilInformation.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                data += scanner.nextLine();
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(data);
        Assertions.assertTrue(data.contains("Földi Ágnes"));
    }
}
