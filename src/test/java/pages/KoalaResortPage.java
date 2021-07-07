package pages;
import utilities.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class KoalaResortPage {

    public KoalaResortPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(linkText = "Log in")
    public WebElement ilkLoginLink;

    @FindBy(id = "UserName")
    public WebElement kullaniciAdi;

    @FindBy(id = "Password")
    public WebElement passwordTextBox;

    @FindBy(id = "btnSubmit")
    public WebElement loginButonu;

    @FindBy(xpath = "//*[.='Try again please']")
    public WebElement girisYapilamadiElementi;

    @FindBy(xpath = "//*[text()='Hotel Management']")
    public WebElement hotelManagement;

    @FindBy(partialLinkText = "Hotel List")
    public WebElement hotelList;

    @FindBy(xpath = "//*[text()='Add Hotel ']")
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
    //
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

    @FindBy(xpath = "//*[text()='Search']")
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

    @FindBy(xpath = "(//label[text()='Address'])[2]")
    public WebElement addressHataMesaji;

    @FindBy(xpath = "(//label[text()='Email'])[2]")
    public WebElement gmailHataMesaji;

    @FindBy(xpath = "//label[text()='Select Group']")
    public WebElement selectGroupHataMesaji;

    @FindBy(xpath = "//input[@id='IsAvailable']")
    public WebElement roomAddApprovedCheckbox;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement roomAddSaveButton;

    @FindBy(css = ".bootbox-body")
    public WebElement roomAddBasariliYazisi;


    @FindBy(partialLinkText = "Hotel Rooms")
    public WebElement hotelRoomsWebElement;

    @FindBy(id = "lkpHotels")
    public WebElement hotelRoomsSelectHotelDropDownWebElement;

    @FindBy(xpath = "//button[text()='Search']")
    public WebElement hotelRoomsSearchButonWebElement;

    @FindBy(xpath = "//td[text()='SMIRNY HOTEL']")
    public WebElement hotelAramaSmirnySonucWebElement;

    @FindBy(xpath = "//input[@name='Code']")
    public WebElement hotelRoomsAramaCodeTextBoxWebElement;

    @FindBy(xpath = "//input[@name='Name']")
    public WebElement hotelRoomsAramaNameTextBoxWebElement;

    @FindBy(xpath = "//input[@name='Location']")
    public WebElement hotelRoomsAramaLocationTextBoxWebElement;

    @FindBy(xpath = "//input[@name='Price']")
    public WebElement hotelRoomsAramaPriceTextBoxWebElement;

    @FindBy(id = "lkpGroupRoomTypes")
    public WebElement hotelRoomsAramaTypeWebElement;

    @FindBy(xpath = "(//select[@name='datatable_ajax_length'])[1]")
    public WebElement hotelRoomsAramaViewDropDownMenu;

    @FindBy(xpath = "//select[@name='IsAvailable']")
    public WebElement hotelRoomsAramaIsAvailableDropdown;


    @FindBy(xpath = "//a[@href='/admin/RoomReservationAdmin']")
    public WebElement roomReservations;

    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement addRoomReservation;

    @FindBy(xpath = "//select[@id='IDUser']")
    public WebElement IDUser;

    @FindBy(xpath = "//select[@id='IDHotelRoom']")
    public WebElement IDHotelRoom;

    @FindBy(xpath = "//input[@id='Price']")
    public WebElement Price;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement DateStart;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement DateEnd;

    @FindBy(xpath = "//input[@id='AdultAmount']")
    public WebElement AdultAmount;

    @FindBy(xpath = "(//input[@type='text'])[5]")
    public WebElement ChildrenAmount;

    @FindBy(xpath = "(//input[@type='text'])[6]")
    public WebElement ContactNameSurname;

    @FindBy(xpath = "//input[@id='ContactPhone']")
    public WebElement ContactPhone;

    @FindBy(xpath = "//input[@id='ContactEmail']")
    public WebElement ContactEmail;

    @FindBy(xpath = "//input[@id='Notes']")
    public WebElement Notes;


    public void koalaResortLogin() {
        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
        ilkLoginLink.click();
        kullaniciAdi.sendKeys(ConfigReader.getProperty("kr_valid_username"));
        passwordTextBox.sendKeys(ConfigReader.getProperty("kr_valid_password"));
        loginButonu.click();
    }

}