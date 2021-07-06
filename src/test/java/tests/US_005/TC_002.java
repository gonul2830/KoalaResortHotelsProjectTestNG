package tests.US_005;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KoalaResortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_002 {
    KoalaResortPage koalaResortPage = new KoalaResortPage();

    @Test
    public void codeAramaKutusu() throws InterruptedException{

        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
        koalaResortPage.ilkLoginLink.click();

        koalaResortPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("kr_valid_username"));

        koalaResortPage.passwordTextBox.sendKeys(ConfigReader.getProperty("kr_valid_password"));

        koalaResortPage.loginButonu.click();
        koalaResortPage.hotelManagement.click();

        koalaResortPage.hotelList.click();

        koalaResortPage.codeTextTable.sendKeys(ConfigReader.getProperty("kr_CodeText"));
        koalaResortPage.hotelListSearchBtn.click();

        Thread.sleep(5000);
        Assert.assertEquals(koalaResortPage.nameHotelKontrol.getText(),ConfigReader.getProperty("kr_customer_name"));


    }
}
