package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://166.62.36.207/syntaxpractice/index.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='btn btn-success btn-outline-rounded green']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a#btn_inter_example")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='list-group-item'])[9]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("Karen");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("Smith");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("karen.smith2121@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("7035558900");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='address']")).sendKeys("123 Main St");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Chicago");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='zip']")).sendKeys("20008");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='website']")).sendKeys("www.karensboutique.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("Looking to set up a separate website for my growing business");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='btn btn-default']")).click();


	}

}
