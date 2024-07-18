package formypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modal {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\AutomationJisna\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://formy-project.herokuapp.com/modal");

         // Find and click the button to open the modal
         WebElement modalButton = driver.findElement(By.xpath("//*[@id=\"modal-button\"]"));
         modalButton.click();

         // Optional: Wait for the modal to appear (use WebDriverWait in a real scenario)
         Thread.sleep(3000);

         // Find the close button inside the modal and click it
         WebElement closeButton = driver.findElement(By.id("close-button"));
         closeButton.click();
		
	}

}
