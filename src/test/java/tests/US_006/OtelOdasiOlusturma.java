package tests.US_003.US_006;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.KoalaResortPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.security.Key;

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
        select.selectByVisibleText("Florencio Huels");
        extentTest.info("Hotel ID'si seçildi");

        Actions actions=new Actions(Driver.getDriver());
        actions.contextClick(koalaResortPage.codeTextBox)
                .sendKeys("23000").sendKeys(Keys.TAB)
                .sendKeys("Alperen").sendKeys(Keys.TAB)
                .sendKeys("Elazığ").perform();
        extentTest.info("Code,name,location bilgileri girildi");
        actions.contextClick(koalaResortPage.descriptionsTextBox).pause(5)
                .sendKeys("Merhaba Team-3 Projecileri").sendKeys(Keys.TAB)
                .sendKeys("6500").perform();
        extentTest.info("Description ve price bilgileri girildi");
        Select select1=new Select(koalaResortPage.roomTypeDropdown);
        select1.selectByVisibleText("Queen");
        extentTest.info("Room Type seçildi");

        actions.contextClick(koalaResortPage.maxAdult).sendKeys("2")
                .sendKeys(Keys.TAB).sendKeys("2").sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        extentTest.info("Max adult ve max children count değerleri girildi");
        extentTest.info("Approved seçeneği işaretlendi ve SAVE butonuna basıldı");


        koalaResortPage.sonOKButonu.click();
        extentTest.info("'HotelRoom was inserted successfully' yazısı görüldü ve başarıyla oluşturuldu");

    }

}
