package formypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Key {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\AutomationJisna\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/keypress");
		
		WebElement fullname = driver.findElement(By.xpath("//*[@id=\"name\"]"));
		fullname.sendKeys("Jisna Siby");

		WebElement button = driver.findElement(By.xpath("//*[@id=\"button\"]"));
		button.click();
	}

}
