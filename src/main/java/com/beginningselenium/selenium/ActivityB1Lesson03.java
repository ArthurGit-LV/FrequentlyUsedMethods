package com.beginningselenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityB1Lesson03 {

  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:/Users/Arthur/Documents/Chromedriver/chromedriver.exe");
    gettingStaleElementReferenceException();
  }

  private static void gettingStaleElementReferenceException(){

    WebDriver driver = new ChromeDriver();

    try {
      driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_3/activity_3_B-1.html");


      WebElement spanish = driver.findElement(By.id("spanish"));
      spanish.click();
      WebElement email = driver.findElement(By.id("inputEmail"));
      
      email.sendKeys("email@gmail.com");

      // We use getAttribute("value") because it is an input element, not a text box
      if (email.getAttribute("value").equalsIgnoreCase("email@gmail.com")) {
        System.out.println("Script worked, 'email@gmail.com' was typed.");
      } else {
        System.out.println("Something went wrong with the script, 'email@gmail.com' was not set in the email box.");
      }
    } finally {
      driver.quit();
    }
  }

}