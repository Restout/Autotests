package Tests;

import Pages.LoginPage;
import Pages.MainPage;
import Pages.MusicPage;
import ValueObjects.User;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMusic {
    @Test
    public void TestMyMusic(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\artem\\Chromium\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://ok.ru");
        User user= new User("Артем","89213372825","qwerty123456789");
        LoginPage loginPage=new LoginPage();
        MainPage mainpage=loginPage.Login(user,driver);
        MusicPage MP=mainpage.OpenMusicPage(driver);
        MP.CheckAddedTrack();



    }




}
