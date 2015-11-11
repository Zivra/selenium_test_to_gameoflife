/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akyzen.webdriver;
/*
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

*/
import junit.framework.Assert;

import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 *
 * @author midalias
 */
public class titleTest {
    
    @Test
    public void titleNameTest() {
        /*
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://52.32.248.199:8080/game-of-life/");

        Assert.assertTrue("title should start differently", 
                                                driver.getTitle().startsWith("The Game Of Life"));

        driver.close();        
                */
        
        // Declaring and initialising the HtmlUnitWebDriver
        HtmlUnitDriver unitDriver = new HtmlUnitDriver();
        
        //Idalia
        unitDriver.navigate().to("http://52.33.95.230:8080/game-of-life/");
        
        Assert.assertTrue("title should start differently", 
                                                unitDriver.getTitle().startsWith("The Game Of Life"));

        System.out.println("Title is: " + unitDriver.getTitle());
        unitDriver.close();         

        /*
        // open google.com webpage
        unitDriver.get("http://google.com");

        System.out.println("Title of the page is 1-> " + unitDriver.getTitle());

        // find the search edit box on the google page
        WebElement searchBox = unitDriver.findElement(By.name("q"));

        // type in Selenium
        searchBox.sendKeys("Selenium");

        // find the search button
        //WebElement button = unitDriver.findElement(By.name("btnK"));//gbqfba

        // Click the button
        //button.click();

        System.out.println("Title of the page is 2-> " + unitDriver.getTitle());
        */
    }
}
