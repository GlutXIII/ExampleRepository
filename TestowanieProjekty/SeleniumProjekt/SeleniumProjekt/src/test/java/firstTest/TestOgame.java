package firstTest;

import com.company.page.pages.CheckBoxPage;
import com.company.page.pages.OgamePage;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestOgame {
    static{
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    }
    private static OgamePage webPage;
    private static final WebDriver webDriver = new ChromeDriver();


    @BeforeClass
    public static void runPage() {
        webPage = new OgamePage(webDriver);
        webPage.openPage();
    }
    @Test
    public void login() throws InterruptedException {
        webPage.clickLoginButton();
        webPage.writeLogin("plewczuk08@wp.pl");
        webPage.writePassword("111111111");
        webPage.selectServer("Yildun");
        webPage.submit();
        Thread.sleep(2000);
        webPage.clickMinerals();
        webPage.buyMine("Metal");

    }



    @AfterClass
    public static void closePage() {
    //    webPage.closePage();
    }

}