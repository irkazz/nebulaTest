package org.nebula.example;

public class LoginPageObject {
    //To keep things simple, as I'm not planning to test this page, adding only getter
    private static final String url = "https://nebula.io/insights/";

    public static String getBaseUrl() {
        return url;
    }
}
