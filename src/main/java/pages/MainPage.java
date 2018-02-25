package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class MainPage {

    public static String PAYBEAR_MAIN_PAGE_URL = "https://www.paybear.io";

    public static SelenideElement getSignUpButton() {
        return $("a.Menu__link.Menu__link--signup");
    }

    public static SelenideElement getPricingLink() {
        return $("div.Menu__links a[href='/pricing']");
    }

    public static SelenideElement getIntegrationsLink() {
        return $("div.Menu__links a[href='/integrations']");
    }

    public static SelenideElement getFAQLink() {
        return $("div.Menu__links a[href='/faq']");
    }

    public static void openMainPage() {
        open(PAYBEAR_MAIN_PAGE_URL);
    }

}
