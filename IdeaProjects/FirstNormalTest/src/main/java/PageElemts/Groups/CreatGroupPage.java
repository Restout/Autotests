package PageElemts.Groups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class CreatGroupPage {
    WebElement CreatGroupElement;
    WebDriver driver;
   public  CreatGroupPage(WebDriver driver){
        this.driver=driver;
        CreatGroupElement=driver.findElement(By.xpath("//*[@class=\"modal-new_center\"]"));
    }
    private String ChoseCreation(){
        List<String> Choise=Arrays.asList("Публичная или бизнес-страница","Группа по интересам");
        return Choise.get(new Random().nextInt(Choise.size()));
    }
    public CreatPage OpenCreationPage(){
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
       String WhatWeWantToOpen=ChoseCreation();
       if(ChoseCreation().equals("Публичная или бизнес-страница")){
           CreatGroupElement.findElement(By.xpath("//*[text()=\""+WhatWeWantToOpen+"\"]")).click();
       return new BuisnesGroupPage(driver);
       }
       else{
           CreatGroupElement.findElement(By.xpath("//*[text()=\""+WhatWeWantToOpen+"\"]")).click();
           return new ComunicationGroupPage(driver);
       }

    }

}
