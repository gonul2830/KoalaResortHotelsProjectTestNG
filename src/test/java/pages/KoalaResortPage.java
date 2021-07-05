package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

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

    @FindBy(xpath = "//*[.='Try again please']")
    public WebElement girisYapilamadiElementi;

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagementButton;

    @FindBy(xpath = "(//i[@class='icon-calendar'])[2]")
    public WebElement hotelListButton;

    @FindBy(xpath = "//span[text()='Add Hotel ']")
    public WebElement addHotelButton;

    @FindBy(xpath = "//input[@id='Code']")
    public WebElement codeTextBox;

    @FindBy(xpath = "//input[@id='Name']")
    public WebElement nameTextBox;

    @FindBy(xpath = "(//label[text()='Address'])[2]")
    public WebElement addressHataMesaji;

    @FindBy(xpath = "//input[@id='Phone']")
    public WebElement phoneTextBox;

    @FindBy(xpath = "//input[@id='Email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//select[@id='IDGroup']")
    public WebElement acilirListe;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[text()='Hotel was inserted successfully']")
    public WebElement sonucYazisiElementi;

    @FindBy(xpath = "//*[text()='OK']")
    public WebElement sonOKButonu;

    @FindBy(partialLinkText = "Hotel Rooms")
    public WebElement hotelRoomsBtn;

    @FindBy(xpath = "//*[text()='Add Hotelroom ']")
    public WebElement addHotelsRoom;

    @FindBy(id = "IDHotel")
    public WebElement idHotelDropDown;

    @FindBy(xpath = "//textarea[@title='Zengin Metin Editörü, Description']")
    public WebElement descriptionsTextBox;

    @FindBy(id = "IDGroupRoomType")
    public WebElement roomTypeDropdown;

    @FindBy(id = "MaxAdultCount")
    public WebElement maxAdult;

    @FindBy(xpath = "//input[@name='Phone']")
    public WebElement phoneTextTable;

    @FindBy(xpath  ="//*[text()='Search']")
    public WebElement hotelListSearchBtn;

    @FindBy(xpath = "//tbody//tr//td[3]")
    public WebElement nameHotelKontrol;

    @FindBy(xpath = "//input[@name='Email']")
    public WebElement emailTextTable;

    @FindBy(xpath = "//input[@name='Name']")
    public WebElement nameTextTable;

    @FindBy(xpath = "//input[@name='Code']")
    public WebElement codeTextTable;

    @FindBy(xpath = "(//label[text()='Code'])[2]")
    public WebElement codeHataMesaji;

    @FindBy(xpath = "(//label[text()='Name'])[2]")
    public WebElement nameHataMesaji;

    @FindBy(xpath = "(//label[text()='Email'])[2]")
    public WebElement gmailHataMesaji;

    @FindBy(xpath = "//label[text()='Select Group']")
    public WebElement selectGroupHataMesaji;

    @FindBy (xpath = "//*[text()='Hotel Management']")
    public WebElement hotelManagement;

    @FindBy (partialLinkText = "Hotel List")
    public WebElement hotelList;

    @FindBy (xpath = "//*[text()='Add Hotel ']")
    public WebElement addHotel;

    @FindBy(xpath = "//input[@id='Address']")
    public WebElement adressTextBox;

    @FindBy(id = "IDGroup")
    public WebElement acilirMenu;

    @FindBy(id = "btnSubmit")
    public WebElement saveButonu;





}
