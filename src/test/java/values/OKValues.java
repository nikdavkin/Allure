package values;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selectors.withText;

public class OKValues {
    public static final By LOGIN_BUTTON = byXpath("//*[@id='field_email']");
    public static final String URL = "https://ok.ru/";
    public static final String LOGIN = "technoPol7";
    public static final String PASSWORD = "technoPolis2022";
    public static final By PASSWORD_BUTTON = byXpath("//*[@id='field_password']");
    public static final By TOOLBAR = byXpath("//*[@class='toolbar_nav_i_ic']");
    public static final By MESSAGE = byXpath("//*[@data-tsid='write_msg_input']/div/div");
    public static final By MSG_BUTTON = byXpath("//*[@data-tsid='button_send']");
    public static final By VK_BUTTON = byXpath("//*[contains(@class,'vk_id')]");
    public static final By USER_NAME = byXpath("//*[contains(@data-l,'userPage')]");
    public static final By LAST_MESSAGE = byXpath("//*[contains(@class,'cnt __bg __last')]");
    public static final By NOTE = withText("Напишите заметку");
    public static final By NOTE_MESSAGE = byXpath("//*[contains(@class, 'ok-posting-handler')]");
    public static final By NOTE_BUTTON = byXpath("//*[contains(@class, 'posting_submit button-pro')]");
    public static final By BACKGROUNDS = byXpath("//*[contains(@data-action, 'more')]");
    public static final By BACKGROUND = byXpath("//*[contains(@data-uid, '26')]");
    public static final By NAME = byXpath("//*[contains(@caption,'Никита Давыдов')]");
    public static final String NOTE_TEXT = "Привет мир!";
    public static final By NOTE_CHECK = withText(NOTE_TEXT);
}
