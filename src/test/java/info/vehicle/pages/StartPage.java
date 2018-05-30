package info.vehicle.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class StartPage extends BasePage {

    public StartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how=How.CSS, using="a.gem-c-button--start")
    public static WebElement startButton;

}
