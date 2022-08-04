package com.mindtree.selenium;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class seleniumtestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tide.com/en-us");
		System.out.println(driver.getTitle());
//		to pop up close
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']")).click();
// 1 click contact us
        driver.findElement(By.linkText("Contact Us"));
        driver.get("https://tide.com/en-us");
// 2    
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span[@class='login-register']")).click();
        driver.findElement(By.xpath("//a[@class='event_internal_link']")).click();
// new tab
        String present= driver.getWindowHandle();
        Set<String> win=driver.getWindowHandles();
        for(String real: win) {
        	if(!real.equalsIgnoreCase(present)) {
        		driver.switchTo().window(real);
//new url
        		driver.get("https://www.pggoodeveryday.com/signup/tide-coupons/");
        	}
        }
//new tab input 
        driver.findElement(By.id("name")).sendKeys("sakshi");
        driver.findElement(By.id("email")).sendKeys("sak@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Sak@1234");
        
        driver.findElement(By.xpath("//input[@value='CREATE ACCOUNT']")).click();
        
        present= driver.getWindowHandle();
        win=driver.getWindowHandles();
        for(String real: win) {
        	if(!real.equalsIgnoreCase(present)) {
        		driver.switchTo().window(real);
  // back to page
        		driver.get("https://tide.com/en-us");
        	}
        		
        }
// 3
        Actions ac = new Actions(driver);
        ac.moveToElement(driver.findElement(By.linkText("Shop Products"))).build().perform();
        driver.findElement(By.linkText("Stain Remover")).click();
		
		
			}
			
			
		
		

	}

