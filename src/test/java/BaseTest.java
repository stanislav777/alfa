import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static Utils.ReadJSON.config;

public class BaseTest {

    @BeforeMethod
    protected void beforeMethod() {
        getBrowser().goTo(config.getValue("/startUrl").toString());
    }

    @AfterMethod
    public void afterTest(ITestResult result) {

        if (AqualityServices.isBrowserStarted()) {
            getBrowser().quit();
        }
    }

    protected Browser getBrowser() {
        return AqualityServices.getBrowser();
    }
}
