package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class UnitedAirlinesMainPage {
    public UnitedAirlinesMainPage(WebDriver driver){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//div[@role='tablist']/a/span")
    public List<WebElement> navigationMenu;

    @FindBy(xpath = "//ul[@class='app-components-BookTravel-bookTravel__travelNav--3RNBj']/li/h2")
    public List<WebElement> bookTravelMenu;

    @FindBy(xpath = "//fieldset[@name='flightType']/div/label")
    public List<WebElement> tripRadioButtons;

    @FindBy(xpath = "//fieldset[@name='flightType']/div/label/input")
    public List<WebElement> tripRadioButtonsInput;

    @FindBy(css = "label[for='award']")
    public WebElement bookWithMilesCheckBox;

    @FindBy(css = "label[for='flexibleDates']")
    public WebElement flexibleDatesCheckBox;

    @FindBy(id = "bookFlightDestinationInput")
    public WebElement cityInputBox;

    @FindBy(id = "DepartDate")
    public WebElement dateInputBox;

    @FindBy(css = "#cabinType div")
    public WebElement cabinDropdown;

    @FindBy(css = "ul[role='listbox']>li")
    public List<WebElement> cabinDropdowns;

    @FindBy(css = "button[class*='app-components-BookFlightForm-bookFlightForm__findFlightBtn--']")
    public WebElement findFlightsButton;



}
