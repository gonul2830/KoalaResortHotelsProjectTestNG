package tests.uS_003;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KoalaResortPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_001_OtelOlusturmaPositiveTest extends TestBaseRapor {
    KoalaResortPage koalaResortPage = new KoalaResortPage();
    /*
    koalaresorthotels sitesine girin
    Sag ustteki Login butonuna tiklayin
    username butonuna valid bir username girin
    password butonuna valid password girin
    login Butonuna tiklayin
    Hotel management buttonuna tikayin
    Hotel List butonuna tiklayin
    Sag ustte bulunan ADD HOTEL butonuna tiklayin
    Code butonuna tiklayip gecerli bir numara girin
    Name butonuna tiklayip gecerli bir hotel ismi girin
    Adres butonuna tiklayip gecerli bir adres girin
    Phone butonuna tiklayip gecerli bir phone no girin
    Gmail butonuna"@", ".Com" uzantılarını içeren bir gmail girin
    IDGroup dropDown undan bir hotel tipi secin ve tiklayin
    Save butonuna tiklayin
    Hotel was inserted successfully mesaji gorulmeli
     */
    @Test
    public void test01() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
        koalaResortPage.ilkLoginLink.click();
        koalaResortPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("kr_valid_username"));
        koalaResortPage.passwordTextBox.sendKeys(ConfigReader.getProperty("kr_valid_password"));
        koalaResortPage.loginButonu.click();
        koalaResortPage.hotelManagement.click();
        koalaResortPage.hotelList.click();
        koalaResortPage.addHotel.click();

        Actions actions= new Actions(Driver.getDriver());
        actions.click(koalaResortPage.codeTextBox)
                .sendKeys(ConfigReader.getProperty("kr_code"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("kr_customer_name"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("kr_customer_adress"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("kr_customer_phone"))
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("kr_customer_email"))
                .perform();

        Thread.sleep(5000);
        Select select=new Select(koalaResortPage.acilirMenu);
        select.selectByVisibleText(ConfigReader.getProperty("kr_dropdown_value"));
        Thread.sleep(2000);
        koalaResortPage.saveButonu.click();

        Thread.sleep(2000);
        Assert.assertEquals(koalaResortPage.sonucYazisiElementi.getText(),ConfigReader.getProperty("kr_otel_olusturuldu_yazisi"));

        koalaResortPage.sonOKButonu.click();

        Driver.closeDriver();
        //test pass
         //deneme

    }

}
