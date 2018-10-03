package by.comaqa.training.tests.pagewidgets;


import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SearchResults {

  // Elements
  public ElementsCollection found = $$("#ires .g");

  // Actions
  public SelenideElement getResult(int index) {
    return found.get(index);
  }

}
