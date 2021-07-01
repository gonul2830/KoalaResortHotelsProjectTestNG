package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.KoalaResortPage;
import pages.KoalaResortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class KoalaResortStepDefinitions {
    KoalaResortPage koalaResortHotelsPage = new KoalaResortPage();

    @Given("Kullanıcı KOALARESORTHOTELS sayfasına gider")
    public void kullanıcı_koalaresorthotels_sayfasına_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
    }

    @Then("Log in yazisina tiklar")
    public void log_in_yazisina_tiklar() {
        koalaResortHotelsPage.ilkLoginLink.click();
    }

    @Then("gecerli username girer")
    public void gecerli_username_girer() {
        koalaResortHotelsPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("kr_valid_username"));
    }

    @Then("gecerli password girer")
    public void gecerli_password_girer() {
        koalaResortHotelsPage.passwordTextBox.sendKeys(ConfigReader.getProperty("kr_valid_password"));
    }

    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
        koalaResortHotelsPage.loginButonu.click();
    }

    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {
        Assert.assertEquals(ConfigReader.getProperty("kr_basarili_giris_url"),Driver.getDriver().getCurrentUrl());
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }


    ///===============NEGATİVE ===================////

    @Then("gecersiz username girer")
    public void gecersiz_username_girer() {
        koalaResortHotelsPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("kr_wrong_username"));
    }

    @Then("gecersiz password girer")
    public void gecersiz_password_girer() {
        koalaResortHotelsPage.passwordTextBox.sendKeys(ConfigReader.getProperty("kr_wrong_password"));
    }

    @Then("kullanici sayfaya giris yapamadigini kontrol eder")
    public void kullanici_sayfaya_giris_yapamadigini_kontrol_eder() {
        Assert.assertTrue(koalaResortHotelsPage.girisYapilamadiElementi.isDisplayed());
    }

}

