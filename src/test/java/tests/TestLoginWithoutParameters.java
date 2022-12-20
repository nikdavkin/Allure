package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import pages.LoginPage;
import values.OKValues;

import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Timeout(value = 10)
@Epic("Тесты одноклассников")
@Feature("Логин")
@Story("Логин без данных")
@Severity(value = SeverityLevel.CRITICAL)
public class TestLoginWithoutParameters extends BaseTest {
    @Test
    @DisplayName("Login Test Without Parameters")
    @Owner("Никита Давыдов")
    public void testLoginWithoutParameters() {
        LoginPage login = new LoginPage();
        login.check();
        login.Authorization(" ", " ");
        assertTrue($(OKValues.LOGIN_BUTTON).exists());
    }
}
