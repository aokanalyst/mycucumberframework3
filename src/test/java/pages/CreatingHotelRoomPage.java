package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreatingHotelRoomPage {

    public CreatingHotelRoomPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Log in")
    public WebElement loginButton;

    @FindBy(id = "UserName")
    public WebElement usernameBox;

    @FindBy(id = "Password")
    public WebElement passwordBox;

    @FindBy(id = "btnSubmit")
    public WebElement loginClick;

    @FindBy(linkText = "Hotel Management")
    public WebElement hotelManagement;

    @FindBy(partialLinkText = "Hotel Rooms")
    public WebElement hotelRooms;

    @FindBy(partialLinkText = "ADD HOTELROOM")
    public WebElement addHotelRoomButton;

    @FindBy(id = "IDHotel")
    public WebElement idHotelDropdown;

    @FindBy(id = "Code")
    public WebElement code;

    @FindBy(id = "Name")
    public WebElement name;

    @FindBy(id = "Location")
    public WebElement location;

    @FindBy(xpath = "//textarea[@dir='ltr']")
    public WebElement description;

    @FindBy(id = "Price")
    public WebElement priceBox;

    @FindBy(id = "IDGroupRoomType")
    public WebElement roomTypeDropdown;

    @FindBy(id = "MaxAdultCount")
    public WebElement maxAdultCount;

    @FindBy(id = "MaxChildCount")
    public WebElement maxChildrenCount;

    @FindBy(id = "IsAvailable")
    public WebElement approvedCheckbox;

    @FindBy(id = "btnSubmit")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement successMessage;

    @FindBy(xpath = "(//button[@type='button'])[6]")
    public WebElement okButton;

    @FindBy (xpath = "//input[@name='IDHotelRoom']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@class='btn btn-sm yellow filter-submit margin-bottom']")
    public WebElement searchButton;

    @FindBy (xpath = "//tr[1]//td[1]")
    public WebElement nameField;

}
