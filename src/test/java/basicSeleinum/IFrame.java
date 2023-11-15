package basicSeleinum;

import java.awt.Frame;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrame {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
driver.manage().window().maximize();
Thread.sleep(3000);

//driver.switchTo().frame(0);//iframe //index

List<WebElement> topis = driver.findElements(By.tagName("iframe"));//using WebElement
driver.switchTo().frame(topis.get(0));
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("topics");


driver.switchTo().frame("frame3");//iframe
driver.findElement(By.xpath("//input[@id='a']")).click();

//default frame orginal frame
driver.switchTo().defaultContent();
//driver.findElement(By.xpath("//button[@id='first']")).click();
//parent window previous window
driver.switchTo().parentFrame();
}
}