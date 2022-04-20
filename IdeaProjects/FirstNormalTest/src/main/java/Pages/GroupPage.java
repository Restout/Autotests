package Pages;

import PageElemts.Groups.CreatGroupPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class GroupPage {
    WebDriver driver;
        enum PAGE_ELEMENTS{
            CREAT_GROUP_BUTTON("//*[text()=\"Создать группу\"]");// Change Xpath
            private  String xpath;
            PAGE_ELEMENTS(String xpath) {
                this.xpath = xpath;
            }
        }
    GroupPage(WebDriver driver){
        this.driver=driver;
    }
public CreatGroupPage OpenCreatGroup(){
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
driver.findElement(By.xpath(PAGE_ELEMENTS.CREAT_GROUP_BUTTON.xpath)).click();
return new CreatGroupPage(driver);
}
}
