package values;


public final class TestBot {
    private final String LOGIN;
    private final String PASSWORD;

    public TestBot(String LOGIN, String PASSWORD) {
        this.LOGIN = LOGIN;
        this.PASSWORD = PASSWORD;
    }

    public String LOGIN() {
        return LOGIN;
    }

    public String PASSWORD() {
        return PASSWORD;
    }


}
