package smokeTest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KoalaResortPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class PozitifGiris extends TestBaseRapor {
    /*
    Kullanıcı http://qa-environment.koalaresorthotels.com sayfasına gider
    Kullanıcı sağ üstteki "Log in" butonuna tıklar
    Kullanıcı açılan menude username Text Box'a tıklar
    Kullanıcı açılan menude username Text Box'a username yazar
    Kullanıcı Password Textbox'a password yazar
    Kullanıcı "Log in" butonuna tıklar
    Kullanıcı giris yaptıgını test eder
    sayfayi kapatir

     */

    @Test
    public void positifGirisTest() throws InterruptedException{

        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));

        KoalaResortPage koalaResortPage= new KoalaResortPage();

        koalaResortPage.ilkLoginLink.click();
        koalaResortPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("kr_valid_username"));
        koalaResortPage.passwordTextBox.sendKeys(ConfigReader.getProperty("kr_valid_password"));
        koalaResortPage.loginButonu.click();

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("kr_basarili_giris_url"));
        Driver.closeDriver();



    }


}
