package pages;

import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class TermsPage extends Form {
    public TermsPage() {
        super(By.xpath("//body[contains(text(),'This is the terms and conditions document.')]"), "TermsPage");
    }
}
