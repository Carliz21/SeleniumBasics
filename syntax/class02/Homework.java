package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		driver.findElement(By.id("customer.firstName")).sendKeys("Carmen");
		driver.findElement(By.name("customer.lastName")).sendKeys("Jones");
		driver.findElement(By.id("customer.address.street")).sendKeys("123 Sky Way");
		driver.findElement(By.name("customer.address.city")).sendKeys("Wilmington");
		driver.findElement(By.id("customer.address.state")).sendKeys("Delaware");
		driver.findElement(By.name("customer.address.zipCode")).sendKeys("12345");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("7036442590");
		driver.findElement(By.id("customer.ssn")).sendKeys("123456789");
		driver.findElement(By.name("customer.username")).sendKeys("Cmarks123");
		driver.findElement(By.id("customer.password")).sendKeys("Jnes9877");
		driver.findElement(By.name("repeatedPassword")).sendKeys("Jnes9877");
		Thread.sleep(2000);
		driver.findElement(By.className("button")).click();
		Thread.sleep(2000);
		driver.close();
	

	}

}
