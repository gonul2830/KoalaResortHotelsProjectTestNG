package tests.uS_001;

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
    public void positifGirisTest(){

        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
        KoalaResortPage koalaResortPage = new KoalaResortPage();

        extentTest=extentReports.createTest("us_001","Gecersiz bilgilerle giris yapma");
        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
        extentTest.pass("Koala resort hotels sayfasina gidildi");

        koalaResortPage.ilkLoginLink.click();
        extentTest.pass("Login linkine basildi");

        koalaResortPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("kr_valid_username"));
        extentTest.pass("Gecerli kullanici adi yazildi");

        koalaResortPage.passwordTextBox.sendKeys(ConfigReader.getProperty("kr_valid_password"));
        extentTest.pass("Gecerli sifre yazildi");


        koalaResortPage.loginButonu.click();
        extentTest.pass("Login butonuna basildi");


        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("kr_basarili_giris_url"));
        extentTest.pass("Basarili giris yapildigi test edildi");

        Driver.closeDriver();
        extentTest.pass("sayfa basarili bir sekilde kapatıldı");

    }
}
