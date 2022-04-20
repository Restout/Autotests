package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.LoadableComponent;

public class MainPage extends LoadableComponent<MainPage> {


    enum  PAGE_ELEMENTS{
        INDECATOR("//*[@id=\"hook_Block_Navigation\"]/div/div/a[1]/div/text()"),
        MUSIC_BUTTON("//*[@id=\"music_toolbar_button\"]"),
        GROUP_BUTTON("//*[contains(@data-l,\"userAltGroup\")]");
        private String xpath;
        private PAGE_ELEMENTS(String xpath){
            this.xpath=xpath;
        }
    }
    public MusicPage OpenMusicPage(WebDriver driver){
        driver.findElement(By.xpath(PAGE_ELEMENTS.MUSIC_BUTTON.xpath)).click();
        return new MusicPage(driver);
    }
    public GroupPage OpenGroups(WebDriver driver){
        driver.findElement((By.xpath(PAGE_ELEMENTS.GROUP_BUTTON.xpath))).click();
        return new GroupPage(driver);
    }
    public String GetIndicator(){
        return PAGE_ELEMENTS.INDECATOR.xpath;
    }
    public void load(){

    }
    public void isLoaded() {


assert true;
    }

}
