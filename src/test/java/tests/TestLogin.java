package tests;

import io.qameta.allure.*;
import pages.LoginPage;
import pages.MainPage;
import values.OKValues;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Timeout(value = 10)
@Epic("Тесты одноклассников")
@Feature("Логин")
@Story("Логин с правильными данными")
@Severity(value = SeverityLevel.BLOCKER)
public class TestLogin extends BaseTest {
    @Test
    @DisplayName("Login Test")
    @Owner("Никита Давыдов")
    public void testLogin() throws IOException {
        LoginPage login = new LoginPage();
        login.check();
        login.Authorization(OKValues.LOGIN, OKValues.PASSWORD);
        MainPage main = new MainPage();
        assertEquals(OKValues.LOGIN + " " + OKValues.LOGIN, main.getUserName());
        LoginPage.getBytes("meme.png");
    }
}
