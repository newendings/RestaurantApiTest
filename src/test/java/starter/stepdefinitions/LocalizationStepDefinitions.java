package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.navigation.NavigateTo;
import starter.language.ChangeLanguage;
import starter.language.LanguageDisplayed;

import static org.assertj.core.api.Assertions.assertThat;


public class LocalizationStepDefinitions {

    @Steps
    NavigateTo navigateTo;

    @Steps
    ChangeLanguage changeLanguage;

    @Steps
    LanguageDisplayed languageDisplayed;

    @Given("^(?:.*) is opening the Applied Intuition website")
    public void i_open_the_home_page() {
        navigateTo.theHomePage();
    }

    @When("she/he changes the language to {word}")
    public void i_change_language_to(String language) {
        changeLanguage.language(language);
    }

    @Then("the language box should say {word}")
    public void the_language_box_should_be(String term) throws InterruptedException {
        assertThat(languageDisplayed.displayed()).contains(term);
        Thread.sleep(1000);
    }
}

