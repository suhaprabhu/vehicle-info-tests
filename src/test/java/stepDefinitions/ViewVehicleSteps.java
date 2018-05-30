package stepDefinitions;

import cucumber.api.java.en.Then;
import env.DriverUtil;
import info.vehicle.actions.VehicleQueryAction;
import info.vehicle.actions.ViewVehicleAction;
import info.vehicle.helpers.DataHelper;
import info.vehicle.methods.BaseTest;
import info.vehicle.pages.VehicleQueryPage;
import info.vehicle.pages.ViewVehiclePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;

public class ViewVehicleSteps implements BaseTest {


    private WebDriver driver = DriverUtil.getDefaultDriver();
    private List <Map <String, String>> testData;

    public ViewVehicleSteps() {
        try {
            testData = DataHelper.getTestData(System.getProperty("user.dir") + "/src/test/resources/data/alldata.xlsx");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^User sees the full vehicle details$")
    public void registrationFullVehicleDetail() throws Throwable {
        PageFactory.initElements(driver, ViewVehiclePage.class);
        ViewVehicleAction.Execute(driver, testData);
    }
}
