package tests.uS_008;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KoalaResortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_0002_SearchingRoomsWithCode {

    @Test
    public void test(){
        KoalaResortPage koalaResortPage = new KoalaResortPage();
        koalaResortPage.koalaResortLogin();
        koalaResortPage.hotelManagement.click();
        koalaResortPage.hotelRoomsWebElement.click();
        koalaResortPage.hotelRoomsAramaCodeTextBoxWebElement.sendKeys(ConfigReader.getProperty("kr_hotel_oda_arama_code"));
        koalaResortPage.hotelRoomsSearchButonWebElement.click();
        String hotelAramaStringSonuc = koalaResortPage.hotelAramaSmirnySonucWebElement.getText();
        Assert.assertTrue(hotelAramaStringSonuc.contains(ConfigReader.getProperty("kr_hotel_arama_beklenen_sonuc")));

        Driver.closeDriver();

    }
}
