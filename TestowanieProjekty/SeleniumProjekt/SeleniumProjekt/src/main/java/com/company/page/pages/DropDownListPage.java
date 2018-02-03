package com.company.page.pages;

import com.company.page.factory.PageObjectFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDownListPage extends PageObjectFactory<DropDownListPage> {
    private final String URL = "http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html";
    private By daySelected = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[2]");
    private By allSelected = By.xpath("//*[@id=\"printAll\"]");
    private By resultOfAllSelected = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/p[2]");

    public DropDownListPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        getPage(URL);
    }

    public void closePage() {
        close();
    }

    public void selectFromFirstDropdownList(String selected) {
        Select dropdown = new Select(webdriver.findElement(By.xpath("//*[@id=\"select-demo\"]")));
        dropdown.selectByVisibleText(selected);
    }

    public String getDaySelected() {
        return show(daySelected);
    }

    public void selectFromSecondDropdownList() {
        Select select = new Select(webdriver.findElement(By.xpath("//*[@id=\"multi-select\"]")));

        Actions builder = new Actions(webdriver);
        builder.keyDown(Keys.CONTROL)
                .click(select.getOptions().get(3))
                .click(select.getOptions().get(3))
                .click(select.getOptions().get(4))
                .click(select.getOptions().get(5))
                .keyUp(Keys.CONTROL)
                ;

        builder.build().perform();
    }

    public void getAllSelected(){
        click(allSelected);
    }

    public String getResult(){
        return show(resultOfAllSelected);
    }
}
