package com.qaworks.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import junit.framework.Assert;

public class techtest {

	public static void main(String[] args) {
		
		    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\eclipse-workspace\\testing\\lib\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
		    	
		        String baseUrl = "http://www.qaworks.com/";
		        String expectedTitle = "QAWorks Limited - Software Quality & Delivery Experts";
		        String actualTitle = "QAWorks Limited - Software Quality & Delivery Experts";

		        // launch chrome browser and direct it to the Base URL
		        driver.get(baseUrl);

		        // get the actual value of the title
		        actualTitle = driver.getTitle();
		        
		        if (actualTitle.contentEquals(expectedTitle)){
		            System.out.println("Test Passed!");
		        } else {
		            System.out.println("Test Failed");
		        }

		       
		       //one more way of verifing the title using assert
		        
		       Assert.assertTrue("QAWorks Limited - Software Quality & Delivery Experts", true);
		       
		       driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);	
		       
		       //Clicking on the Contact us page now
		       
		      
		       
		       driver.findElement(By.xpath("//*[@id=\"menu-item-18894\"]/a/span")).click();
		       
		       //clicking on Entering the data on the name field
		       
		       driver.findElement(By.name("your-name")).sendKeys("j.Bloggs");
		       
		       //clicking on Entering the data on the Emaild
		       
		       driver.findElement(By.name("your-email")).sendKeys("j.Bloggs@qaworks.com");
		       
		       //  //clicking on Entering the data on the subject
		       
		       driver.findElement(By.name("your-company")).sendKeys("test automation");
		       
		       //clicking on Entering the data on the subject
		       
		       driver.findElement(By.name("your-message")).sendKeys("Please contact me I want to find out more");
		       
		       
		      
		        //close Chrome browser
		        driver.close();
		       
		    }
		
		


	}


