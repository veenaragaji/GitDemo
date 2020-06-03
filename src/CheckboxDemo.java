import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CheckboxDemo {
	@Test
	public void test(){
		//System.setProperty("webdriver.chrome.driver", "C:/Users/hp au-620tx/Desktop/chromedriver_win32/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:/Users/hp au-620tx/Desktop/geckodriver-v0.19.1-win64/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement e=driver.findElement(By.id("checkBoxOption1"));
		e.click();
		Assert.assertTrue(e.isSelected());
		e.click();
		Assert.assertFalse(e.isSelected());
		
		int c=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println("Checkbox count"+c);
		
		
		
		
	}
}
