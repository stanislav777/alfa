package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class MainPage extends Form {

    private final ITextBox inputField = getElementFactory().getTextBox(By.cssSelector("input#number"), "inputField");
    private final IButton calculateButton = getElementFactory().getButton(By.xpath("//*[@id='getFactorial']"), "calculateButton");
    private final ITextBox calculateResult = getElementFactory().getTextBox(By.xpath("//*[@id='resultDiv']"), "calculateResult");
    private final ILink termsAndConditionsLink = getElementFactory().getLink(By.xpath("//a[@href='/privacy']"), "termsAndConditionsLink");
    private final ILink privacyLink = getElementFactory().getLink(By.xpath("//a[@href='/terms']"), "privacyLink");
    private final ILink qxf2ServicesLink = getElementFactory().getLink(By.xpath("//a[@href='https://www.qxf2.com/?utm_source=qa-interview&utm_medium=click&utm_campaign=From%20QA%20Interview']"), "qxf2ServicesLink");

    public MainPage() {
        super(By.cssSelector("input#number"), "Main Page");
    }

    public void inputFieldType(String a) {
        inputField.type(a);
    }

    public void calculateButtonClick() {
        calculateButton.click();
    }

    public String getCalculateResult() {
        return calculateResult.getText();
    }

    public void termsAndConditionsLinkClick() {
        termsAndConditionsLink.click();
    }

    public void privacyLinkClick() {
        privacyLink.click();
    }

    public void qxf2ServicesLinkClick() {
        qxf2ServicesLink.click();
    }


}
