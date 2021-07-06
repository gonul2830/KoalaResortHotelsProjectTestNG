package tests.uS_008;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KoalaResortPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_0011_Id_Code_Name_Location_Price_Searching extends TestBaseRapor {
    @Test
    public void test0001() throws InterruptedException {
        extentTest=extentReports.createTest("US_008","Otel odasi arama");
        KoalaResortPage koalaResortPage = new KoalaResortPage();
        extentTest.info("KoalaResortHotelSayfasindan obje olusturuldu.");
        koalaResortPage.koalaResortLogin();
        extentTest.info("Koalaresorthotels sayfasina giris yapildiktan sonra gecerli kullanici bilgileri ile giris yapili");
        koalaResortPage.hotelManagement.click();
        extentTest.info("Hotel Management dropdownına tıklandı");
        Thread.sleep(1000);
        koalaResortPage.hotelRoomsWebElement.click();
        extentTest.info("Hotel Rooms seçeneğine tıklandı");

        Select select = new Select(koalaResortPage.hotelRoomsSelectHotelDropDownWebElement);
        select.selectByVisibleText("SMIRNY HOTEL");
        extentTest.info("Hotel Id'si secildi");
        Actions actions=new Actions(Driver.getDriver());
        actions.contextClick(koalaResortPage.
                hotelRoomsAramaCodeTextBoxWebElement).
                sendKeys(ConfigReader.getProperty("kr_hotel_oda_arama_code")).sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("kr_hotel_oda_arama_name")).sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("kr_hotel_oda_arama_location")).sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("kr_hotel_oda_arama_price")).
                perform();
        extentTest.info("Code,name,location ve price bilgileri girildi");

        koalaResortPage.hotelRoomsSearchButonWebElement.click();
        extentTest.info("Search butonuna tiklani");

        String hotelAramaStringSonuc = koalaResortPage.hotelAramaSmirnySonucWebElement.getText();
        extentTest.info("Aranan otel simi bir String'e atandi");

        Assert.assertTrue(hotelAramaStringSonuc.contains(ConfigReader.getProperty("kr_hotel_arama_beklenen_sonuc")));
        extentTest.info("arama sonucunun istenen degeri icerip icermedig test edildi");

        Driver.closeDriver();
        extentTest.info("Sayda kapatildi");


    }

}
