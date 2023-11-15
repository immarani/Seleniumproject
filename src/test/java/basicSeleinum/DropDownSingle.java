package basicSeleinum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSingle{

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	WebElement single=driver.findElement(By.xpath("//select[@id='first']"));
	single.click();	
	Select s=new Select(single);
	boolean multiple = s.isMultiple();//condition to check is multiple or single 
	System.out.println(multiple);//mutpli is false,single is True
	s.selectByValue("Apple");//selected by the value
	
//to get all options
	List<WebElement> options = s.getOptions();
for(WebElement x:options) {
	System.out.println(x.getText());
	}

	
	
	
	
	
	}

}
