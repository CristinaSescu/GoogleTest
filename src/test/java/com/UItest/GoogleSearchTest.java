package com.UItest;

import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class GoogleSearchTest {
    @Test
    public void verifyFirstSearchResult() {
        open("https://google.com/ncr");
        $(By.name("q")).val("Rotten Tomatoes API").pressEnter();
        $$("#res .g").shouldHave(sizeGreaterThan(1));
        $("#res .g").shouldBe(visible).shouldHave(
                text("Welcome to the Rotten Tomatoes® Developer Network"),
                text("https://developer.fandango.com"));
    }

}
