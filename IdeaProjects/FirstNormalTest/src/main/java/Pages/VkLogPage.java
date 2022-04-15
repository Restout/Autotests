package Pages;

import Users.User;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VkLogPage extends LoadableComponent<VkLogPage> {


    private enum Page_Elements {
        TextField("//*[contains(@class, \"EnterLogin__input\")]"),
        TextElement("//*[contains(text(), \"Вход в «OK.RU»\")]"),
        LogButton("//*[@class=\"vkc__EnterLogin__button\"]");

private String xpath;
        private Page_Elements(String xpath){
            this.xpath=xpath;
        }

    }
    public VkLogPage(){

    }

    @Override
    protected void load() {

    }

    @Override
    protected void isLoaded() throws Error {

    }
    public MainPage LogIn(User user, WebDriver driver){
        driver.switchTo().window("https://connect.vk.com/auth?app_id=7525058&uuid=ku0E9qPfe4IRwW5KDFhjF&origin=https%3A%2F%2Fok.ru&v=0.0.2");
        WebElement element=driver.findElement(By.xpath(Page_Elements.TextElement.xpath));
        driver.switchTo().frame(element);

        //ChromeDriver driver=new ChromeDriver();
        //driver.get("https://connect.vk.com/auth?app_id=7525058&uuid=bf7TALzu-Tye4lbKOXvY-&origin=https%3A%2F%2Fok.ru&v=0.0.2");
        driver.findElement(By.xpath(Page_Elements.TextField.xpath)).sendKeys(user.GetUlogin());
        return new MainPage();
    }
}
