package Pages.Group;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class MyGroupPage {
    enum PAGE_ELEMENT{
        NAME("//*[@class=\"group-name_h\"]"),
        INFO("//*[@class=\"group-name_info\"]"),
        IDENTIFY("//*[@id=\"hook_Block_LeftColumnTopCard\"]");
        private String xpath;
        PAGE_ELEMENT(String xpath){
            this.xpath=xpath;
        }

    }
    String Name=null;
    String Theme=null;
    WebDriver driver;
    public MyGroupPage(WebDriver driver){
        this.driver=driver;
    }
    public MyGroupPage(WebDriver driver,String Name,String Theme){
        this.driver=driver;
        this.Name=Name;
        this.Theme=Theme;
    }
public boolean CheckPage(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
        return driver.findElement(By.xpath(PAGE_ELEMENT.IDENTIFY.xpath)).isDisplayed()
                &&Name.equals( driver.findElement(By.xpath(PAGE_ELEMENT.NAME.xpath)).getText())&&
                Theme.equals( driver.findElement(By.xpath(PAGE_ELEMENT.INFO.xpath)).getText());


}

}
