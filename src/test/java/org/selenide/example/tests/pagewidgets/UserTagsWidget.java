package org.selenide.example.tests.pagewidgets;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class UserTagsWidget {
    private final SelenideElement tags = $("#user-tags");

    public void searchFor(String tag) {
        tags.find(byText(tag)).click();
    }
}
