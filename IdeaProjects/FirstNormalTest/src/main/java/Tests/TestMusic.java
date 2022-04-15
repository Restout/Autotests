package Tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMusic {
    @Test
    public void TestMyMusic(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\artem\\Chromium\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://ok.ru");

    }
    @BeforeAll
    public void IniDirver(){

    }



}
