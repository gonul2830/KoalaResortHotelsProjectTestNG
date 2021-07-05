package tests.uS_001;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KoalaResortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PozitifGiris {
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
    public void positifGirisTest(){

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
