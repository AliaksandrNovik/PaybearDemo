package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public static SelenideElement getEmailField(){
        return $("#email");
    }

    public static SelenideElement getPasswordField(){
        return $("#password");
    }

    public static SelenideElement getSubmitButton(){
        return $("button.submit-button");
    }
}
