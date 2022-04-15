package Pages;

import org.openqa.selenium.support.ui.LoadableComponent;

public class MainPage extends LoadableComponent<MainPage> {
    public void load(){

    }
    public void isLoaded(){

    }
    private final String Indecator="//*[@id=\"hook_Block_Navigation\"]/div/div/a[1]/div/text()";
    public String GetIndicator(){
        return Indecator;
    }
}
