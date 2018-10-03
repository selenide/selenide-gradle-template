package by.comaqa.training.tests;

import by.comaqa.training.tests.pagewidgets.*;

import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Selenide.*;

/**
 * Simple Selenide Test with PageObjects
 */
public class GoogleTest

{
    @Test
    public void searchForSelenide() {
        // Arrange
        open("https://google.com/ncr");
        // Act
        new GoogleSearch().searchFor("selenide");

        // Assert
        SearchResults results = new SearchResults();
        results.found.shouldHave(sizeGreaterThan(1));
        results.getResult(0).shouldHave(text("Selenide: concise UI tests in Java"));
    }
}
