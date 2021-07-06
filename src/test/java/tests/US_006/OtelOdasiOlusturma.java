package tests.US_006;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.KoalaResortPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class OtelOdasiOlusturma extends TestBaseRapor{

    KoalaResortPage koalaResortPage=new KoalaResortPage();

    @Test
    public void otelOdasiOlusturma() throws InterruptedException {
        extentTest=extentReports.createTest("US_006","Otel odasi olusturma");
        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
        extentTest.info("Koala Resort Hotel sayfasina giris yapildi");


        koalaResortPage.ilkLoginLink.click();
        extentTest.info("Login linkine basıldı");

        koalaResortPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("kr_valid_username"));
        extentTest.info("Geçerli username girildi");
        koalaResortPage.passwordTextBox.sendKeys(ConfigReader.getProperty("kr_valid_password"));
        extentTest.info("Geçerli password girildi");
        koalaResortPage.loginButonu.click();
        extentTest.info("Login butonuna tıklandı");
        koalaResortPage.hotelManagement.click();
        extentTest.info("Hotel Management dropdownına tıklandı");
        Thread.sleep(3000);
        koalaResortPage.hotelRoomsBtn.click();
        extentTest.info("Hotel Rooms seçeneğine tıklandı");
        koalaResortPage.addHotelsRoom.click();
        extentTest.info("Add hotelRoom butonuna basıldı");

        Select select=new Select(koalaResortPage.idHotelDropDown);
        select.selectByVisibleText(ConfigReader.getProperty("kr_hotel_name"));
        extentTest.info("Hotel ID'si seçildi");

        Actions actions=new Actions(Driver.getDriver());
        actions.contextClick(koalaResortPage.codeTextBox)
                .sendKeys(ConfigReader.getProperty("kr_code01")).sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("kr_name")).sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("kr_location")).perform();
        extentTest.info("Code,name,location bilgileri girildi");
        actions.contextClick(koalaResortPage.descriptionsTextBox).pause(5)
                .sendKeys(ConfigReader.getProperty("kr_description")).sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("kr_price")).perform();
        extentTest.info("Description ve price bilgileri girildi");
        Select select1=new Select(koalaResortPage.roomTypeDropdown);
        select1.selectByVisibleText(ConfigReader.getProperty("kr_roomType"));
        extentTest.info("Room Type seçildi");

        actions.contextClick(koalaResortPage.maxAdult).sendKeys(ConfigReader.getProperty("kr_maxAdult"))
                .sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("kr_maxChild")).sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        extentTest.info("Max adult ve max children count değerleri girildi");
        extentTest.info("Approved seçeneği işaretlendi ve SAVE butonuna basıldı");


        koalaResortPage.sonOKButonu.click();
        extentTest.info("'HotelRoom was inserted successfully' yazısı görüldü ve başarıyla oluşturuldu");

    }

}
