package info.vehicle.actions;

import info.vehicle.methods.BaseTest;
import info.vehicle.pages.BasePage;
import info.vehicle.pages.ViewVehiclePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

public class ViewVehicleAction implements BaseTest {

    public static String getRegistrationNumber(){
        String regText = ViewVehiclePage.registrationNumber.getText();
        return regText;
    }


    public static void Execute(WebDriver driver, List<Map<String, String>> testData ) throws Exception {
        String testReg = testData.get(BasePage.testDataIndex).get("Registration");
        Assert.assertEquals(getRegistrationNumber(), testReg);
    }

}
