package info.vehicle.actions;

import env.DriverUtil;
import info.vehicle.methods.BaseTest;
import info.vehicle.pages.BasePage;
import info.vehicle.pages.VehicleQueryPage;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import info.vehicle.helpers.Log;

public class VehicleQueryAction implements BaseTest {

    public static void Execute(WebDriver driver, List <Map <String, String>> testData) throws Exception {
        // Get a random test data
        int index = ThreadLocalRandom.current().nextInt(1, testData.size() - 1);
        assertionObj.checkTitle("Check if a vehicle is taxed and has an MOT",true);
        String reg = testData.get(index).get("Registration");
        VehicleQueryPage.registrationNumber.sendKeys(reg);
        BasePage.testDataIndex = index;
        Log.info(" Registration Number is entered in user text box " + index + " " + reg);
    }

    public static void continueButtonClick(){
        VehicleQueryPage.continueButton.click();
    }
}
