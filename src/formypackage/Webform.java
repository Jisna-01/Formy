package formypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webform {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\AutomationJisna\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://formy-project.herokuapp.com/form");
		
        WebElement firstname = driver.findElement(By.id("first-name"));
        firstname.sendKeys("Jisna");
        
        WebElement lastname = driver.findElement(By.id("last-name"));
        lastname.sendKeys("Siby");
        
        WebElement jobtitle = driver.findElement(By.id("job-title"));
        jobtitle.sendKeys("Software Tester");
        
        WebElement education = driver.findElement(By.id("radio-button-2"));
        education.sendKeys("click");
        
        WebElement sex = driver.findElement(By.id("checkbox-2"));
        sex.sendKeys("click");
        
        WebElement experience = driver.findElement(By.id("select-menu"));
        experience.sendKeys("click");
        
	}

}
