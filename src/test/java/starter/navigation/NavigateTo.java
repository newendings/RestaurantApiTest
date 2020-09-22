package starter.navigation;

import net.thucydides.core.annotations.Step;

public class NavigateTo {

    AppliedHomePage homePage;

    @Step("Open the home page")
    public void theHomePage() {
        homePage.open();
    }
}