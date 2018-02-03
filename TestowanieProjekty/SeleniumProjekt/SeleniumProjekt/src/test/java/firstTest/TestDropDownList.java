package firstTest;

import com.company.page.pages.CheckBoxPage;
import com.company.page.pages.DropDownListPage;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class TestDropDownList {
    static{
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    }
    private static DropDownListPage webPage;
    private static final WebDriver webDriver = new ChromeDriver();


    @BeforeClass
    public static void runPage() {
        webPage = new DropDownListPage(webDriver);
        webPage.openPage();
    }
    @Test
    public void firstDropDownListTest() {
        webPage.selectFromFirstDropdownList("Sunday");
        assertTrue(webPage.getDaySelected().contains("Day selected :- Sunday"));
    }
    @Test
    public void secondDropDownListTest() throws InterruptedException {
        webPage.selectFromSecondDropdownList();
        webPage.getAllSelected();

        assertEquals("Options selected are : New York,Ohio,Texas",webPage.getResult());
    }

    @AfterClass
    public static void closePage() {
        webPage.closePage();
    }

}