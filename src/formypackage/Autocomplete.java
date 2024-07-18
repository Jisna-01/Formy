package formypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\AutomationJisna\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://formy-project.herokuapp.com/autocomplete");	      
        
//        WebElement Autocomplete = driver.findElement(By.xpath("/html/body/div/div/li[1]/a"));
//        Autocomplete.click();
        
        WebElement Address = driver.findElement(By.id("autocomplete"));
        Address.sendKeys("karikuzhiyil");
        
        WebElement Streetaddress = driver.findElement(By.id("street_number"));
        Streetaddress.sendKeys("kanjoor");
        		
        WebElement streetaddress2 = driver.findElement(By.xpath("//*[@id=\"route\"]"));
        streetaddress2.sendKeys("kalady");
        
        WebElement City = driver.findElement(By.id("locality"));
        City.sendKeys("Kanjoor");
        
        WebElement State = driver.findElement(By.id("administrative_area_level_1"));
        State.sendKeys("Kerala");
        
        WebElement Zipcode = driver.findElement(By.id("postal_code"));
        Zipcode.sendKeys("683575");
        
        WebElement Country = driver.findElement(By.id("country"));
        Country.sendKeys("India");

	}

}
