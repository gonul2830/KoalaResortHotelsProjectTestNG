package tests.uS_008;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KoalaResortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_0006_SearchingRoomsWithRoomType {
    @Test
    public void test(){
        KoalaResortPage koalaResortPage = new KoalaResortPage();
        koalaResortPage.koalaResortLogin();
        koalaResortPage.hotelManagement.click();
        koalaResortPage.hotelRoomsWebElement.click();

        Select select = new Select(koalaResortPage.hotelRoomsAramaTypeWebElement);

        select.selectByVisibleText(ConfigReader.getProperty("kr_hotel_oda_arama_room_type"));

        koalaResortPage.hotelRoomsSearchButonWebElement.click();
        Select select1 = new Select(koalaResortPage.hotelRoomsAramaViewDropDownMenu);
        select1.selectByVisibleText("All");

        String hotelAramaStringSonuc = koalaResortPage.hotelAramaSmirnySonucWebElement.getText();
        Assert.assertTrue(hotelAramaStringSonuc.contains(ConfigReader.getProperty("kr_hotel_arama_beklenen_sonuc")));

        Driver.closeDriver();


    }
}
