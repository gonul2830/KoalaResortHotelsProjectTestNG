package tests.uS_007;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KoalaResortPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_002_HotelRoomEklemeNegatif extends TestBaseRapor {


    @Test
    public void hotelRoomAddNegativPriceTextBox(){

        KoalaResortPage koalaResortPage=new KoalaResortPage();

        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));

        koalaResortPage.ilkLoginLink.click();
        koalaResortPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("kr_valid_username"));
        koalaResortPage.passwordTextBox.sendKeys(ConfigReader.getProperty("kr_valid_password"));
        koalaResortPage.loginButonu.click();
        koalaResortPage.hotelManagement.click();
        koalaResortPage.hotelRoomsBtn.click();
        koalaResortPage.addHotelsRoom.click();


        Select select=new Select(koalaResortPage.idHotelDropDown);
        select.selectByVisibleText(ConfigReader.getProperty("kr_room_add_negativ_IDHotel"));

        Actions actions=new Actions(Driver.getDriver());

        actions.contextClick(koalaResortPage.codeTextBox).
                sendKeys(ConfigReader.getProperty("kr_room_add_negativ_code")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("kr_room_add_negativ_name")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("kr_room_add_negativ_location")).perform();

        actions.contextClick(koalaResortPage.descriptionsTextBox).
                pause(5).
                sendKeys(ConfigReader.getProperty("kr_room_add_negativ_description")).perform();

        Select select2=new Select(koalaResortPage.roomTypeDropdown);
        select.selectByVisibleText(ConfigReader.getProperty("kr_room_add_negativ_roomType"));

        actions.contextClick(koalaResortPage.maxAdult).
                sendKeys(ConfigReader.getProperty("kr_room_add_negativ_maxAdult")).
                sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("kr_room_add_negativ_maxChild")).perform();




        koalaResortPage.roomAddApprovedCheckbox.click();
        koalaResortPage.roomAddSaveButton.click();

        Assert.assertTrue(koalaResortPage.roomAddSaveButton.isEnabled());


    }
}
