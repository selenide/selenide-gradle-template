package by.comaqa.training.tests.pagewidgets;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$;

public class SearchResults {
  public final ElementsCollection found = $$("#search #rso .g");

  public SelenideElement getResult(int index) {
    return found.get(index);
  }
}
