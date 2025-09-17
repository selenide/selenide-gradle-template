package org.selenide.example.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.selenide.example.tests.pagewidgets.UserTagsWidget;
import org.selenide.example.tests.pagewidgets.Users;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.partialTextCaseSensitive;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.TextCheck.FULL_TEXT;

/**
 * Simple Selenide Test with PageObjects
 */
public class SearchTest {
    @BeforeEach
    void setUp() {
        Configuration.timeout = 2000;
        Configuration.textCheck = FULL_TEXT;
        Configuration.fastSetValue = true;
    }

    @Test
    public void searchForSelenide() {
        // Arrange
        open("https://selenide.org/users.html");

        // Act
        new UserTagsWidget().searchFor("estonia");

        // Assert
        Users results = new Users();
        results.found.shouldHave(sizeGreaterThan(10));
        results.getResult(0).shouldHave(partialTextCaseSensitive("estonia"));
    }
}
