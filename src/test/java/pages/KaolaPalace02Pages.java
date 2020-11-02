package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KaolaPalace02Pages {
    public KaolaPalace02Pages() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(linkText = "Log in")
    public WebElement loginToPage;
    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement userName;
    @FindBy(xpath = "//input[@id='Password']")
    public WebElement password;
    @FindBy(id = "btnSubmit")
    public WebElement loginToRoom;
    @FindBy(linkText = "Hotel Management")
    public WebElement hotelManagement;
    @FindBy(linkText = "Hotel Rooms")
    public WebElement hotelRooms;
    @FindBy(linkText = "ADD HOTELROOM")
    public WebElement addHotelRoom;
    @FindBy(css = "#IDHotel")
    public WebElement hotelId;
    @FindBy(id="Code")
    public WebElement code;
    @FindBy(xpath="(//input[@class='form-control input-lg required'])[2]")
    public WebElement name;
    @FindBy(xpath = "(//input[@class='form-control input-lg required'])[3]")
    public WebElement location;
    @FindBy(className = "cke_source cke_reset cke_enable_context_menu cke_editable cke_editable_themed cke_contents_ltr")
    public WebElement description;
    @FindBy(xpath = "//textarea[@role='textbox']")
    public WebElement price;
    @FindBy(xpath = "(//select[@class='form-control input-lg required'])[2]")
    public WebElement selectRoom;
    @FindBy(id="MaxAdultCount")
    public WebElement maxAdult;
    @FindBy(id="MaxChildCount")
    public WebElement maxChildren;
    @FindBy(xpath = "//input[@id='IsAvailable']")
    public WebElement approval;
    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement save;
    @FindBy(xpath ="//div[@class='bootbox-body']")
    public WebElement successText;
    @FindBy(xpath = "//button[@data-bb-handler='ok']")
    public WebElement okButton;

}
