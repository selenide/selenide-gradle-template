package by.comaqa.training.tests;

import by.comaqa.training.tests.pagewidgets.*;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Selenide.*;

/**
 * Simple Selenide Test with PageObjects
 */
public class SearchTest {
    @BeforeEach
    void setUp() {
        Configuration.headless = true;
    }

    @Test
    public void searchForSelenide() {
        // Arrange
        open("https://duckduckgo.com");

        // Act
        new SearchPage().searchFor("selenide");

        // Assert
        SearchResults results = new SearchResults();
        results.found.shouldHave(sizeGreaterThan(1));
        results.getResult(0).shouldHave(text("Selenide"));
    }
}
