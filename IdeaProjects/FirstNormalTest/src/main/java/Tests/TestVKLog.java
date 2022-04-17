package Tests;

import Pages.LoginPage;
import ValueObjects.User;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestVKLog {
    @Test
    public void TestVk(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\artem\\Chromium\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://ok.ru");
        LoginPage  logpage= new LoginPage();
        User user = new User("dasa","9213372825","dasda");
        logpage.LoginByVK(driver).LogIn(user,driver);
    }
}
