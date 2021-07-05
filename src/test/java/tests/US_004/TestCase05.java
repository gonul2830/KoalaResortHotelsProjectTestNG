package tests.US_004;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KoalaResortPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;
import utilities.TestBaseRapor;

public class TestCase05 extends TestBaseRapor {

    @Test
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));

        KoalaResortPage koalaResortPage = new KoalaResortPage();
        koalaResortPage.ilkLoginLink.click();
        koalaResortPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("kr_valid_username"));
        koalaResortPage.passwordTextBox.sendKeys(ConfigReader.getProperty("kr_valid_password"));
        koalaResortPage.loginButonu.click();
        koalaResortPage.hotelManagementButton.click();
        koalaResortPage.hotelListButton.click();
        koalaResortPage.addHotelButton.click();

        Actions actions = new Actions(Driver.getDriver());
        actions.click(koalaResortPage.codeTextBox).
                sendKeys(ConfigReader.getProperty("kr_code")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("kr_hotelname")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("kr_address")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("kr_phone")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("kr_gmail")).perform();

        koalaResortPage.saveButton.click();

        Assert.assertTrue(koalaResortPage.selectGroupHataMesaji.isDisplayed());



    }


}