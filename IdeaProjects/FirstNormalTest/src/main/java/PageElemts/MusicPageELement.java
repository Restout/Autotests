package PageElemts;

import Pages.MusicPage;
import ValueObjects.Music;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MusicPageELement {
    private final WebDriver driver;
    private final WebElement musicElement;

    public MusicPageELement(WebDriver driver){
        this.driver=driver;
        musicElement=driver.findElement(By.xpath("//*[@id=\"music_layer_holder\"]"));

    }
    public MyMusicPageElement OpenMyMusic(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        musicElement.findElement(By.xpath("//*[contains(@data-tsid,\"library\")]")).click();
return new MyMusicPageElement(driver);
    }


    public List<Music> GetAllTracks(){
List<Music> MusicList=new ArrayList<Music>();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        List<WebElement> AllMusicTitles= musicElement.findElements(By.xpath("//*[contains(@data-l,\"t,title\")]"));
        List<WebElement>AllMusicAuthors=musicElement.findElements(By.xpath("//top-tracks-list//*[contains(@data-l,\"t,artist\")]"));
        List<WebElement>AllMusicDuration=musicElement.findElements(By.xpath("//top-tracks-list//*[contains(@class,\"duration\")]"));
        for (int i=0;i<AllMusicTitles.size();i++)
        {

            //if(AllMusicTitles.get(i).findElement(By.xpath("//*[contains(@title,\"не предназначенную для несовершеннолетних\")]")).isDisplayed()){
            //  MusicList.add(new Music(AllMusicTitles.get(i).getText(),AllMusicAuthors.get(i).getText(),AllMusicDuration.get(i).getText(),true));
            // }else
            MusicList.add(new Music(AllMusicTitles.get(i).getText(),AllMusicAuthors.get(i).getText(),AllMusicDuration.get(i).getText()));
        }
        return MusicList;
        }

        public Music AddTrack(){

            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            List<Music> PopMusic=GetAllTracks();
            WebElement x =musicElement.findElement(By.xpath("//*[@data-tsid=\"track\"]"));
            Actions actionMouse=new Actions(driver);
            actionMouse.moveToElement(x);
            actionMouse.perform();
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            x.findElement(By.xpath("//*[contains(@data-tsid,\"track_add\")]")).click();
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            return  PopMusic.get(0);
        }
}
