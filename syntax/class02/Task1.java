package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		Thread.sleep(3000);
		driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
		Thread.sleep(3000);
		driver.findElement(By.className("button")).click();
		Thread.sleep(3000);

		String actualTitle = driver.getTitle();
		String expectedTitle="Web Orders";
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("This is the right title");
		} else {
			System.out.println("This is WRONG title");
		}
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();

	}

}
