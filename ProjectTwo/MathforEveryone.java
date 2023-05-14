package com.learning.secondproject;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MathforEveryone extends  Loginurl {
    Properties p = loadProperty();
    
 
 @BeforeMethod   
 public void LogintoApplication ()  {
	   try {
		   
		 InitializeBrowser();
		 loadProperty();
		 	   
	   } catch (Exception e) {
		 System.out.println(e.getMessage());  
	   }
	 }

  
  @Test(priority = 1)
  public void CalulasIntegration() {
  	try {
 	
  	   //getting inputs from property file
  	    String Math_for_Everyone = p.getProperty("Math_for_Everyone");
  	    String calculas_integration = p.getProperty("calculas_integration");
  	    String calculas_integration_locator = p.getProperty("calculas_integration_locator");
  	    String calculas_integration_value = p.getProperty("calculas_integration_value");
  	    String submit_button = p.getProperty("submit_button");
  	
  	 
  	    driver.findElement(By.xpath(Math_for_Everyone)).click();
  	    Thread.sleep(2000);
  	    WebElement TopicDropdown = driver.findElement(By.id("topicItem"));
  	    Select selectfromTopicDropdown = new Select(TopicDropdown);
  	    driver.findElement(By.xpath(calculas_integration)).click();
  	    driver.findElement(By.xpath(calculas_integration_locator)).sendKeys(calculas_integration_value);;
  	    Thread.sleep(2000);
  	    driver.findElement(By.xpath(submit_button)).click();
  	    
  	  } catch (Exception e) {
  	  System.out.println(e.getMessage());
  	 }
  }

 @Test(priority = 2) 
 public void CoinsCounting() {
	 try {
		 //getting inputs from property file
	  	String Math_for_Everyone = p.getProperty("Math_for_Everyone");
	  	String Coins_Counting_locator = p.getProperty("Coins_Counting_locator");
        String quaters_value_locator = p.getProperty("quaters_value_locator");
        String quaters_value = p.getProperty("quaters_value");
        String dimes_value_locator = p.getProperty("dimes_value_locator");
        String dimes_value = p.getProperty("dimes_value");
        String nickles_value_locator = p.getProperty("nickles_value_locator");
        String nickles_value = p.getProperty("nickles_value");
        String pennies_value_locator = p.getProperty("pennies_value_locator");
        String pennies_value = p.getProperty("pennies_value");
  	    String submit_button = p.getProperty("submit_button");

        
        
        driver.findElement(By.xpath(Math_for_Everyone)).click();
        WebElement TopicDropdown = driver.findElement(By.id("topicItem"));
  	    Select selectfromTopicDropdown = new Select(TopicDropdown);
  	    driver.findElement(By.xpath(Coins_Counting_locator)).click();
  	    Thread.sleep(2000);
  	    driver.findElement(By.xpath(quaters_value_locator)).sendKeys(quaters_value);
  	    Thread.sleep(2000);   
  	    driver.findElement(By.xpath(dimes_value_locator)).sendKeys(dimes_value);
  	    Thread.sleep(2000);
  	    driver.findElement(By.xpath(nickles_value_locator)).sendKeys(nickles_value);
  	    Thread.sleep(2000);
  	    driver.findElement(By.xpath(pennies_value_locator)).sendKeys(pennies_value);
  	    Thread.sleep(2000);
  	    driver.findElement(By.xpath(submit_button)).click();

     } catch (Exception e) {
	 System.out.println(e.getMessage());
   }
}
	 

 @Test(priority = 3)
 public void CombinationsFindingall() {
	 try {
		//getting inputs from property file
		String Math_for_Everyone = p.getProperty("Math_for_Everyone");
		String Combinations_Findingall = p.getProperty("Combinations_Findingall");
		String Combinations_Textbox = p.getProperty("Combinations_Textbox");
		String Textbox_value = p.getProperty("Textbox_value");
		String submit_button = p.getProperty("submit_button");

		
		driver.findElement(By.xpath(Math_for_Everyone)).click();
		WebElement TopicDropdown = driver.findElement(By.id("topicItem"));
  	    Select selectfromTopicDropdown = new Select(TopicDropdown);
		driver.findElement(By.xpath(Combinations_Findingall)).click();
		driver.findElement(By.xpath(Combinations_Textbox)).sendKeys(Textbox_value);
  	    driver.findElement(By.xpath(submit_button)).click();
	 
	 } catch(Exception e) {
	   System.out.println(e.getMessage());
	 }
  }
 
 
 @Test(priority = 4)
 public void ComplexnumbersMultiplying() {
      try {
    	  
    	//getting inputs from property file
			String Math_for_Everyone = p.getProperty("Math_for_Everyone");
			String ComplexNumbers_Multiplying = p.getProperty("ComplexNumbers_Multiplying");
			String Textbox_locator = p.getProperty("Textbox_locator");
			String ComplexMultiply_value = p.getProperty("ComplexMultiply_value");
			String submit_button = p.getProperty("submit_button");

			
			driver.findElement(By.xpath(Math_for_Everyone)).click();
			WebElement TopicDropdown = driver.findElement(By.id("topicItem"));
	  	    Select selectfromTopicDropdown = new Select(TopicDropdown);
	  	    driver.findElement(By.xpath(ComplexNumbers_Multiplying)).click();
	  	    driver.findElement(By.xpath(Textbox_locator)).sendKeys(ComplexMultiply_value);
	  	    driver.findElement(By.xpath(submit_button)).click();
    	   	  
      } catch(Exception e) {
    	System.out.println(e.getMessage());
      }
    }
 
 @Test(priority = 5)
 public void GeometryCircles() {
  
   try {
 
	        //getting inputs from property file
	 		String Math_for_Everyone = p.getProperty("Math_for_Everyone");
	 		String Geometry_Circles = p.getProperty("Geometry_Circles");
	 		String locator = p.getProperty("locator");
	 		String Geometry_Circles_value = p.getProperty("Geometry_Circles_value");
	 		String dropdown = p.getProperty("dropdown");
	 		String Circle_Diameter = p.getProperty("Circle_Diameter");
	 		String submit_button = p.getProperty("submit_button");

	 		
	 		driver.findElement(By.xpath(Math_for_Everyone)).click();
	 		WebElement TopicDropdown = driver.findElement(By.id("topicItem"));
	 	    Select selectfromTopicDropdown = new Select(TopicDropdown);
	 	    driver.findElement(By.xpath(Geometry_Circles)).click();
	 	    driver.findElement(By.xpath(locator)).sendKeys(Geometry_Circles_value);
	 	    Thread.sleep(4000);
	 	    driver.findElement(By.xpath(dropdown)).click();
	 	    driver.findElement(By.xpath(Circle_Diameter)).click();
	 	    driver.findElement(By.xpath(submit_button)).click();
   
       } catch(Exception e) {
    	 System.out.println(e.getMessage());
    }
 }  

 
 
 @Test(priority=6)
 public void GeometryRetangle() {
    try {
	 
	 //getting inputs from property file
 		String Math_for_Everyone = p.getProperty("Math_for_Everyone");
 		String Geometry_Rectangle = p.getProperty("Geometry_Rectangle");
 		String locator = p.getProperty("locator");
 		String Rectangle_Width_locator_value = p.getProperty("Rectangle_Width_locator_value");
 		String Height_locator = p.getProperty("Height_locator");
 		String Rectangle_Height_locator_value = p.getProperty("Rectangle_Height_locator_value");
 		String submit_button = p.getProperty("submit_button");

 		
 		driver.findElement(By.xpath(Math_for_Everyone)).click();
 		WebElement TopicDropdown = driver.findElement(By.id("topicItem"));
 	    Select selectfromTopicDropdown = new Select(TopicDropdown);
 	    driver.findElement(By.xpath(Geometry_Rectangle)).click();
 	    driver.findElement(By.xpath(locator)).sendKeys(Rectangle_Width_locator_value);
 	    driver.findElement(By.xpath(Height_locator)).sendKeys(Rectangle_Height_locator_value);
 	    driver.findElement(By.xpath(submit_button)).click();
 					
	 } catch(Exception e) {
	 System.out.println(e.getMessage());
  }
}

 
 @Test(priority=7)
 public void GeometrySpheres() {
 try {
	 
	 //getting inputs from property file
 		String Math_for_Everyone = p.getProperty("Math_for_Everyone");
 		String Geometry_Spheres = p.getProperty("Geometry_Spheres");
 		String locator = p.getProperty("locator");
 		String Sphere_value = p.getProperty("Sphere_value");
 		String dropdown = p.getProperty("dropdown");
 		String Area_locator = p.getProperty("Area_locator");
 	    String submit_button = p.getProperty("submit_button");

 		
 		driver.findElement(By.xpath(Math_for_Everyone)).click();
 		WebElement TopicDropdown = driver.findElement(By.id("topicItem"));
 	    Select selectfromTopicDropdown = new Select(TopicDropdown);
 	    driver.findElement(By.xpath(Geometry_Spheres)).click();
 	    driver.findElement(By.xpath(locator)).sendKeys(Sphere_value);
 	    driver.findElement(By.xpath(dropdown)).click();
 	    driver.findElement(By.xpath(Area_locator)).click();
 	    driver.findElement(By.xpath(submit_button)).click();

     } catch(Exception e) {
	 System.out.println(e.getMessage());
  }
}

@Test(priority = 8)	 
public void GeometryRightTriangle() {
 try {
	 
	 //getting inputs from property file
 		String Math_for_Everyone = p.getProperty("Math_for_Everyone");
 		String Geometry_RightTriangle = p.getProperty("Geometry_RightTriangle");
 		String locator = p.getProperty("locator");
 		String locator_value = p.getProperty("locator_value");
 		String Height_locator = p.getProperty("Height_locator");
 		String Height_locator_value = p.getProperty("Height_locator_value");
 	    String submit_button = p.getProperty("submit_button");

 		
 		driver.findElement(By.xpath(Math_for_Everyone)).click();
 		WebElement TopicDropdown = driver.findElement(By.id("topicItem"));
 	    Select selectfromTopicDropdown = new Select(TopicDropdown);
 		driver.findElement(By.xpath(Geometry_RightTriangle)).click();
 		driver.findElement(By.xpath(locator)).sendKeys(locator_value);
 		driver.findElement(By.xpath(Height_locator)).sendKeys(Height_locator_value);
 	    driver.findElement(By.xpath(submit_button)).click();
        } catch(Exception e) {
	    System.out.println(e.getMessage());
     }
   }


@Test(priority = 9)
public void NumbersAdding() {
	
      try {
	 
	   //getting inputs from property file
		String Math_for_Everyone = p.getProperty("Math_for_Everyone");
		String Numbers_Adding = p.getProperty("Numbers_Adding");
		String locator_one = p.getProperty("locator_one");
		String locator_one_value = p.getProperty("locator_one_value");
		String locator_two = p.getProperty("locator_two");
		String locator_two_value = p.getProperty("locator_two_value");
		String submit_button = p.getProperty("submit_button");

		
		driver.findElement(By.xpath(Math_for_Everyone)).click();
		WebElement TopicDropdown = driver.findElement(By.id("topicItem"));
	    Select selectfromTopicDropdown = new Select(TopicDropdown);
		driver.findElement(By.xpath(Numbers_Adding)).click();
		driver.findElement(By.xpath(locator_one)).sendKeys(locator_one_value);
		driver.findElement(By.xpath(locator_two)).sendKeys(locator_two_value);
	    driver.findElement(By.xpath(submit_button)).click();
        } catch(Exception e) {
	    System.out.println(e.getMessage());
    }
  }


@Test(priority = 10)    
public void NumbersMultiplying() {
 try {
	 
	 //getting inputs from property file
		String Math_for_Everyone = p.getProperty("Math_for_Everyone");
		String Numbers_Multiplying = p.getProperty("Numbers_Multiplying");
		String locator_one = p.getProperty("locator_one");
		String locator_one_value = p.getProperty("locator_one_value");
		String locator_two = p.getProperty("locator_two");
		String locator_two_value = p.getProperty("locator_two_value");
		String submit_button = p.getProperty("submit_button");

		
		driver.findElement(By.xpath(Math_for_Everyone)).click();
		WebElement TopicDropdown = driver.findElement(By.id("topicItem"));
	    Select selectfromTopicDropdown = new Select(TopicDropdown);
		driver.findElement(By.xpath(Numbers_Multiplying)).click();
		driver.findElement(By.xpath(locator_one)).sendKeys(locator_one_value);
		driver.findElement(By.xpath(locator_two)).sendKeys(locator_two_value);
	    driver.findElement(By.xpath(submit_button)).click();
        } catch(Exception e) {
	    System.out.println(e.getMessage());
    }
  }


@AfterMethod
public void CloseBrowser() {
	
	  driver.close();
    }
  }




