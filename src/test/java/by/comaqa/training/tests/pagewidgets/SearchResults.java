package by.comaqa.training.tests.pagewidgets;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResults {
  public final ElementsCollection found = $$(".nrn-react-div");

  public SelenideElement getResult(int index) {
    return $(".nrn-react-div #r1-" + index);
  }

}
