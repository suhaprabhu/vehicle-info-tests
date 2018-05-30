package stepDefinitions;

import cucumber.api.java.en.And;
import env.DriverUtil;
import info.vehicle.helpers.DataHelper;
import org.openqa.selenium.WebDriver;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import info.vehicle.methods.BaseTest;
import info.vehicle.pages.VehicleQueryPage;
import org.openqa.selenium.support.PageFactory;
import info.vehicle.actions.VehicleQueryAction;

public class VehicleQuerySteps implements BaseTest {


    private WebDriver driver = DriverUtil.getDefaultDriver();
    private List<Map<String, String>> testData;

    public VehicleQuerySteps() {
        try {
            testData = DataHelper.getTestData(System.getProperty("user.dir") + "/src/test/resources/data/alldata.xlsx");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @And("^User enters the registration of the vehicle for test data$")
    public void registrationDetailsEntered() throws Throwable {
        PageFactory.initElements(driver, VehicleQueryPage.class);
        VehicleQueryAction.Execute(driver, testData);
        VehicleQueryAction.continueButtonClick();
    }


}
