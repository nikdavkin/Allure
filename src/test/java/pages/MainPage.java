package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import values.OKValues;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    @Step("Открытие вкладки 'Сообщения'")
    public void openMessages() {
        $(OKValues.TOOLBAR).click();
    }

    @Step("Получение имени профиля для проверки теста")
    public String getUserName() {
        return $(OKValues.USER_NAME).getText();
    }

    @Step("Проверка на прогрузку главной страницы")
    public void check() {
        $(OKValues.TOOLBAR).shouldBe(Condition.visible);
        $(OKValues.NOTE).shouldBe(Condition.visible);
    }

    @Step("Нажатие на заметки и выбор фона с котиком")
    public MainPage clickOnNote() {
        $(OKValues.NOTE).click();
        $(OKValues.BACKGROUNDS).click();
        $(OKValues.BACKGROUND).click();
        return this;
    }

    @Step("Создание заметки с текстом {message}")
    public MainPage addNote(String message) {
        $(OKValues.NOTE_MESSAGE).setValue(message);
        $(OKValues.NOTE_BUTTON).click();
        return this;
    }
}
