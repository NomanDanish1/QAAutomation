package JavaAutomation.First;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Telepsych_Cases_Create {
	WebDriver driver;

	
	
	@Test
	public void login() throws InterruptedException
	{
		
		ChromeOptions options=new ChromeOptions();// to remove chrome notifications
		Map<String, Object> prefs=new HashMap<String,Object>();
		prefs.put("profile.default_content_setting_values.notifications", 1);
		//1-Allow, 2-Block, 0-default
		options.setExperimentalOption("prefs",prefs);

		System.setProperty("WebDriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver(options);
	
		
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
		drp.selectByVisibleText("Navigator");
		driver.findElement(By.id("QMSButton")).click();
		driver.findElement(By.xpath("//span[@class='fa fa-chevron-left icon']")).click();
		Thread.sleep(2000);
		
		
		
		driver.get("https://uat.strokealert911.com/TelePsychiatry/Create");
		Thread.sleep(2000);
		Select drp1 = new Select(driver.findElement(By.id("tele_ctp_key")));
		drp1.selectByVisibleText("Initial Emergent Adult TelePsychiatry Consult");
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//*[@class='form-control addValidation']")).click();
		
		
		
		
		
		
		
		
		List<WebElement> options1 = driver.findElements(By.xpath("//select[@class='form-control addValidation']"));
		
		
		for (int i = 0; i < options1.size(); i++) {
	      String temp = options1.get(i).getText();
	     System.out.println(temp);
	       }
	    }
		//System.out.println(option1);
		//for(WebElement option : options1) {
		//if (option.getText().contains("AdventHealth Oviedo ER (Winter Park FSED)- Advent")) 
		//{
		// option.click();
		 //System.out.println(option);
		// break;
		}
		

	
	
	

