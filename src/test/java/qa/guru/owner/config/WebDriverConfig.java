package qa.guru.owner.config;

import java.util.Objects;

public class WebDriverConfig {

    public String getBaseUrl() {

        //зачитываем значение из настроек
        String baseUrl = System.getProperty("baseUrl");
        //проверяем дефолтное значение
        if (Objects.isNull(baseUrl)) {
            baseUrl = "https://github.com";
        }

        return baseUrl;

    }

    public Browser getBrowser() {
        String browser = System.getProperty("browser");
        if (Objects.isNull(browser)) {
            browser = "CHROME";
        }
        return Browser.valueOf(browser);
    }
}
