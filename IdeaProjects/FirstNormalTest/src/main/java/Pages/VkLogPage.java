package Pages;

import ValueObjects.User;
import com.google.common.base.Preconditions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;

import java.util.Set;

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
    public void switchToWindow(int number, WebDriver driver) {

        Set<String> windowHandles = driver.getWindowHandles();
        Preconditions.checkState(windowHandles.size() >= number, "Window handles set too small");
        String handle = windowHandles.toArray()[number].toString();
        driver.switchTo().window(handle);
    }
    public MainPage LogIn(User user, WebDriver driver){
       switchToWindow(1,driver);
        driver.findElement(By.xpath(Page_Elements.TextField.xpath)).sendKeys(user.GetUlogin());
        return new MainPage(driver);
    }
}
