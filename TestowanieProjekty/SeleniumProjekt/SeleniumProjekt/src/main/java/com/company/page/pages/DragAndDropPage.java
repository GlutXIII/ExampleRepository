package com.company.page.pages;

import com.company.page.factory.PageObjectFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage extends PageObjectFactory<CheckBoxPage> {

    private final String URL = "http://www.seleniumeasy.com/test/drag-and-drop-demo.html";

    public DragAndDropPage(WebDriver webdriver) {
        super(webdriver);
    }
    public void dragAndDrop(){

        WebElement dragItem = webdriver.findElement(By.xpath( "//*[@id=\"todrag\"]/span[1]"));
        WebElement placeToRelease = webdriver.findElement(By.xpath("//*[@id=\"mydropzone\"]"));

        Actions builder = new Actions(webdriver);
        Action dragAndDrop = builder.clickAndHold(dragItem)
                .moveToElement(placeToRelease)
                .release(placeToRelease)
                .build();
        dragAndDrop.perform();
    }
    public void openPage() {
        getPage("http://www.seleniumeasy.com/test/drag-and-drop-demo.html");
    }

    public void closePage() {
        close();
    }

}
