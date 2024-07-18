package formypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\AutomationJisna\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://formy-project.herokuapp.com/buttons");	   

        WebElement Primary = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[1]"));
        Primary.click();
        
        WebElement Success = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[2]"));
        Success.click();
        
        WebElement Info = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[3]"));
        Info.click();
        
        WebElement Warning = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[4]"));
        Warning.click();
        
        
        WebElement Danger = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[5]"));
        Danger.click();
        
        WebElement Link = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[6]"));
        Link.click();
        
        
	}

}
