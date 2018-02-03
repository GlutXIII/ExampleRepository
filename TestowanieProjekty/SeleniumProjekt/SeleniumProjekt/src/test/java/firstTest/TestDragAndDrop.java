package firstTest;

import com.company.page.pages.CheckBoxPage;
import com.company.page.pages.DragAndDropPage;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestDragAndDrop {
    static{
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    }
    private static DragAndDropPage webPage;
    private static final WebDriver webDriver = new FirefoxDriver();

    @BeforeClass
    public static void runPage() {
        webPage = new DragAndDropPage(webDriver);
        webPage.openPage();
    }

    @Test
    public void perform() throws InterruptedException {
        webPage.dragAndDrop();
      /*  Assert.assertEquals("Uncheck All",webPage.checkBoxValue());
        webPage.clickOnCheckAllButton();
        Assert.assertEquals("Check All",webPage.checkBoxValue());*/
    }

    @AfterClass
    public static void closePage() {
        webPage.closePage();
    }
}