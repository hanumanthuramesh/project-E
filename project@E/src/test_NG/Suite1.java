package test_NG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Suite1 {

	ChromeDriver driver=new ChromeDriver();
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.Driver", "C:\\Users\\USER\\Downloads\\Tools\\updated tools file\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
		driver.manage().window().maximize();
		driver.get("https://monkeylearn.com/word-cloud");
	}
	@Test
	public void mid() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/label/span")).click();
		Thread.sleep(4000);
	}
	@AfterTest
	public void end()
	{
		 driver.close();
		
	}	
	
	
}
