package PageElemts;

import Pages.MusicPage;
import ValueObjects.Music;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MyMusicPageElement {
    private final WebDriver driver;
    private final WebElement musicElement;

    public MyMusicPageElement(WebDriver driver) {
        this.driver = driver;
        musicElement = driver.findElement(By.xpath("//*[@id=\"music_layer_holder\"]"));

    }
    public List<Music> GetAllTracks(){
        List<Music> MyMusicList=new ArrayList<Music>();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        List<WebElement> AllMusicTitles= musicElement.findElements(By.xpath("//*[contains(@data-l,\"t,title\")]"));
        List<WebElement>AllMusicAuthors=musicElement.findElements(By.xpath("//library-page//*[contains(@data-l,\"t,artist\")]"));
        List<WebElement>AllMusicDuration=musicElement.findElements(By.xpath("//library-page//*[contains(@class,\"duration\")]"));
        for (int i=0;i<AllMusicTitles.size();i++)
        {

           // if(AllMusicTitles.get(i).findElement(By.xpath("//*[contains(@title,\"не предназначенную для несовершеннолетних\")]"))!=null){
             //   MyMusicList.add(new Music(AllMusicTitles.get(i).getText(),AllMusicAuthors.get(i).getText(),AllMusicDuration.get(i).getText(),true));
           // }else
                MyMusicList.add(new Music(AllMusicTitles.get(i).getText(),AllMusicAuthors.get(i).getText(),AllMusicDuration.get(i).getText()));
        }
        return MyMusicList;
    }

}
