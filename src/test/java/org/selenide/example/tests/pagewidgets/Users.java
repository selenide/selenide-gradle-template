package org.selenide.example.tests.pagewidgets;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$;

public class Users {
    public final ElementsCollection found = $$("#selenide-users .user:not(.hidden)");

    public SelenideElement getResult(int index) {
        return found.get(index);
    }
}
