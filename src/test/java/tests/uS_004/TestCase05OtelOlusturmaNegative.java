package tests.uS_004;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KoalaResortPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TestCase05OtelOlusturmaNegative extends TestBaseRapor {

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
        actions.click(koalaResortPage.codeTextBox).
                sendKeys(ConfigReader.getProperty("kr_code")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("kr_customer_name")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("kr_customer_adress")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("kr_customer_phone")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("kr_customer_email")).perform();

        koalaResortPage.saveButonu.click();

        Assert.assertTrue(koalaResortPage.selectGroupHataMesaji.isDisplayed());



    }


}
