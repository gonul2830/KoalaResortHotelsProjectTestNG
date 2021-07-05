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

public class TestCase03 extends TestBase {

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
                sendKeys(ConfigReader.getProperty("kr_phone")).perform();

        Select select = new Select(koalaResortPage.acilirListe);
        select.selectByIndex(1);

        koalaResortPage.saveButton.click();

        Assert.assertTrue(koalaResortPage.gmailHataMesaji.isDisplayed());

    }
}
