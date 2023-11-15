package basicSeleinum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chromeoptions{

	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-popups");
		option.addArguments("--disable-notifications");
		option.addArguments("--headless");
		option.addArguments("start-maximized");
		option.addArguments("--disable-notifications");
		
		 WebDriver driver=new ChromeDriver(option);
		 driver.get("https://www.makemytrip.com/");
		
	
	


}
}