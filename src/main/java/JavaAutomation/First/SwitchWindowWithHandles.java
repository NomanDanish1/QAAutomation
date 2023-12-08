package JavaAutomation.First;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchWindowWithHandles {

	public static void main(String[] args) {
		// initialize the gecko driver for firefox
		
		//WebDriver driver;
		//System.setProperty("WebDriver.gecko.driver", "D:\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		//driver = new FirefoxDriver();
		//driver = new EdgeDriver();
		//driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		//driver.close();
		//driver.quit();
		//WebElement email = driver.findElement(By.id("email"));
		//email.sendKeys("fbtest_brybyqq_three@tfbnw.net");
		//WebElement pass = driver.findElement(By.id("pass"));
	//	pass.sendKeys("jeenypa55word2");
	//	WebElement login = driver.findElement(By.name("login"));
	//	login.click();
		WebDriver driver;
		System.setProperty("WebDriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parenthandle = driver.getWindowHandle();
		System.out.println(parenthandle);
		
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		for(String handle: handles)
		{
			if(!handle.equals(parenthandle)) {
				driver.switchTo().window(handle);
				driver.findElement(By.id("firstName")).sendKeys("What");
				
			}
		}

	}

}
