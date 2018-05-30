package info.vehicle.pages;


import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public abstract class BasePage {
    public static WebDriver driver;
    public static boolean bResult;
    public static int testDataIndex;

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        BasePage.bResult = true;
    }

}
