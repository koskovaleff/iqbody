package testpackage.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://iq-body.ru/auth/")

public class SignUpPage extends PageObject {

    private By emailField = By.xpath("//*[@id=\"panel\"]/div[1]/div/div/div/div/div[3]/form/div[1]/input");
    private By passwordField = By.xpath("//*[@id=\\\"panel\\\"]/div[1]/div/div/div/div/div[3]/form/div[2]/input");
    private By loginButton = By.xpath("//*[@id=\"panel\"]/div[1]/div/div/div/div/div[3]/form/div[3]/button");
    private By errorDataMessage = By.xpath("//*[@id=\"panel\"]/div[1]/div/div/div/div/div[1]/div");


    public SignUpPage typeLogin(String email) {
        find(emailField).sendKeys(email);
        return this;
    }

    public SignUpPage typePassword(String password) {
        find(passwordField).sendKeys(password);
        return this;
    }

    public void clickSignUpButton() {
        $(loginButton).click();
    }

    public String getErrorDataMessageText(String message) {
        return find(errorDataMessage).getText();

    }


}
