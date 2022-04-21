package Pages;

import ValueObjects.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
    private  enum PAGE_PATHS{
        VkLogButton ("//*[contains(@class,\"vk_id\")]"),
        FiledLogin ("//*[@id=\"field_email\"]"),
        FieldPassword ( "//*[@id=\"field_password\"]"),
        LogButton("//div[contains(@class,\"login\")]/input");
        private String xpath;
        PAGE_PATHS(String xpath){
            this.xpath = xpath;
        }
    }


    public  MainPage Login(User TestUser, WebDriver driver) {
        driver.findElement(By.xpath(PAGE_PATHS.FiledLogin.xpath)).sendKeys(TestUser.GetUlogin());
        driver.findElement(By.xpath(PAGE_PATHS.FieldPassword.xpath)).sendKeys(TestUser.GetUpassword());
        driver.findElement(By.xpath(PAGE_PATHS.LogButton.xpath)).click();


return new MainPage(driver);
    }
    public VkLogPage LoginByVK( WebDriver driver){
        driver.findElement((By.xpath(PAGE_PATHS.VkLogButton.xpath))).click();
        return new VkLogPage();
    }
}
