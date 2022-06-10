package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UnitedAirlinesMainPage {
    public UnitedAirlinesMainPage(WebDriver driver){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "div[role='tablist']")
    public WebElement mainMenuNavigationItems;


}
