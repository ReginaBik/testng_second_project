package scripts;

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



    }


}
