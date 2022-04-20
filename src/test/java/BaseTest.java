import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import aquality.selenium.core.utilities.ISettingsFile;
import aquality.selenium.core.utilities.JsonSettingsFile;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    protected void beforeMethod() {
        ISettingsFile config = new JsonSettingsFile("config.json");
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
