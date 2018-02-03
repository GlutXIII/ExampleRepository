package firstTest;

import com.company.page.pages.TableSortAndSearchPage;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestTableSortAndSearch {
    static{
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    }
    private static TableSortAndSearchPage webPage;
    private static final WebDriver webDriver = new ChromeDriver();

    @BeforeClass
    public static void runPage() {
        webPage = new TableSortAndSearchPage(webDriver);
        webPage.openPage();
    }

    @Test
    public void tasksFilter() {
        webPage.clickOnEntires();
        webPage.enterEntires("25");
        webPage.sortByAge();
        webPage.clickOnSearchInput();
        webPage.enterSearch("Tokyo");

        Assert.assertEquals("Showing 1 to 4 of 4 entries (filtered from 32 total entries)", webPage.getInformation());
        Assert.assertEquals("A. Satou Accountant Tokyo 33 Fri 28th Nov 08 $162,700/y", webPage.showElement());

    }

    @AfterClass
    public static void closePage() {
        webPage.closePage();
    }
}
