package day4;

class Config {

    public static final String APP_NAME = "FixBox";
    public static final String VERSION = "1.0";
    public static final int MAX_USERS = 1000;
}

public class Question5 {

    public static void main(String[] args) {
        System.out.println(Config.APP_NAME);
        System.out.println(Config.VERSION);
        System.out.println(Config.MAX_USERS);
    }
}
