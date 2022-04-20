package Tests.GroupTest;

import Pages.LoginPage;
import Pages.MainPage;
import ValueObjects.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewGroupTest {

    ChromeDriver driver;
    User user;
    @Test
    @DisplayName("Test check ability to create new Group")
    public  void TestNewGroup(){

        LoginPage loginPage=new LoginPage();
        MainPage main= loginPage.Login(user,driver);
main.OpenGroups(driver).OpenCreatGroup()
        .OpenCreationPage()
        .SetName()
        .ChoseTheme()
        .CreatNewGroup();
    }
    @BeforeEach
    public void IniDriver(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\artem\\Chromium\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://ok.ru");
         user= new User("Артем","89213372825","qwerty123456789");
    }
}
