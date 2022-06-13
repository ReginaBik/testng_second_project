package scripts;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitedAirlinesTest extends Base{

    /*Test Case 1: Validate "Main menu" navigation items
    Given user is on "https://www.united.com/en/us"
    Then user should see “Main menu” navigation items
    |BOOK                              |
    |MY TRIPS                          |
    |TRAVEL INFO            |
    |MILEAGEPLUS® PROGRAM|
    |DEALS                             |
    |HELP              */

    @Test(priority = 1, description = "TC1: Validate Main Menu navigation items")
    public void validateMainMenuNavItems(){
        driver.get("https://www.united.com/en/us");
        String[] navigationNames = {"BOOK", "MY TRIPS", "TRAVEL INFO", "MILEAGEPLUS® PROGRAM", "DEALS", "HELP"};
        for (int i = 0; i < unitedAirlinesMainPage.navigationMenu.size(); i++) {
            Assert.assertEquals(unitedAirlinesMainPage.navigationMenu.get(i).getText(), navigationNames[i]);
        }
 }


    /*Test Case 2: Validate "Book travel menu" navigation items
    Given user is on "https://www.united.com/en/us"
    Then user should see "Book travel menu" navigation items
    |Book             |
    |Flight Status|
    |Check-in       |
    |My trips        |*/

    @Test(priority = 2, description = "TC2: Validate Book travel menu navigation items")
    public void BookTravelMenuNavItems() {
        driver.get("https://www.united.com/en/us");
        String[] bookTravelMenu = {"Book", "Flight status", "Check-in", "My trips"};
        for (int i = 0; i < unitedAirlinesMainPage.bookTravelMenu.size(); i++) {
            Assert.assertEquals(unitedAirlinesMainPage.bookTravelMenu.get(i).getText(), bookTravelMenu[i]);
        }
    }



    /*Test Case 3: Validate "Round-trip" and "One-way" radio buttons
    Given user is on "https://www.united.com/en/us"
    Then validate "Roundtrip" radio button is displayed, is enabled and is selected
    And validate "One-way" radio button is displayed, is enabled but is not selected
    When user clicks on "One-way" radio button
    Then validate "One-way" radio button is selected while "Roundtrip" radio button is
    deselected*/

    @Test(priority = 3, description = "TC3: Validate Round-trip and One-way radio buttons ")
    public void validateRadioButtons() {
        driver.get("https://www.united.com/en/us");
        String onewayButtonText = "One-way";
        String roundTripButtonText = "Roundtrip";
        for (WebElement radioButton : unitedAirlinesMainPage.tripRadioButtons) {
            Assert.assertTrue(radioButton.isDisplayed());
            Assert.assertTrue(radioButton.isEnabled());
        }
        Assert.assertTrue(unitedAirlinesMainPage.tripRadioButtonsInput.get(0).isSelected());
        Assert.assertEquals(unitedAirlinesMainPage.tripRadioButtons.get(0), onewayButtonText);
        Assert.assertFalse(unitedAirlinesMainPage.tripRadioButtonsInput.get(1).isSelected());
        Assert.assertEquals(unitedAirlinesMainPage.tripRadioButtonsInput.get(1), roundTripButtonText);

  }



    /*Test Case 4: Validate "Book with miles" and "Flexible dates" checkboxes
    Given user is on "https://www.united.com/en/us"
    Then validate "Book with miles" checkbox is displayed, is enabled but is not selected
    And validate "Flexible dates" checkbox is displayed, is enabled but is not selected
    When user clicks both checkboxes
    Then validate both checkboxes are selected
    When user clicks on both selected checkboxes again
    Then validate both checkboxes are deselected*/

    @Test(priority = 4, description = "TC4 :Book with miles and Flexible dates checkboxes")
    public void testBookWithMilesAndFlexibleDates() {
        driver.get("https://www.united.com/en/us");
        Assert.assertTrue(unitedAirlinesMainPage.bookWithMilesCheckBox.isDisplayed());
        Assert.assertTrue(unitedAirlinesMainPage.bookWithMilesCheckBox.isEnabled());
        Assert.assertFalse(unitedAirlinesMainPage.bookWithMilesCheckBox.isSelected());

        Assert.assertTrue(unitedAirlinesMainPage.flexibleDatesCheckBox.isDisplayed());
        Assert.assertTrue(unitedAirlinesMainPage.flexibleDatesCheckBox.isEnabled());
        Assert.assertFalse(unitedAirlinesMainPage.flexibleDatesCheckBox.isSelected());

        unitedAirlinesMainPage.bookWithMilesCheckBox.click();
        unitedAirlinesMainPage.flexibleDatesCheckBox.click();
        unitedAirlinesMainPage.bookWithMilesCheckBox.click();
        unitedAirlinesMainPage.flexibleDatesCheckBox.click();

        Assert.assertFalse(unitedAirlinesMainPage.bookWithMilesCheckBox.isSelected());
        Assert.assertFalse(unitedAirlinesMainPage.flexibleDatesCheckBox.isSelected());
    }



    /*Test Case 5: Validate One-way ticket search results "from Chicago, IL, US (ORD) to
    Miami, FL, US (MIA)”
    Given user is on "https://www.united.com/en/us"
    When user selects "One-way" ticket radio button
    And user enters "Chicago, IL, US (ORD)" to from input box
    And user enters "Miami, FL, US (MIA)" to to input box
    And user selects "Jan 30" to the dates input box
    And user selects "2 Adults" from travelers selector
    And user selects "Business or First" from cabin dropdown
    And user clicks on "Find Flights" button
    Then validate departure equals to "Depart: Chicago, IL, US to Miami, FL, US*/

    @Test(priority = 5, description = "TC5: Validate One-way ticket search results 'from Chicago, IL, US (ORD) to Miami, FL, US (MIA)")
    public void bookingTripFromChicagoToMiami() {
        driver.get("https://www.united.com/en/us");
        unitedAirlinesMainPage.tripRadioButtonsInput.get(0).click();
        unitedAirlinesMainPage.cityInputBox.sendKeys("Miami, FL, US (MIA)");
        unitedAirlinesMainPage.dateInputBox.click();
    }




}
