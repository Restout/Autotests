package Tests;

import Pages.LoginPage;
import Pages.MainPage;
import Pages.MusicPage;
import ValueObjects.User;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestMusic {
    ChromeDriver driver;
    User user;
    @Test

    public void TestMyMusic(){
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\artem\\Chromium\\chromedriver.exe");
        //ChromeDriver driver = new ChromeDriver();
       // driver.get("https://ok.ru");
        //User user= new User("Артем","89213372825","qwerty123456789");
        LoginPage loginPage=new LoginPage();
        MainPage mainpage=loginPage.Login(user,driver);
        MusicPage MP=mainpage.OpenMusicPage();
        MP.CheckAddedTrack();



    }
    @BeforeEach
    public void IniDriver(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\artem\\Chromium\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://ok.ru");
        user= new User("Артем","89213372825","qwerty123456789");
    }



}
