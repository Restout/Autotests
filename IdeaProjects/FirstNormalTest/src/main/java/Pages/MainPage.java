package Pages;

import Pages.Group.GroupPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainPage extends LoadableComponent<MainPage> {


    enum  PAGE_ELEMENTS{
        INDECATOR("//*[@id=\"hook_Block_Navigation\"]/div/div/div[1]/a/div"),
        MUSIC_BUTTON("//*[@id=\"music_toolbar_button\"]"),
        GROUP_BUTTON("//*[contains(@data-l,\"userAltGroup\")]"),
        IDENTITY_1("//*[@class=\"feed-w\"]"),
        IDENTITY_2("//*[@name=\"photo\"]");
        private String xpath;


        private PAGE_ELEMENTS(String xpath){
            this.xpath=xpath;
        }
    }
    WebDriver driver;
    public MainPage(WebDriver driver){
        this.driver=driver;
    }
    public MusicPage OpenMusicPage(){
        driver.findElement(By.xpath(PAGE_ELEMENTS.MUSIC_BUTTON.xpath)).click();
        return new MusicPage(driver);
    }
    public GroupPage OpenGroups(){
        driver.findElement((By.xpath(PAGE_ELEMENTS.GROUP_BUTTON.xpath))).click();
        return new GroupPage(driver);
    }
    public String GetIndicator(){
        return driver.findElement(By.xpath(PAGE_ELEMENTS.INDECATOR.xpath)).getText();
    }
    public void load(){
driver.findElement(By.xpath("//*[@id=\"topPanelLeftCorner\"]")).click();
    }
    public void isLoaded() {


assertTrue(driver.findElement(By.xpath(PAGE_ELEMENTS.IDENTITY_1.xpath)).isDisplayed()&&
        driver.findElement(By.xpath(PAGE_ELEMENTS.IDENTITY_2.xpath)).isDisplayed()) ;
    }

}
