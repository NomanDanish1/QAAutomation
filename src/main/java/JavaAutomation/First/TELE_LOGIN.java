package JavaAutomation.First;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TELE_LOGIN {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("WebDriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://uat.strokealert911.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("Username")).sendKeys("Basil");
		driver.findElement(By.id("Password")).sendKeys("PhosPhorus15!");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(3000);
		
		if(!driver.findElements(By.id("LogoutNoId")).isEmpty()){
			(driver.findElement(By.id("LogoutNoId"))).click();
		}
		Select drp = new Select(driver.findElement(By.name("RoleId")));
		drp.selectByVisibleText("Super Admin");
		driver.findElement(By.id("QMSButton")).click();
		driver.findElement(By.xpath("//span[@class='fa fa-chevron-left icon']")).click();
		
		
	}

}