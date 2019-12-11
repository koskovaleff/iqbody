package testpackage.steps;

import net.thucydides.core.annotations.Step;
import testpackage.pages.SignUpPage;

public class SignUpSteps {
    private SignUpPage page;

    @Step("Open page")
    public void openSignUpPage() {
        page.open();
    }


    @Step("User login with empty credentials")
    public void typeInvalidEmail() {
        page.clickSignUpButton();

    }

    @Step("User should see error")
    public void should_see_error(String text) {
        page.getErrorDataMessageText(text);
                //Assertions(page.getErrorDataMessageText(text))
                //.as("User should see message, but he doesn't")
                //.isTrue();

    }
}
