package oct28;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
Properties conpro;
WebDriver driver;
@Test 
public void startTest()throws Throwable
{
	conpro=new Properties();
	//load property file
	conpro.load(new FileInputStream("Login.properties"));
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(conpro.getProperty("Url"));
	driver.findElement(By.xpath(conpro.getProperty("objuser"))).sendKeys(conpro.getProperty("EnterUser"));
	driver.findElement(By.xpath(conpro.getProperty("objpass"))).sendKeys(conpro.getProperty("EnterPass"));
	driver.findElement(By.xpath(conpro.getProperty("objLogin"))).click();
	Thread.sleep(4000);
	driver.quit();
	}
}
