package testCases;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String name = "didar";
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.tagName("p")).getText());
		//Assert.assertEquals(System.out.println(driver.findElement(By.tagName("p")).getText()), "You are successfully logged in");
		//String actualText = driver.findElement(By.tagName("p")).getText();
		//assertEquals("You are successfully logged in", actualText);
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		assertEquals("You are successfully logged in.", driver.findElement(By.tagName("p")).getText());
		
		
		//driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();
		//System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello " + name + ",");
		
		//driver.findElement(By.cssSelector("h2")).getText();
		//System.out.println(driver.findElement(By.cssSelector("h2")).getText());
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		//driver.findElement(By.xpath("//*[text()='Log Out']")).click(); // * means all HTML tag
		driver.close();
		
		
 
	}
	
	public void getPassword(WebDriver driver ) throws InterruptedException {
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.className("reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector(".infoMsg")).getText();
		
	}

}
