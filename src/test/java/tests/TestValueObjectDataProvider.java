package tests;

import org.junit.jupiter.api.Disabled;
import values.OKValues;
import values.TestBot;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestValueObjectDataProvider {
    @ParameterizedTest(name = "Проверяем несколько тест ботов")
    @ValueSource(strings = {OKValues.LOGIN, "Nikita123"})
    @Disabled
    public void testValueObjectDataProvider(String argument) {
        TestBot testBot1 = new TestBot(OKValues.LOGIN, OKValues.PASSWORD);
        TestBot testBot2 = new TestBot("Nikita", "Nikita123");
        assertTrue(testBot1.LOGIN().equals(argument) || testBot2.PASSWORD().equals(argument), "Error");
    }
}
