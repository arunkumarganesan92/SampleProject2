package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDemo {
	
	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions acc = new Actions(driver);
		
		WebElement src = driver.findElement(By.xpath("//a[contains(text(),' BANK ')]"));
		WebElement desc = driver.findElement(By.xpath("(//li[@class='placeholder'][1])"));
		acc.dragAndDrop(src , desc).build().perform();
		Thread.sleep(2000);
		
		WebElement src1 = driver.findElement(By.xpath("//a[contains(text(),' 5000 ')]"));
		WebElement desc1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		acc.dragAndDrop(src1, desc1);
		Thread.sleep(2000);
		
		
		
		
		
		
	}

}
