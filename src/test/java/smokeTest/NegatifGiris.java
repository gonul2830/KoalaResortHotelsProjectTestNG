package smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KoalaResortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegatifGiris {
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
        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
        KoalaResortPage koalaResortPage = new KoalaResortPage();
        koalaResortPage.ilkLoginLink.click();
        koalaResortPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("kr_wrong_username"));
        koalaResortPage.passwordTextBox.sendKeys(ConfigReader.getProperty("kr_valid_password"));
        koalaResortPage.loginButonu.click();
        Assert.assertTrue(koalaResortPage.girisYapilamadiElementi.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void yanlisSifre(){
        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
        KoalaResortPage koalaResortPage = new KoalaResortPage();//sadece public void yanlisSifre run yarınca pass
        koalaResortPage.ilkLoginLink.click();
        koalaResortPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("kr_valid_username"));
        koalaResortPage.passwordTextBox.sendKeys(ConfigReader.getProperty("kr_wrong_password"));
        koalaResortPage.loginButonu.click();

        Assert.assertTrue(koalaResortPage.girisYapilamadiElementi.isDisplayed());
        Driver.closeDriver();

    }

    @Test
    public void yanlisKullaniciVeSifre(){
        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
        KoalaResortPage koalaResortPage = new KoalaResortPage();//sadece public void yanlisKullanıcıVeSifre run yarınca pass
        koalaResortPage.ilkLoginLink.click();
        koalaResortPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("kr_wrong_username"));
        koalaResortPage.passwordTextBox.sendKeys(ConfigReader.getProperty("kr_wrong_password"));
        koalaResortPage.loginButonu.click();
        Assert.assertTrue(koalaResortPage.girisYapilamadiElementi.isDisplayed());
        Driver.closeDriver();

    }
}
