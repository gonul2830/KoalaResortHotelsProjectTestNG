package tests.uS_002;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KoalaResortPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class NegatifGiris extends TestBaseRapor {
    /*
    1-Kullanıcı KOALARESORTHOTELS sayfasına gider
    2-Kullanıcı sağ üstteki "Log in" butonuna tıklar
    - yanlisSifre
    - yanlisKulllanici
    - yanlisSifreKullanici
     sırası ile dener
      ve hata mesajı alır
     "-""Try again please
        Username or password is incorrect, please correct them and try again
        Wrong password""mesajını görür"

     */

    //KoalaResortPage koalaResortPage = new KoalaResortPage(); //public claas da yazdıgım zaman ve public classı run yaptıgım zaman yanlisSifre ve YAnlıs Kullanıcı failed oluyor


    @Test
    public void yanlisKullanici(){

        KoalaResortPage koalaResortPage = new KoalaResortPage();
        extentTest=extentReports.createTest("us_001","Gecersiz bilgilerle giris yapma");
        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
        extentTest.pass("Koala resort hotels sayfasina gidildi");

        koalaResortPage.ilkLoginLink.click();
        extentTest.pass("Login linkine basildi");

        koalaResortPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("kr_wrong_username"));
        extentTest.pass("Gecersiz kullanici adi yazildi");

        koalaResortPage.passwordTextBox.sendKeys(ConfigReader.getProperty("kr_valid_password"));
        extentTest.pass("Gecerli sifre yazildi");


        koalaResortPage.loginButonu.click();
        extentTest.pass("Login butonuna basildi");


        Assert.assertTrue(koalaResortPage.girisYapilamadiElementi.isDisplayed());
        extentTest.pass("Basarisiz giris yapildigi test edildi");

        Driver.closeDriver();
        extentTest.pass("sayfa basarili bir sekilde kapatıldı");

    }


    @Test
    public void yanlisSifre(){
        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
        KoalaResortPage koalaResortPage = new KoalaResortPage();//sadece public void yanlisSifre run yarınca pass

        extentTest=extentReports.createTest("us_001","Gecersiz bilgilerle giris yapma");
        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
        extentTest.pass("Koala resort hotels sayfasina gidildi");

        koalaResortPage.ilkLoginLink.click();
        extentTest.pass("Login linkine basildi");

        koalaResortPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("kr_valid_username"));
        extentTest.pass("Gecerli kullanici adi yazildi");

        koalaResortPage.passwordTextBox.sendKeys(ConfigReader.getProperty("kr_wrong_password"));
        extentTest.pass("Gecersiz sifre yazildi");


        koalaResortPage.loginButonu.click();
        extentTest.pass("Login butonuna basildi");


        Assert.assertTrue(koalaResortPage.girisYapilamadiElementi.isDisplayed());
        extentTest.pass("Basarisiz giris yapildigi test edildi");

        Driver.closeDriver();
        extentTest.pass("sayfa basarili bir sekilde kapatıldı");

    }

    @Test
    public void yanlisKullaniciVeSifre(){
        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
        KoalaResortPage koalaResortPage = new KoalaResortPage();//sadece public void yanlisKullanıcıVeSifre run yarınca pass

        extentTest=extentReports.createTest("us_002","Gecersiz bilgilerle giris yapma");
        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
        extentTest.pass("Koala resort hotels sayfasina gidildi");

        koalaResortPage.ilkLoginLink.click();
        extentTest.pass("Login linkine basildi");

        koalaResortPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("kr_wrong_username"));
        extentTest.pass("Gecersiz kullanici adi yazildi");

        koalaResortPage.passwordTextBox.sendKeys(ConfigReader.getProperty("kr_wrong_password"));
        extentTest.pass("Gecersiz sifre yazildi");


        koalaResortPage.loginButonu.click();
        extentTest.pass("Login butonuna basildi");


        Assert.assertTrue(koalaResortPage.girisYapilamadiElementi.isDisplayed());
        extentTest.pass("Basarisiz giris yapildigi test edildi");

        Driver.closeDriver();
        extentTest.pass("sayfa basarili bir sekilde kapatıldı");

    }
}

