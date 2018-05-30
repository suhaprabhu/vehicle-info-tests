package info.vehicle.actions;

import info.vehicle.methods.BaseTest;
import info.vehicle.methods.TestCaseFailed;
import info.vehicle.pages.StartPage;

public final class StartPageAction implements BaseTest {

    public static void navigateToDvla() throws TestCaseFailed {
        navigationObj.navigateTo("https://www.gov.uk/get-vehicle-information-from-dvla");
        assertionObj.checkTitle("Get vehicle information from DVLA - GOV.UK",true);
    }

    public static void startButtonClick(){
        StartPage.startButton.click();
    }

}
