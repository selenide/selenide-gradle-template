package by.comaqa.training.tests.pagewidgets;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class GoogleSearch {

  // Elements
  SelenideElement searchField = $(byName("q"));

  // Actions
  public void searchFor(String text) {
    searchField.setValue(text).pressEnter();
  }
}
