package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import env.DriverUtil;
import info.vehicle.actions.StartPageAction;
import info.vehicle.helpers.DataHelper;
import info.vehicle.methods.BaseTest;
import info.vehicle.methods.TestCaseFailed;
import info.vehicle.pages.StartPage;
import info.vehicle.pages.VehicleQueryPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import java.util.Map;


public class StartProcessSteps implements BaseTest {

    private WebDriver driver = DriverUtil.getDefaultDriver();

    @Given("^I visit the dvla site$")
    public void navigateTo() throws TestCaseFailed {
        StartPageAction.navigateToDvla();
        PageFactory.initElements(driver, StartPage.class);
    }

    @And("^I start the process$")
    public void startProcess ()  {
        StartPageAction.startButtonClick();
    }

}
