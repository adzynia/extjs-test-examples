package com.examples.extjs.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PanelElement {

  private final WebDriver driver;
  private final By by;
  private final int elementNumber;

  public PanelElement(WebDriver driver, By by, int elementNumber) {
    this.driver = driver;
    this.by = by;
    this.elementNumber = elementNumber;
  }


  public String getText() {
    return driver.findElements(by).get(elementNumber).getText();
  }
}
