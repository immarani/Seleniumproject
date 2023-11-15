package basicSeleinum;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autoit {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad=1&gclid=CjwKCAjw4P6oBhBsEiwAKYVkq080hBLj_HOrNRcDY1ko7OT9LT0bglYMbV8_6ch8bOmxlKHGiR31NxoCXawQAvD_BwE&gclsrc=aw.ds");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Thread.sleep(3000);
Runtime.getRuntime().exec("C:\\Users\\imimm\\OneDrive\\Documents\\ResumeuploadAutoIt.exe");
	}

}
