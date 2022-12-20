package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import pages.LoginPage;
import values.OKValues;


import java.util.concurrent.ThreadLocalRandom;

import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Timeout(value = 10)
@Epic("Тесты одноклассников")
@Feature("Логин")
@Story("Логин с неправильными данными")
@Severity(value = SeverityLevel.CRITICAL)
public class TestIncorrectLogin extends BaseTest {
    @Test
    @Flaky
    @DisplayName("Incorrect Login Test")
    @Owner("Никита Давыдов")
    public void testIncorrectLogin() {
        LoginPage login = new LoginPage();
        login.check();
        login.Authorization(OKValues.LOGIN, OKValues.LOGIN);
        //assertTrue($(OKValues.LOGIN_BUTTON).exists());
        int randomNum = ThreadLocalRandom.current().nextInt(0, 2);
        if (randomNum == 0) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }
}
