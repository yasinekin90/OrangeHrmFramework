package cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import static actions.InputAction.*;
import static actions.ButtonAction.*;
import static actions.PropertyAction.*;
import static utils.Driver.*;

public class Stepdefs {
    @Given("user on homepage")
    public void userOnHomepage() {
        getDriver().get(getProperty("url"));
    }

    @And("user write {string} into {string}")
    public void userWriteInto(String text, String label) {
        sendKeys(label,text);
    }

    @And("user clicks {string} button")
    public void userClicksButton(String name) {
        click(name);
    }
}
