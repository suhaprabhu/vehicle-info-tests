package info.vehicle.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VehicleQueryPage extends BasePage {

    public VehicleQueryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how=How.CSS, using="input#Vrm.form-control.form-control-1-4.input-upper")
    public static WebElement registrationNumber;

    @FindBy(how=How.CLASS_NAME, using="button")
    public static WebElement continueButton;



}
