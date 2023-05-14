package com.learning.secondproject;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Loginurl {
	
    public static WebDriver driver;
    Properties p = loadProperty();
	public Properties loadProperty() {
		try {
		    FileInputStream fis = new FileInputStream("C:\\Users\\NLVS\\eclipse-workspace\\FirstProject\\testng-learning-project\\src\\test\\java\\com\\utils\\projectinputs.file");
		    Properties p = new Properties();
		    p.load(fis);
		    return p;
		    
		 } catch (Exception e) {
		  System.out.println(e.getMessage());
	      return null;
	  }
	}	    
	

@Test	
        public void InitializeBrowser() {
	    try {
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    String url = p.getProperty("Login_url");  
        driver.get(url);
    
	   } catch (Exception e) {
    	 System.out.println(e.getMessage());
    }
  }
}
	
	    
