package Elixir_Maven.Elixer_project;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class NewTest {
	static WebDriver driver;

  @Test(groups="login")
  public void login() {
	  driver.findElement(By.xpath("//input[@id='UserLogin_username']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@id='UserLogin_password']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@class='btn bg-teal btn-block']")).click();
  }
  @Test(groups="settings")
  public void settings() {
	  
	  //driver.findElement(By.xpath("//html//ul[@class='navigation navigation-main navigation-accordion']/li[3]/a[1]")).click();
	 driver.findElement(By.xpath("//li[@class='active']//a[@href='#']")).click();
	 driver.findElement(By.xpath("//a[@href='/index.php/core/hospitalregistration/create']")).click();
  }
  
  @BeforeTest
  public void browser() {
	  
		
			System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://demo.elixiraid.com/index.php");
			driver.manage().window().maximize();
  }

}

