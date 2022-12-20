package tests;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BaseTest {
    @BeforeAll

    @Step("Открытие сайта Одноклассники")
    public static void open() {
        Selenide.open("https://ok.ru/");
    }

    @Step("Закрытие веб-драйвера")
    @AfterAll
    public static void close() {
        closeWebDriver();
    }
}
