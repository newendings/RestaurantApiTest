package starter.language;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class ChangeLanguage extends UIInteractionSteps {

    @Step("Change language to {0}")
    public void language(String language) {
        $(LanguageButton.LANGUAGE_BUTTON).waitUntilClickable().click();

        if (language.equals("Deutsch")) {
            $(LanguageButton.DEUTSCH).waitUntilClickable().click();
        }

        else if (language.equals("日本語") || language.equals("Japanese")) {
            $(LanguageButton.JAPANESE).waitUntilClickable().click();
        }

        else if (language.equals("한국어") || language.equals("Korean")) {
            $(LanguageButton.KOREAN).waitUntilClickable().click();
        }
    }
}
