package by.comaqa.training.tests.pagewidgets;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class GoogleSearch {
  private final SelenideElement searchField = $(byName("q"));

  public void searchFor(String text) {
    searchField.setValue(text).pressEnter();
  }
}
