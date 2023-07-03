package TAKEN;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
		driver.findElement(By.cssSelector("input[placeholder='Search Amazon']")).sendKeys("Titan wrist watches ");
		driver.findElement(By.id("nav-search-submit-button")).click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.xpath("//span[text()='Leather']")).click();
		driver.findElement(By.xpath("//span[text()='Titan']")).click();
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,300)");
		
		driver.findElement(By.cssSelector("img[alt='Titan Neo Men’s Designer Watch - Quartz, Water Resistant, Leather/Stainless Steel Strap (Blue/Black)']")).click();

	}

}
