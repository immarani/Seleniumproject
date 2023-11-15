package basicSeleinum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownMultiple {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	
		driver.manage().window().maximize();
		
		WebElement multiple=driver.findElement(By.xpath("//select[@id='second']"));
	multiple.click();	
	Select s=new Select(multiple);
	boolean multiples = s.isMultiple();//condition to check is multiple or single 
	System.out.println(multiples);

	s.selectByIndex(2);
	s.selectByIndex(0);
	s.selectByIndex(1);
	
WebElement firstSelectedOption = s.getFirstSelectedOption();
System.out.println(firstSelectedOption .getText());
	
List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	for(WebElement x:allSelectedOptions) {
		System.out.println(x.getText());
	}
List<WebElement> options = s.getOptions();
for(WebElement x:options) {
	System.out.println(x.getText());
}
	
	}

}
