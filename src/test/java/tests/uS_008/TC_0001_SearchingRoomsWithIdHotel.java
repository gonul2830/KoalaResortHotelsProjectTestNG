package tests.uS_008;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KoalaResortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_0001_SearchingRoomsWithIdHotel {
    /*
       koalaresorthotels sitesine girin
       Sag ustteki Login butonuna tiklayin
       username butonuna valid bir username girin
       password butonuna valid password girin
       login Butonuna tiklayin
       Hotel management buttonuna tiklayin
       Hotel Rooms Buttonuna tıklayın
       Id Hotel Text Box drowdown’ından SMIRNY HOTEL'i secin
       Search buttonununa basın
       Sonuc kisminda Hotel isminin SMIRNY HOTEL oldugunu dogrulayin
        */
    @Test
    public void test0001(){
        KoalaResortPage koalaResortPage = new KoalaResortPage();
        koalaResortPage.koalaResortLogin();
        koalaResortPage.hotelManagement.click();
        koalaResortPage.hotelRoomsWebElement.click();

        Select select = new Select(koalaResortPage.hotelRoomsSelectHotelDropDownWebElement);

        select.selectByVisibleText("SMIRNY HOTEL");
        koalaResortPage.hotelRoomsSearchButonWebElement.click();
        String hotelAramaStringSonuc = koalaResortPage.hotelAramaSmirnySonucWebElement.getText();

        Assert.assertTrue(hotelAramaStringSonuc.contains(ConfigReader.getProperty("kr_hotel_arama_beklenen_sonuc")));

        Driver.closeDriver();


    }
}
