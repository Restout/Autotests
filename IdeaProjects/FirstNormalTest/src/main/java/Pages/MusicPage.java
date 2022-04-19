package Pages;

import PageElemts.MusicPageELement;
import PageElemts.MyMusicPageElement;
import ValueObjects.Music;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.nio.file.WatchEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MusicPage {
    public MusicPageELement MusicElement;
    private MyMusicPageElement MyMusicBlock;
    private WebDriver driver;
    MusicPage(WebDriver driver){
        this.driver=driver;
        MusicElement=new MusicPageELement(driver);
    }

    public MusicPage OpenMyMusic(){

        driver.findElement(By.xpath("//*[contains(@data-tsid,\"library\")]")).click();
        return this;
    }
    public void CheckAddedTrack(){
        Music AddMusic=MusicElement.AddTrack();
        MyMusicPageElement MyMusic=MusicElement.OpenMyMusic();
        List<Music> MyMusicList=MusicElement
                .OpenMyMusic()
                .GetAllTracks();
            assert AddMusic.equals(MyMusicList.get(0));

    }


}
