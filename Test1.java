package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://accounts.datoms.io/login");
	   
	   
	   driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ABCD");
	   
	   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("ABCD@123");
	   
	   driver.findElement(By.xpath("//input[@value='Login']")).click();
	   
	   driver.quit();
	   

	}

}
