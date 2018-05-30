package info.vehicle.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.List;

public class ConfirmVehiclePage extends BasePage {

    public ConfirmVehiclePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how=How.CSS, using="span.reg-mark")
    public static WebElement registrationNumber;

    @FindBy(how=How.CSS, using="span strong")
    public static WebElement make;

    @FindBy(how=How.CSS, using="li span strong")
    public static List<WebElement>  colour;

    @FindBy(how=How.ID, using="Correct_True")
    public static WebElement yesRadioButton;

    @FindBy(how=How.ID, using="Correct_False")
    public static WebElement noRadioButton;

    @FindBy(how = How.CLASS_NAME, using = "button")
    public static WebElement continueButton;

}
