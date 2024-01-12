package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Opencart {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CDAC\\Desktop\\Selenium Data\\chromedriver-win32\\chromedriver-win32//chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://demo.guru99.com/v4/");
		System.out.println(d.getCurrentUrl());
//		d.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("mngr547081");
//		d.findElement(By.name("password")).sendKeys("tUpAmun");
		
		d.findElement(By.xpath("//input[@id='input-username']")).sendKeys("Mayuri44");
		d.findElement(By.name("firstname")).sendKeys("Mayuri");
		d.findElement(By.name("lastname")).sendKeys("Khairnar");
		d.findElement(By.xpath("//input[@id='input-email']")).sendKeys("mayurikhairnar44@gmail.com");
		
		Select country = new Select(d.findElement(By.xpath("//select[@id='input-country']")));
		country.selectByVisibleText("India"); 
		
		d.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Mayuri@44");
		
		
		d.findElement(By.xpath("//body/div[@id='account-register']/div[@id='register']/div[1]/div[1]/form[1]/div[7]/button[1]")).click();
		
		d.findElement(By.linkText("Login")).click();
		
		WebElement obj1=d.findElement(By.name("email"));
		obj1.sendKeys("mayurikhairnar44@gmail.com");
		
		
		WebElement obj2=d.findElement(By.name("password"));
		obj2.sendKeys("Mayuri@44");
		
		d.findElement(By.xpath("//body/div[@id='account-login']/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/button[1]")).click();
		
		String username=obj1.getAttribute("value");
		System.out.println(username);
		
		String pass=obj1.getAttribute("value");
		System.out.println(pass);
	}

}
