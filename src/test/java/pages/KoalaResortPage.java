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


    @FindBy(xpath = "//*[.='Try again please']")
    public WebElement girisYapilamadiElementi;


    @FindBy (id="menuHotels")
    public WebElement hotelManagement;

    @FindBy (partialLinkText = "Hotel List")
    public WebElement hotelList;

    @FindBy (xpath = "//*[text()='Add Hotel ']")
    public WebElement addHotel;

    @FindBy(xpath = "//input[@id='Code']")
    public WebElement codeTextBox;

    @FindBy(xpath = "//input[@id='Name']")
    public WebElement nameTextBox;

    @FindBy(xpath = "//input[@id='Address']")
    public WebElement adressTextBox;

    @FindBy(xpath = "//input[@id='Phone']")
    public WebElement phoneTextBox;

    @FindBy(xpath = "//input[@id='Email']")
    public WebElement emailTextBox;

    @FindBy(id = "IDGroup")
    public WebElement acilirMenu;

    @FindBy(id = "btnSubmit")
    public WebElement saveButonu;

    @FindBy(xpath = "//div[text()='Hotel was inserted successfully']")
    public WebElement sonucYazisiElementi;

    @FindBy(xpath = "//*[text()='OK']")
    public WebElement sonOKButonu;

    @FindBy(xpath = "(//i[@class='icon-calendar'])[4]")
    public WebElement roomReservationUpdate;

    @FindBy(xpath = "(//*[text()=' Details'])[10]")
    public WebElement ahmetRoomReservationDetails;

    @FindBy(className = "sorting_1")
    public WebElement ahmetReservationHotelRoom;

    @FindBy(id = "DateEnd")
    public WebElement reservationUpdateDateEnd;

    @FindBy(xpath = "(//*[@class='day'])[10]")
    public WebElement reservationUpdateDay;

    @FindBy(xpath = "(//*[text()='Save'])[1]")
    public WebElement reservationUpdateSave;

    @FindBy(id = "btnDelete")
    public WebElement reservationUpdateDelete;

    @FindBy(id = "IDHotelRoom")
    public WebElement reservationRoomChangeHotelRoom;

    @FindBy(id = "ContactPhone")
    public WebElement reservationRoomContactPhone;




}
