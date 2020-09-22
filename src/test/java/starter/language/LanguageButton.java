package starter.language;

import org.openqa.selenium.By;

class LanguageButton {
    static By LANGUAGE_BUTTON = By.cssSelector(".lang-selected");
    static By DEUTSCH = By.xpath("//a[contains(@href, '/de/home')]");
    static By JAPANESE = By.xpath("//a[contains(@href, '/jp/home')]");
    static By KOREAN = By.xpath("//a[contains(@href, '/kr/home')]");
}