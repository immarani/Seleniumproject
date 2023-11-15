package basicSeleinum;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
	WebElement button=	driver.findElement(By.xpath("//span[@role='button']"));
if(button.isEnabled()) {
	button.click();
	System.out.println("interupted button is closed");
}
//WebElement text=driver.findElement(By.xpath("//div[@id='container']"));
//System.out.println(text.getText());
//System.out.println("Size of the given link:" +text.getSize());
//System.out.println(text.getSize());*/
WebElement element=driver.findElement(By.xpath("//input[@type='text']"));
element.click();
Thread.sleep(1000);
  Robot robot=new Robot();
  for (int i = 0; i < 4; i++) {
	  robot.keyPress(KeyEvent.VK_DOWN);
	  robot.keyRelease(KeyEvent.VK_DOWN);
	  }
  robot.keyPress(KeyEvent.VK_ENTER);
  robot.keyRelease(KeyEvent.VK_ENTER);
 WebElement  texts=driver.findElement(By.xpath("//span[text()='Women']"));
  texts.click();
  
  //System.out.println(texts.getText());
  System.out.println("Size of the given link:" +texts.getSize());
  //System.out.println(texts.getSize());*/
  System.out.println(texts.getText());
	}

}
