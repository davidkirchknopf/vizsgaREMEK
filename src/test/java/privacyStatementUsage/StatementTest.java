package privacyStatementUsage;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import util.Util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StatementTest extends BaseTest {


    @Test
    @DisplayName("Adatvédelmi nyilatkozat használatának tesztelése")
    public void StatementReadingSavingTest() throws InterruptedException {
        homePage.clickPrivacyStatement();
        Util.TakeScreenshot(driver);
        try {
            FileWriter fileWriter = new FileWriter("SavingTheStatement.txt");
            fileWriter.append(driver.findElement(homePage.WHOLE_TEXT_FROM_PRIVACY_STATEMENT).getText());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String data = "";
        try {
            File file = new File("SavingTheStatement.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                data += scanner.nextLine();
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(data);
        Assertions.assertTrue(data.contains("TÁJÉKOZTATÓ"));
        homePage.clickExitPrivacyStatement();
    }
}