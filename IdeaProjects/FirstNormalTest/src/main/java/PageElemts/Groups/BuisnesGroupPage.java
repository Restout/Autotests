package PageElemts.Groups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class BuisnesGroupPage implements CreatPage{//Fix access modifyers
    WebDriver driver;
    WebElement element;
    Random RANDOM=new Random();
    BuisnesGroupPage(WebDriver driver){
        this.driver=driver;
        element= driver.findElement(By.xpath("//*[@class=\"modal-new_center\"]"));
    }
@Override
    public CreatPage SetName(){
    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
element.findElement(By.xpath(Naming)).sendKeys(Name);
    return this;
}
@Override
public CreatPage ChoseTheme(){
    element.findElement(By.xpath(Theme)).click();
    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        List<WebElement> Themes=element.findElements(By.xpath("//*[contains(@data-id,\"Category\")]//*[@class=\"multi-select-suggest_i_label\"]"));
    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    element.findElement(By.xpath("//*[text()=\""+Themes.get(RANDOM.nextInt(Themes.size())).getText()+"\"]")).click();
    return this;
}
    public  void CreatNewGroup(){
        element.findElement(By.xpath("//*[@id=\"hook_FormButton_button_create\"]")).click();
    }
}
