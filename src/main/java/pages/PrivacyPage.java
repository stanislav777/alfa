package pages;

import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class PrivacyPage extends Form {

    public PrivacyPage() {
        super(By.xpath("//body[text()='This is the privacy document. We are not yet ready with it. Stay tuned!']"), "privacyPage");
    }
}
