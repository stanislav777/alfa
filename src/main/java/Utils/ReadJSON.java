package Utils;

import aquality.selenium.core.utilities.ISettingsFile;
import aquality.selenium.core.utilities.JsonSettingsFile;

public class ReadJSON {
    public static ISettingsFile config = new JsonSettingsFile("config.json");
    public static ISettingsFile testData = new JsonSettingsFile("testData.json");
}
