package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import values.OKValues;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    @Step("Авторизация с данными {login} и {password}")
    public void Authorization(String login, String password) {
        $(OKValues.LOGIN_BUTTON).setValue(login);
        $(OKValues.PASSWORD_BUTTON).setValue(password).pressEnter();
    }

    @Step("Проверка прогрузки страницы логина")
    public void check() {
        $(OKValues.LOGIN_BUTTON).shouldBe(Condition.visible);
        $(OKValues.PASSWORD_BUTTON).shouldBe(Condition.visible);
    }
    @Attachment
    public static byte[] getBytes(String resourceName) throws IOException {
        return Files.readAllBytes(Paths.get("src/main", resourceName));
    }
}
