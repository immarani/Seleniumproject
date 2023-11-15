package basicSeleinum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor  {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
	WebElement user=driver.findElement(By.id("email"));
     WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 //set Attributes
		js.executeScript("arguments[0].setAttribute('value','imma')", user,login);
		//getAttributes
		Object execute = js.executeScript("return arguments[0].getAttribute('value')", user,login);
System.out.println(execute);
//to click by javascritexecutor
//js.executeScript("arguments[0].click()", login);

//highlight the webelement
js.executeScript("arguments[0].setAttribute('style','background:red')", user,login);
	
//higtlight with border
js.executeScript("arguments[0].setAttribute('style','border:2px solid yellow')", user);
//scrolldown
WebElement down=driver.findElement(By.xpath("//a[text()='Help']"));
js.executeScript("arguments[0].scrollIntoView(true)", down);
Thread.sleep(2000);
//scrollup
js.executeScript("arguments[0].scrollIntoView(false)", login);
	
	
	
	
	}

	
	

}
