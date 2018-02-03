package com.company.page.pages;

import com.company.page.factory.PageObjectFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class OgamePage extends PageObjectFactory<OgamePage> {
    private static final String URL = "https://pl.ogame.gameforge.com";
    private By loginButton = By.xpath("//*[@id=\"loginBtn\"]");
    private By login = By.xpath("//*[@id=\"usernameLogin\"]");
    private By password = By.xpath("//*[@id=\"passwordLogin\"]");
    private By log = By.xpath("//*[@id=\"loginSubmit\"]");
    private By minerals = By.xpath("//*[@id=\"menuTable\"]/li[2]/a");
    private By metalMine = By.xpath("//*[@id=\"button1\"]/div/div/a[1]/img");
    private By crystalMine = By.xpath("//*[@id=\"button2\"]/div/div/a[1]/img");
    private By solarMine = By.xpath("//*[@id=\"button4\"]/div/div/a[1]/img");
    private By deuterMine = By.xpath("//*[@id=\"button3\"]/div/div/a[1]/img");
    public OgamePage(WebDriver webdriver) {
        super(webdriver);
    }

    public void openPage() {
        getPage(URL);
    }

    public void writeLogin(String text) {
        sendKeys(login, text);
    }

    public void writePassword(String text) {
        sendKeys(password, text);
    }

    public void submit() {
        click(log);
    }

    public void clickLoginButton() {
        click(loginButton);
    }

    public void selectServer(String serverName) {
        Select dropdown = new Select(webdriver.findElement(By.xpath("//*[@id=\"serverLogin\"]")));
        dropdown.selectByVisibleText(serverName);
    }

    public void clickMinerals() {
        click(minerals);
    }

    public void buyMine(String kind) {
        if (kind.equals("Metal")) {
            click(metalMine);
        } else if (kind.equals("Krysztal")) {
            click(crystalMine);
        } else if (kind.equals("Elektrownia")) {
            click(solarMine);
        } else if (kind.equals("Deuter")){
            click(deuterMine);
        }
    }

    public void closePage() {
        close();
    }
}
