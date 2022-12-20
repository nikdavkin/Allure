package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import values.OKValues;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class MessagePage {
    @Step("Поиск получателя сообщения: {name}")
    public MessagePage find() {
        $(OKValues.NAME).click();
        return this;
    }

    @Step("Отправка сообщения с текстом {message}")
    public MessagePage printMessage(String message) {
        $(OKValues.MESSAGE).click();
        $(OKValues.MESSAGE).sendKeys(message);
        $(OKValues.MSG_BUTTON).click();
        return this;
    }

    @Step("Проверка прогрузки сообщений")
    public void check() {
        Condition clickable = and("can be clicked", visible, enabled);
        $(OKValues.NAME).shouldBe(clickable, Duration.ofSeconds(5));
    }

    @Step("Получение текста для проверки выполнения теста")
    public String getMessageText() {
        return $(OKValues.LAST_MESSAGE).getText();
    }

}
