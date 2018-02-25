package test;


import com.codeborne.selenide.WebDriverRunner;
import driver.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;

public class TestClass extends Driver {


    @Test
    public void signUpPopUpWindowTest() {
        MainPage.openMainPage();
        MainPage.getSignUpButton().click();

        Assert.assertTrue(LoginPage.getEmailField().isDisplayed(), "Email field must be displayed");
        Assert.assertTrue(LoginPage.getPasswordField().isDisplayed(), "Password field must be displayed");
        Assert.assertTrue(LoginPage.getSubmitButton().isDisplayed(), "Submit field must be displayed");
    }

    @Test
    public void checkPricingLinkUrl() {
        MainPage.openMainPage();
        MainPage.getPricingLink().click();
        final String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://www.paybear.io/pricing", "Incorect browser url");
    }

    @Test
    public void checkIntegrationLinkUrl() {
        MainPage.openMainPage();
        MainPage.getIntegrationsLink().click();
        final String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://www.paybear.io/integrations", "Incorect browser url");
    }

    @Test
    public void checkFAQLinkUrl() {
        MainPage.openMainPage();
        MainPage.getFAQLink().click();
        final String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://www.paybear.io/faq", "Incorect browser url");
    }


}
