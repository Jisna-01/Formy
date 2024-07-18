package formypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\AutomationJisna\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://formy-project.herokuapp.com/scroll");
		
		Thread.sleep(3000);
		
		JavascriptExecutor scroll =(JavascriptExecutor)driver;
		
		scroll.executeScript("window.scrollBy(0,800)");
		
		Thread.sleep(3000);
		
		 WebElement name = driver.findElement(By.id("name"));
         name.sendKeys("Jisna");
		
         WebElement date = driver.findElement(By.id("date"));
         date.sendKeys("07/02/2024");
		

	}

}
