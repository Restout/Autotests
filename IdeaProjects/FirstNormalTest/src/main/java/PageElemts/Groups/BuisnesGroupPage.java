package PageElemts.Groups;

import Pages.Group.MyGroupPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class BuisnesGroupPage implements CreatPage{//Fix access modifyers
    WebDriver driver;
    WebElement element;
     String Name=RandomName();
    Random RANDOM=new Random();
    BuisnesGroupPage(WebDriver driver){
        this.driver=driver;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
        element= driver.findElement(By.xpath("//*[@class=\"modal-new_center\"]"));
    }
@Override
    public CreatPage SetName(){
        try {

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
                element.findElement(By.xpath(Naming)).sendKeys(Name);
        }
        catch (Exception e){

            System.out.println("Here is Exeption:"+ e .getMessage());
        }
    return this;
}
@Override
public CreatPage ChoseTheme(){
    element.findElement(By.xpath(Theme)).click();
    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        List<WebElement> Themes=element.findElements(By.xpath("//*[contains(@data-id,\"Category\")]//*[@class=\"multi-select-suggest_i_label\"]"));
    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    element.findElement(By.xpath("//*[text()=\""+Themes.get(RANDOM.nextInt(Themes.size())).getText()+"\"]")).click();
    return this;
}
    public MyGroupPage CreatNewGroup(){
        element.findElement(By.xpath("//*[@id=\"hook_FormButton_button_create\"]")).click();
        return  new MyGroupPage(driver,Name,Theme);
    }
}
