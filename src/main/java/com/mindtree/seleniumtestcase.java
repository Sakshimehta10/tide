package com.mindtree.selenium;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.*;
public class seleniumtestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tide.com/en-us");
		//Actions ac=new Actions(driver);
		
		//this code is select text and click
		//driver.findElement(By.linkText("Shop Products")).click();
		driver.findElement(By.xpath("//*[@id=\"site-header\"]/div[1]/div/div/div/div[2]/a[2]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"lilo3746-wrapper\"]/div/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"j_id0:j_id1:j_id2:idForm:j_id36:j_id37:opMainId:4:navButton\"]/a")).click();
		//WebElement element=driver.findElement(By.xpath("//*[@id=\"j_id0:j_id1:j_id2:idForm:j_id36:j_id37:opMainId:4:navButton\"]/a"));
		//((JavascriptExecutor)driver).executeScript("var mouseEvent=document.createEvent('mouseover',true,true);argrument[0].dispatchEvent(mouseEvent);",element);
		//ac.moveToElement(element).moveToElement(driver.findElement(By.xpath("//*[@id=\"site-header\"]/nav/ul/li[1]"))).click();//.build().perform();
		//ac.moveToElement(element).build().perform();
		
		
			}
			
			
		
		

	}

