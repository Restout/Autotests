package Tests;

import Pages.LoginPage;
import Pages.MainPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import ValueObjects.User;

public class TestClass {
    @Test
    public void main() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\artem\\Chromium\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://ok.ru");
        User user= new User("Aртем Шевцов","89213372825","qwerty123456789");
        LoginPage logPage=new LoginPage();
    MainPage mainPage=logPage.Login(user, driver);
        assert (mainPage.GetIndicator().equals(user.GetFullName())):"Bad";


    }
}
