
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Startzer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://player.smartzer.com/v/5695094313189376/");
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class = 'playButtonContainer']//button[@class='bbtn _3QMhza8PKdFtu7KIgHnyL3']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button [@aria-label = 'Click to see item - Ernest armchair']")).click();
		
		
		
		driver.findElement(By.xpath("//span[contains(text(),'BUY NOW')]")).click();
		Thread.sleep(3000);
		
		String url = driver.getCurrentUrl();
		
		Assert.assertEquals(url, "https://www.madebychoice.com/products/ernest-armchair?variant=184");
			
		}
		
		
	}






