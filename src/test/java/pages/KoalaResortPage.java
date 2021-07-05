package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KoalaResortPage {

    public KoalaResortPage(){

            PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(linkText = "Log in")
    public WebElement ilkLoginLink;

    @FindBy (id="UserName")
    public  WebElement kullaniciAdi;


    @FindBy(id="Password")
    public WebElement passwordTextBox;

    @FindBy(id="btnSubmit")
    public WebElement loginButonu;

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagementButton;

    @FindBy(xpath = "(//i[@class='icon-calendar'])[2]")
    public WebElement hotelListButton;

    @FindBy(xpath = "//span[text()='Add Hotel ']")
    public WebElement addHotelButton;

    @FindBy(xpath = "//input[@id='Name']")
    public WebElement nameTextBox;

    @FindBy(xpath = "//select[@id='IDGroup']")
    public WebElement acilirListe;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement saveButton;

    @FindBy(xpath = "//input[@id='Code']")
    public WebElement codeTextBox;

    @FindBy(xpath = "(//label[text()='Code'])[2]")
    public WebElement codeHataMesaji;

    @FindBy(xpath = "(//label[text()='Name'])[2]")
    public WebElement nameHataMesaji;

    @FindBy(xpath = "(//label[text()='Email'])[2]")
    public WebElement gmailHataMesaji;

    @FindBy(xpath = "(//label[text()='Address'])[2]")
    public WebElement addressHataMesaji;

    @FindBy(xpath = "//label[text()='Select Group']")
    public WebElement selectGroupHataMesaji;

    @FindBy(xpath = "//*[.='Try again please']")
    public WebElement girisYapilamadiElementi;

}
