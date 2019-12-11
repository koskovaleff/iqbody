
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.Serenity.SerenityConfigurer;
import net.serenitybdd.core.webdriver.driverproviders.ConfigureChromeOptions;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.configuration.WebDriverConfiguration;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import net.thucydides.core.webdriver.capabilities.ChromePreferences;
import org.junit.*;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import testpackage.steps.SignUpSteps;

@RunWith(SerenityRunner.class)
public class WhenSignUp {

    @Steps
    SignUpSteps steps;

    @Managed(driver = "chrome")
    WebDriver driver;


    @Test
    public void loginWithEmptyCredential() {
        steps.openSignUpPage();
        steps.typeInvalidEmail();
        steps.should_see_error("Введите данные для входа");

    }

}
