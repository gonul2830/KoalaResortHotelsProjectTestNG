package tests.US_004;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KoalaResortPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;
import utilities.TestBaseRapor;

import javax.swing.*;

public class TestCase01 extends TestBaseRapor {

    @Test
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));

        KoalaResortPage koalaResortPage = new KoalaResortPage();
        koalaResortPage.ilkLoginLink.click();
        koalaResortPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("kr_valid_username"));
        koalaResortPage.passwordTextBox.sendKeys(ConfigReader.getProperty("kr_valid_password"));
        koalaResortPage.loginButonu.click();
        koalaResortPage.hotelManagement.click();
        koalaResortPage.hotelList.click();
        koalaResortPage.addHotel.click();

        Actions actions = new Actions(Driver.getDriver());
        actions.click(koalaResortPage.nameTextBox).
                sendKeys(ConfigReader.getProperty("kr_customer_name")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("kr_customer_adress")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("kr_customer_phone")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("kr_customer_email")).perform();

        Select select = new Select(koalaResortPage.acilirMenu);
        select.selectByIndex(1);

        koalaResortPage.saveButonu.click();

        Assert.assertTrue(koalaResortPage.codeHataMesaji.isDisplayed());





    }






}
