package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import pages.LoginPage;
import pages.MainPage;
import values.OKValues;

import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Timeout(value = 10)
@Epic("Тесты одноклассников")
@Feature("Заметки")
@Story("Добавление заметки")
public class TestAddNote extends BaseTest {
    @Test
    @DisplayName("Note Test")
    @Description("Тест добавляет запись с котиками и надписью :'Привет мир!'")
    @Owner("Никита Давыдов")
    @Severity(value = SeverityLevel.NORMAL)
    public void testAddNote() {
        LoginPage login = new LoginPage();
        login.check();
        login.Authorization(OKValues.LOGIN, OKValues.PASSWORD);
        MainPage main = new MainPage();
        main.check();
        main.clickOnNote();
        main.addNote(OKValues.NOTE_TEXT);
        assertTrue($(OKValues.NOTE_CHECK).exists());
    }

}
