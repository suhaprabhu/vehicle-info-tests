package info.vehicle.actions;

import env.DriverUtil;

import info.vehicle.helpers.Log;
import info.vehicle.methods.AssertionMethods;
import info.vehicle.methods.BaseTest;
import info.vehicle.pages.BasePage;
import info.vehicle.pages.ConfirmVehiclePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Map;

public class ConfirmVehicleAction {

    private WebDriver driver = DriverUtil.getDefaultDriver();
    private  List<Map<String, String>> testData;


    public static String getRegistrationNumber(){
        String regText = ConfirmVehiclePage.registrationNumber.getText();
        return regText;
    }
    public static String getmake(){
        return (ConfirmVehiclePage.make).getText();
    }
    public static String getcolour(){
        List<WebElement> values = ConfirmVehiclePage.colour;
        return values.get(values.size()-1).getText();
    }

    public static void confirmVehicleDetailsSelect(Boolean MatchedwithDataTable) {
        ConfirmVehiclePage.yesRadioButton.isDisplayed();
        ConfirmVehiclePage.noRadioButton.isDisplayed();
        if (MatchedwithDataTable) {
            ConfirmVehiclePage.yesRadioButton.click();
        } else {
            ConfirmVehiclePage.noRadioButton.click();
        }
        clickContinueButton();
    }
    private static void clickContinueButton() {
        ConfirmVehiclePage.continueButton.click();
    }

    public static void Execute(WebDriver driver, List <Map <String, String>> testData) throws Exception {
        String testReg = testData.get(BasePage.testDataIndex).get("Registration");
        Assert.assertEquals(getRegistrationNumber(),testReg);
        Log.info("************************************************************************************ " +
                "Assert Registartion entered is same as in confirm Vehicle page" );
        String testMake = testData.get(BasePage.testDataIndex).get("Make");
        Assert.assertEquals(getmake(),testMake);
        Log.info("************************************************************************************ " +
                "Assert Make of the Vehicle from Excel is same as in confirm Vehicle page" );
        String testColour = testData.get(BasePage.testDataIndex).get("Colour");
        confirmVehicleDetailsSelect(getcolour().equals(testColour));
        Log.info("************************************************************************************" +
                " Assert Colour of the Vehicle from Excel is ssame as in confirm Vehicle page" );
    }


}
