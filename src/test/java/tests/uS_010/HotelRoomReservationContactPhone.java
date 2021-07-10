package tests.uS_010;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KoalaResortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelRoomReservationContactPhone {

    KoalaResortPage koalaResortPage = new KoalaResortPage();
    Actions actions = new Actions(Driver.getDriver());

    @Test

    public void HotelRoomReservationUpdateTest() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
        koalaResortPage.ilkLoginLink.click();
        koalaResortPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("kr_valid_username"));
        koalaResortPage.passwordTextBox.sendKeys(ConfigReader.getProperty("kr_valid_password"));
        koalaResortPage.loginButonu.click();

        koalaResortPage.hotelManagement.click();
        koalaResortPage.roomReservationUpdate.click();
        actions.sendKeys(Keys.PAGE_DOWN);
        koalaResortPage.ahmetReservationHotelRoom.click();
        actions.sendKeys(Keys.TAB);
        Thread.sleep(3000);
        koalaResortPage.ahmetRoomReservationDetails.click();
        koalaResortPage.reservationRoomContactPhone.clear();
        koalaResortPage.reservationRoomContactPhone.sendKeys(ConfigReader.getProperty("kr_contact_phone-update"));

        Thread.sleep(2000);
        koalaResortPage.reservationUpdateSave.click();
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_UP);
        actions.sendKeys(Keys.PAGE_UP);
        actions.sendKeys(Keys.PAGE_UP);
        Thread.sleep(4000);
        koalaResortPage.roomReservationUpdate.click();

        //WebElement hotelRoom = Driver.getDriver().findElement((By) koalaResortPage.ahmetReservationHotelRoom);
        //WebElement number = Driver.getDriver().findElement(By.xpath("//td[text()='(999) 999-9999'])"));

        //Assert.assertEquals(number,(ConfigReader.getProperty("kr_contact_phone-update")));





    }
}