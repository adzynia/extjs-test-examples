package com.examples.extjs.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class UIComponentsTest {

  @Test
  public void testPanels() {
    //open page with extJS components
    WebDriver driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.get("http://dev.sencha.com/extjs/5.1.0/examples/kitchensink/");
    driver.findElement(By.className("icon-panels")).click();
    driver.findElement(By.className("icon-basic-panels")).click();

    //initiative first panel component
    PanelElement
        panelText =
        new PanelElement(driver, By.cssSelector(".x-panel .x-panel-default"), 0);

    String panelTextValue = panelText.getText();

    System.out.println(panelTextValue);

    //initiative second panel component
    PanelElement
        panelTitle =
        new PanelElement(driver, By.cssSelector(".x-panel .x-panel-default"), 1);

    String panelTitleValue = panelTitle.getText();

    Assert.assertTrue(panelTitleValue.contains("Title"));
    
    driver.quit();
  }

}
