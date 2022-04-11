import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

import org.testng.annotations.Test;

public class test {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
    @Test(testName = "hello")
    
    	public void hello()
    	{
    	ChromeDriverManager.chromedriver().setup();
    	WebDriver driver;
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.navigate().to("https://www.google.com");
		System.out.println("hello world");
		driver.close();

	}

}
