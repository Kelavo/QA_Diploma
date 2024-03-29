package ru.netology.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {
    private SelenideElement heading = $$("h2").find(text("Путешествие дня"));
    private SelenideElement buyButton = $$("button").find(exactText("Купить"));
    private SelenideElement creditButton = $$ ("button").find(exactText("Купить в кредит"));

    public MainPage() {
        heading.shouldBe(visible);
    }

    public PaymentPage payByCard () {
        buyButton.click();
        return new PaymentPage();
    }

    public CreditPage payOnCredit () {
        creditButton.click();
        return new CreditPage();
    }
}