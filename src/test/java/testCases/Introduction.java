package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://training.mochta.gov.bd");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/section[1]/div[1]/div[1]/section[1]/div[2]/div[1]/a[2]")).click();
		driver.findElement(By.cssSelector("#login_id")).sendKeys("faria@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("123456789");
		driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[2]/div[3]/span[1]/form[1]/div[7]/button[1]")).clear();
		

	}

}
