import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.PrivacyPage;
import pages.Qxf2Page;
import pages.TermsPage;

public class TestCase extends BaseTest {

    @Test
    public void testCase1() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.state().waitForDisplayed(), "Main page is not open");
        mainPage.inputFieldType("0");
        mainPage.calculateButtonClick();
        Assert.assertEquals(mainPage.getCalculateResult(), "The factorial of 0 is: 1", "Text of calculateResult is not: The factorial of 0 is: 1");
    }

    @Test
    public void testCase2() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.state().waitForDisplayed(), "Main page is not open");
        mainPage.inputFieldType("1");
        mainPage.calculateButtonClick();
        Assert.assertEquals(mainPage.getCalculateResult(), "The factorial of 1 is: 1", "Text of calculateResult is not: The factorial of 0 is: 1");
    }

    @Test
    public void testCase3() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.state().waitForDisplayed(), "Main page is not open");
        mainPage.inputFieldType("169");
        mainPage.calculateButtonClick();
        Assert.assertEquals(mainPage.getCalculateResult(), "The factorial of 169 is: 4.269068009004705e+304", "Text of calculateResult is not: The factorial of 169 is: 4.269068009004705e+304");
    }

    @Test
    public void testCase4() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.state().waitForDisplayed(), "Main page is not open");
        mainPage.inputFieldType("170");
        mainPage.calculateButtonClick();
        Assert.assertEquals(mainPage.getCalculateResult(), "The factorial of 170 is: 7.257415615307999e+306", "Text of calculateResult is not: The factorial of 170 is: 7.257415615307999e+306");
    }

    @Test
    public void testCase5() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.state().waitForDisplayed(), "Main page is not open");
        mainPage.inputFieldType("171");
        mainPage.calculateButtonClick();
        Assert.assertEquals(mainPage.getCalculateResult(), "The factorial of 171 is: Infinity", "Text of calculateResult is not: The factorial of 171 is: Infinity");
    }

    @Test
    public void testCase6() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.state().waitForDisplayed(), "Main page is not open");
        mainPage.inputFieldType("ABc");
        mainPage.calculateButtonClick();
        Assert.assertEquals(mainPage.getCalculateResult(), "Please enter an integer", "Text of calculateResult is not: Please enter an integer");
    }

    @Test
    public void testCase7() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.state().waitForDisplayed(), "Main page is not open");
        mainPage.inputFieldType(" ");
        mainPage.calculateButtonClick();
        Assert.assertEquals(mainPage.getCalculateResult(), "Please enter an integer", "Text of calculateResult is not: Please enter an integer");
    }

    @Test
    public void testCase8() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.state().waitForDisplayed(), "Main page is not open");
        mainPage.privacyLinkClick();
        TermsPage termsPage = new TermsPage();
        Assert.assertTrue(termsPage.state().waitForDisplayed(), "Terms page is not open");
    }

    @Test
    public void testCase9() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.state().waitForDisplayed(), "Main page is not open");
        mainPage.termsAndConditionsLinkClick();
        PrivacyPage privacyPage = new PrivacyPage();
        Assert.assertTrue(privacyPage.state().waitForDisplayed(), "Privacy page is not open");
    }

    @Test
    public void testCase10() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.state().waitForDisplayed(), "Main page is not open");
        mainPage.qxf2ServicesLinkClick();
        Qxf2Page qxf2Page = new Qxf2Page();
        Assert.assertTrue(qxf2Page.state().waitForDisplayed(), "qxf2Page page is not open");
    }
}
