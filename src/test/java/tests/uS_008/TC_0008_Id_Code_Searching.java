package tests.uS_008;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KoalaResortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_0008_Id_Code_Searching {
    @Test
    public void test0001(){
        KoalaResortPage koalaResortPage = new KoalaResortPage();
        koalaResortPage.koalaResortLogin();
        koalaResortPage.hotelManagement.click();
        koalaResortPage.hotelRoomsWebElement.click();

        Select select = new Select(koalaResortPage.hotelRoomsSelectHotelDropDownWebElement);

        select.selectByVisibleText("SMIRNY HOTEL");
        koalaResortPage.hotelRoomsAramaCodeTextBoxWebElement.sendKeys(ConfigReader.getProperty("kr_hotel_oda_arama_code"));
        koalaResortPage.hotelRoomsSearchButonWebElement.click();
        String hotelAramaStringSonuc = koalaResortPage.hotelAramaSmirnySonucWebElement.getText();

        Assert.assertTrue(hotelAramaStringSonuc.contains(ConfigReader.getProperty("kr_hotel_arama_beklenen_sonuc")));

        Driver.closeDriver();


    }
}
