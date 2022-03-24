import com.sun.tools.javac.Main;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
 class User{
    private String Ulogin ;
    private  String Fullname;
    private String Upassword=null;
    private String id;
    User(String name,String login, String password){
        Fullname=name;
        Ulogin=login;
        Upassword=password;

    }
    String GetFullName(){
        return  Fullname;
    }
    String GetUlogin(){
        return Ulogin;
    }
    String GetUpassword(){
        return Upassword;
    }
}
class LoginPage{
     private final String FiledLogin="//*[@id=\"field_email\"]";
     private final String FieldPassword="//*[@id=\"field_password\"]";
     private final String LogButton="//div[contains(@class,\"login\")]/input";
void Login(User TestUser,WebDriver driver){
    driver.findElement(By.xpath(FiledLogin)).sendKeys(TestUser.GetUlogin());
    driver.findElement(By.xpath(FieldPassword)).sendKeys(TestUser.GetUpassword());
driver.findElement(By.xpath(LogButton)).click();


}
}
class MainPage{
     private final String Indecator="//*[@id=\"hook_Block_Navigation\"]/div/div/a[1]/div/text()";
     String GetIndicator(){
         return Indecator;
     }

}
public class TestClass {
@Test
    public void main() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\artem\\Chromium\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://ok.ru");
        User user= new User("Aртем Шевцов","89213372825","qwerty");
        LoginPage logPage=new LoginPage();
    MainPage mainPage=new MainPage();
    logPage.Login(user,driver);
       if(mainPage.GetIndicator().equals(user.GetFullName())){
           System.out.println("Good");
       }else
           System.out.println("bAD");


    }
}
