
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.*;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import testpackage.steps.SignUpSteps;

@RunWith(SerenityRunner.class)
public class WhenSignUp {

    @Steps
    SignUpSteps steps;

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setUp() {
        driver.manage().window().maximize();
    }



    @Test
    public void loginWithEmptyCredential() {
        steps.openSignUpPage();
        steps.typeInvalidEmail();
        steps.should_see_error("Введите данные для входа");

    }

}
