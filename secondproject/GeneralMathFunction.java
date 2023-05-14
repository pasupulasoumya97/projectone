package com.learning.secondproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GeneralMathFunction {
	
public static WebDriver driver;
    
	
@BeforeMethod	
public void InitializeBrowser() {
		    
	  try {
		  
	  
		  driver= new FirefoxDriver();
		  driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.get("https://www.webmath.com");
	      driver.findElement(By.linkText("General Math")).click();
	    
		} catch (Exception e) {
	      System.out.println(e.getMessage());
	  }
	}



@Test(priority=1)
public void ComplexnumbersPowerof() {
       try {
        	 
    	  //Dropdown 
          driver.findElement(By.id("topicItem")).click();
          //Function
          driver.findElement(By.xpath("//option[@value='cn_i.html']")).click();
          //Value
          driver.findElement(By.xpath("//input[@name='power']")).sendKeys("5");
    	  //Submit
          driver.findElement(By.xpath("//input[@type='submit']")).click();

       } catch (Exception e) {
       System.out.println(e.getMessage());
    }
 }
	

@Test(priority=2)
public void ComplexnumbersSubtracting() {
	

        try {
        	
           //Dropdown
           driver.findElement(By.id("topicItem")).click();
           //Function
           driver.findElement(By.xpath("//option[@value='cn_sub.html']")).click();
           //Value
           driver.findElement(By.xpath("//input[@name='s']")).sendKeys("(3i+1)-(5+2i)");
    	   //Submit
           driver.findElement(By.xpath("//input[@type='submit']")).click();

        } catch (Exception e) {
         System.out.println(e.getMessage());
       
       }
   } 		


@Test(priority = 3)
public void ConversionArea()  {
       try {
	
           //Dropdown
           driver.findElement(By.id("topicItem")).click();
           //Function
           driver.findElement(By.xpath("//option[@value='convert_area.html']")).click();
           //Value
           driver.findElement(By.xpath("//input[@name='param0']")).sendKeys("8");
           //ConversionsDropdown
           driver.findElement(By.name("param2")).click();
           driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/form/center/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/font/b/p[3]/select/option[4]")).click();
	       //Submit
           driver.findElement(By.xpath("//input[@type='submit']")).click();

 	
       } catch (Exception e) {
       System.out.println(e.getMessage());

   }
} 	


@Test(priority=4)
public void ConversionLength() {
	
	
        try {
        	
        	//Dropdown
            driver.findElement(By.id("topicItem")).click();
            //Function
            driver.findElement(By.xpath("//option[@value='convert_length.html']")).click();
          //Value
            driver.findElement(By.xpath("//input[@name='param0']")).sendKeys("8");
            //ConversionsDropdown
            driver.findElement(By.name("param1")).click();
            driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[2]/font/b/form/center/p[1]/select/option[7]")).click();
 	       //Submit
            driver.findElement(By.xpath("//input[@type='submit']")).click();

        	
        } catch (Exception e) {
          System.out.println(e.getMessage());
       
       }
   } 		


@Test(priority=5)
public void ConversionMass() {
	
	
        try {
        	
           //Dropdown
           driver.findElement(By.id("topicItem")).click();
           //Function
           driver.findElement(By.xpath("//option[@value='convert_mass.html']")).click();
           //Value
           driver.findElement(By.xpath("//input[@name='param0']")).sendKeys("5");
           //ConversionsDropdown
           driver.findElement(By.name("param1")).click();
           driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[2]/font/form/b/center/p[3]/select/option[4]")).click();
    	   //Submit
           driver.findElement(By.xpath("//input[@type='submit']")).click();

        	
        } catch (Exception e) {
          System.out.println(e.getMessage());
       
       }
   } 		


@Test(priority=6)
public void ConversionPower() {
	
	
        try {
        	
        	//Dropdown
            driver.findElement(By.id("topicItem")).click();
            //Function
            driver.findElement(By.xpath("//option[@value='convert_power.html']")).click();
            //Value
            driver.findElement(By.xpath("//input[@name='param0']")).sendKeys("25");
            //Submit
            driver.findElement(By.xpath("//input[@type='submit']")).click();

        	
        } catch (Exception e) {
          System.out.println(e.getMessage());
       
       }
   } 	


@Test(priority=7)
public void ConversionSpeed() {
	
	
        try {
        	
        	//Dropdown
            driver.findElement(By.id("topicItem")).click();
            //Function
            driver.findElement(By.xpath("//option[@value='convert_speed.html']")).click();
            //Value
            driver.findElement(By.xpath("//input[@name='param0']")).sendKeys("50");
            //Submit
            driver.findElement(By.xpath("//input[@type='submit']")).click();

        	
        } catch (Exception e) {
          System.out.println(e.getMessage());
       
       }
   } 		


@Test(priority=8)
public void ConversionTemperature() {

        try {
        	
        	//Dropdown
            driver.findElement(By.id("topicItem")).click();
            //Function
            driver.findElement(By.xpath("//option[@value='tconvert.html']")).click();
            //Value
            driver.findElement(By.xpath("//input[@name='param0']")).sendKeys("30");
            //ConversionsDropdown
            driver.findElement(By.name("param2")).click();
            driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/center/p[1]/select[2]/option[2]")).click();
     	    //Submit
            driver.findElement(By.xpath("//input[@type='submit']")).click();

        	
        } catch (Exception e) {
          System.out.println(e.getMessage());
       
     }
   } 		


@Test(priority=9)
public void ConversionVolume() {
	
        try {
        	
        	//Dropdown
            driver.findElement(By.id("topicItem")).click();
            //Function
            driver.findElement(By.xpath("//option[@value='convert_volume.html']")).click();
            //Value
            driver.findElement(By.xpath("//input[@name='param0']")).sendKeys("20");
            //ConversionsDropdown
            driver.findElement(By.name("param2")).click();
            driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[2]/font/b/form/center/p[3]/select/option[7]")).click();
     	    //Submit
            driver.findElement(By.xpath("//input[@type='submit']")).click();

        	
        } catch (Exception e) {
          System.out.println(e.getMessage());
       
       }
   } 		



@Test(priority=10)
public void GeometryBoxes() {
	
         try {
        	
        	//Dropdown
            driver.findElement(By.id("topicItem")).click();
            //Function
            driver.findElement(By.xpath("//option[@value='geo_box.html']")).click();
            //ValuesDropdown
            driver.findElement(By.xpath("//input[@name='param_value']")).sendKeys("6");
            driver.findElement(By.name("//input[@name='param_value1']")).sendKeys("8");
            driver.findElement(By.xpath("//input[@name='param_value2']")).sendKeys("2");
     	    //Submit
            driver.findElement(By.xpath("//input[@type='submit']")).click();

        	
        } catch (Exception e) {
          System.out.println(e.getMessage());
       
       }
   } 		


@AfterTest
public void CloseBrowser() {
	         
	     driver.close();
	
   }	
}