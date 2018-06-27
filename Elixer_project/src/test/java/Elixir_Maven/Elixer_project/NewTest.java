package Elixir_Maven.Elixer_project;

import org.testng.annotations.Test;

import java.io.File;

import javax.swing.plaf.FileChooserUI;
import javax.swing.tree.FixedHeightLayoutCache;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class NewTest {
	static WebDriver driver;

  @Test(groups="login")
  
  public void login() {
	  driver.findElement(By.xpath("//input[@id='UserLogin_username']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@id='UserLogin_password']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@class='btn bg-teal btn-block']")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'Settings')]")).click();
	  
  

	  
  }
  @Test
  public void settings_hospital() throws Exception {
	  driver.findElement(By.xpath("//a[@href='/index.php/core/hospitalregistration/create']")).click();
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_hospital_code']")).clear();
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_hospitalname']")).clear();
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_address']")).clear();
	  new Select(driver.findElement(By.xpath("//select[@id='Hospitalregistration_yearofestablishment']"))).selectByVisibleText("Select year");
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_country']")).clear();
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_state']")).clear();
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_phone']")).clear();
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_email']")).clear();
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_fax']")).clear();
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_noofbuildings']")).clear();
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_contactperson']")).clear();
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_promotedby']")).clear();
	 
	  
 
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_hospital_code']")).sendKeys("1136");
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_hospitalname']")).sendKeys("appolo");
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_address']")).sendKeys("dffasddfd");
	  new Select(driver.findElement(By.xpath("//select[@id='Hospitalregistration_yearofestablishment']"))).selectByVisibleText("1995");
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_country']")).sendKeys("india");
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_state']")).sendKeys("andhrapradesh");
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_phone']")).sendKeys("9876543210");
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_email']")).sendKeys("ravindrachantig@gmail.com");
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_fax']")).sendKeys("lkdflldk");
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_noofbuildings']")).sendKeys("8");
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_contactperson']")).sendKeys("radaldfk");
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_promotedby']")).sendKeys("sudheer");
	  
	  WebElement focus=driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_logo\"]"));
	  focus.click();
	  Runtime.getRuntime().exec("D:\\selenium\\New folder\\elixr1.exe");
	  
	  driver.findElement(By.xpath("//button[@class='btn bg-teal']")).click();
	  Thread.sleep(2000);
	  scrsht();
	  
	  
	  
  }
  @Test
  public void scrsht() throws Exception {
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(src,new File("D:\\selenium\\New folder\\f1.jpg"));
  }

  
  @BeforeTest
  public void browser() {
	  
			System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://demo.elixiraid.com/index.php/user/login");
			driver.manage().window().maximize();
  }
  
	  
  }



