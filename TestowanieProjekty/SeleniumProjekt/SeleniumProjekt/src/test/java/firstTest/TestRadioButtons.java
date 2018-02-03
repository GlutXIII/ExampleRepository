package firstTest;

import com.company.page.pages.AjaxFormSubmitPage;
import com.company.page.pages.RadioButtonsPage;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static junit.framework.TestCase.assertTrue;

public class TestRadioButtons {
    static{
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    }
    static private RadioButtonsPage webPage;
    private static final WebDriver webDriver = new ChromeDriver();


    @BeforeClass
    public static void runPage() {
        webPage = new RadioButtonsPage(webDriver);
        webPage.openPage();
    }

    @Test
    public void radioButtonTest() throws InterruptedException {
        assertTrue(webPage.getFirstValue().contains("Radio button is Not"));
        webPage.clickFirstFemale();
        assertTrue(webPage.getFirstValue().contains("Radio button 'Female'"));
        webPage.clickFirstMale();
        assertTrue(webPage.getFirstValue().contains("Radio button 'Male'"));
    }

    @Test
    public void groupRadioButtonsTest(){
        webPage.clickSecondMale();
        webPage.clickAgeButton();
       assertTrue(webPage.getSecondValue().contains("Sex : Male\n" +
               "Age group: 5 - 15"));
    }

    @AfterClass
    static public void closePage() {
        webPage.closePage();
    }
}
