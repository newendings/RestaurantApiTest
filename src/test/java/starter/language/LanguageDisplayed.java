package starter.language;

import net.serenitybdd.core.steps.UIInteractionSteps;


public class LanguageDisplayed extends UIInteractionSteps {
    public String displayed() {
        return find(LanguageButton.LANGUAGE_BUTTON).getText();
    }
}