package JavaAutomation.First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EcommerceScripting {

	public  void Checkout() throws InterruptedException {
		WebDriver driver;
		System.setProperty("WebDriver.gecko.driver", "D:\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("inventory_item_img")).click();
		driver.findElement(By.xpath("//button[@class = 'btn btn_primary btn_small btn_inventory']")).click();
		driver.findElement(By.className("shopping_cart_link")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Noman");
		driver.findElement(By.id("last-name")).sendKeys("Danish");
		driver.findElement(By.id("postal-code")).sendKeys("54000");
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
		driver.findElement(By.id("back-to-products")).click();
		
		

	}

}
