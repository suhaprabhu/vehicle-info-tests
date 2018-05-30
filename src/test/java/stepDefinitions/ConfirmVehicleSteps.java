package stepDefinitions;

import cucumber.api.java.en.And;
import env.DriverUtil;
import info.vehicle.actions.ConfirmVehicleAction;
import info.vehicle.actions.VehicleQueryAction;
import info.vehicle.helpers.DataHelper;
import info.vehicle.methods.BaseTest;
import info.vehicle.pages.ConfirmVehiclePage;
import info.vehicle.pages.VehicleQueryPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;

public class ConfirmVehicleSteps implements BaseTest {


    private WebDriver driver = DriverUtil.getDefaultDriver();
    private List<Map<String, String>> testData;

    public ConfirmVehicleSteps() {
        try {
            testData = DataHelper.getTestData(System.getProperty("user.dir") + "/src/test/resources/data/alldata.xlsx");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^User confirms the basic details of the vehicle$")
      public void confirmVehicleDetails() throws Throwable {
            PageFactory.initElements(driver, ConfirmVehiclePage.class);
            ConfirmVehicleAction.Execute(driver, testData);
    }

}
