package com.company.page.pages;

import com.company.page.factory.PageObjectFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonsPage extends PageObjectFactory<RadioButtonsPage> {
    private final String URL = "http://www.seleniumeasy.com/test/basic-radiobutton-demo.html";
    private By firstMaleRadioButton = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[1]/input");
    private By firstFemaleRadioButton = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[2]/input");
    private By getCheckedValueButton = By.xpath("//*[@id=\"buttoncheck\"]");
    private By firstValue = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[3]");
    private By secondMaleRadioButton = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[1]/input");
    private By ageRadioButton = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[2]/input");
    private By getSecondValueButton = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button");
    private By secondValue = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/p[2]");
    public RadioButtonsPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        getPage(URL);
    }

    public void closePage() {
        close();
    }

    public String getFirstValue() {
        click(getCheckedValueButton);
        return show(firstValue);
    }

    public void clickFirstMale() {
        click(firstMaleRadioButton);
    }
    public void clickFirstFemale() {click(firstFemaleRadioButton); }

    public void clickAgeButton(){click(ageRadioButton);}

    public void clickSecondMale(){click(secondMaleRadioButton);}

    public String getSecondValue(){
        click(getSecondValueButton);
        return show(secondValue);
    }
}
