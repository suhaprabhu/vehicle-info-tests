package info.vehicle.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ViewVehiclePage extends BasePage {

    public ViewVehiclePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how=How.CLASS_NAME, using="reg-mark")
    public static WebElement registrationNumber;
}
