package tests;

import io.qameta.allure.*;
import pages.LoginPage;
import pages.MainPage;
import pages.MessagePage;
import values.OKValues;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Timeout(value = 20)
@Epic("Тесты одноклассников")
@Feature("Сообщения")
@Story("Отправка сообщения")
public class TestSendMessage extends BaseTest {
    @Test
    @DisplayName("Message Test")
    @Link(name = "Ссылка", url = "https://ok.ru/")
    @Owner("Никита Давыдов")
    @Severity(value = SeverityLevel.BLOCKER)
    public void testMessage() {
        LoginPage login = new LoginPage();
        login.check();
        login.Authorization(OKValues.LOGIN, OKValues.PASSWORD);
        MainPage main = new MainPage();
        main.check();
        main.openMessages();
        MessagePage message = new MessagePage();
        message.check();
        message.find().printMessage("Привет");
        assertTrue(message.getMessageText().contains("Привет"));
    }
}
