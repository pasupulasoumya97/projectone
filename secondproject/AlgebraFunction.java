package com.learning.secondproject;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlgebraFunction {
public static WebDriver driver;
    
	
@BeforeMethod
public void InitializeBrowser() {
		    try {
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://www.webmath.com");
	        driver.findElement(By.linkText("Algebra")).click();
	    
		   } catch (Exception e) {
	    	 System.out.println(e.getMessage());
	    }
	  }


@Test(priority=1)
public void NumbersNumberline() {
		
	   try {
	        	
	       //Dropdown
	       driver.findElement(By.id("topicItem")).click();
           //Function
	       driver.findElement(By.xpath("//option[@value='k8numlineuse.html']")).click();
	       //Value
	       driver.findElement(By.xpath("//input[@name='n']")).sendKeys("6");
	       //Submit
	       driver.findElement(By.xpath("//input[@type='submit']")).click();
	        	
	    } catch (Exception e) {
	    System.out.println(e.getMessage());
	       
	  }
   } 		


@Test(priority=2)
public void NumbersPlacevalue() {
	
	    try {
        	
        	//Dropdown
	           driver.findElement(By.id("topicItem")).click();
            //Function
            driver.findElement(By.xpath("//option[@value='k8placevalue.html']")).click();
            //Value
            driver.findElement(By.xpath("//input[@name='number']")).sendKeys("35");
            //Submit
            driver.findElement(By.xpath("//input[@type='submit']")).click();
        	
        } catch (Exception e) {
          System.out.println(e.getMessage());
       
       }
   } 		


@Test(priority=3)
public void NumberPronounciation() {
	
	   try {
        	
        	//Dropdown
            driver.findElement(By.id("topicItem")).click();
            //Function
            driver.findElement(By.xpath("//option[@value='saynum.html']")).click();
            //Value
            driver.findElement(By.xpath("//input[@name='number']")).sendKeys("99234");
            //Submit
            driver.findElement(By.xpath("//input[@type='submit']")).click();
            
        } catch (Exception e) {
          System.out.println(e.getMessage());
     }
   } 		


@Test(priority=4)
public void NumbersRounding() {
	
	
        try {
        	
        	//Dropdown
            driver.findElement(By.id("topicItem")).click();
            //Function
            driver.findElement(By.xpath("//option[@value='k8round.html']")).click();
            //Value
            driver.findElement(By.xpath("//input[@name='number']")).sendKeys("66");
            //ConversionsDropdown
            driver.findElement(By.name("roundto")).click();
            driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[2]/form/center/center/p[3]/select/option[2]")).click();
     	    //Submit
            driver.findElement(By.xpath("//input[@type='submit']")).click();
        	
        } catch (Exception e) {
          System.out.println(e.getMessage());
       
      }
   } 		


@Test(priority=5)
public void NumbersDividing() {
	
        try {
        	
        	//Dropdown
            driver.findElement(By.id("topicItem")).click();
            //Function
            driver.findElement(By.xpath("//option[@value='divide.html']")).click();
            //Values
            driver.findElement(By.xpath("//input[@name='divisor']")).sendKeys("9");
            driver.findElement(By.xpath("//input[@name='dividend']")).sendKeys("5000");
     	    //Submit
            driver.findElement(By.xpath("//input[@type='submit']")).click();

         } catch (Exception e) {
         System.out.println(e.getMessage());
       
      }
   } 		

@AfterMethod
public void CloseBrowser() {
	
	    driver.close();
   }
}