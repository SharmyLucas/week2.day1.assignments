package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		String property=System.getProperty("webdriver.chrome.driver");
		System.out.println(property);
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		WebElement logout=driver.findElement(By.className("decorativeSubmit"));
		
		String attribute =logout.getAttribute("value");
		System.out.println(attribute);
		if(attribute.equals("Logout"))
		{
			System.out.println("Successfully logged in");
		}
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("XYZ");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sharmy");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Lucas");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sharmy");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sharmyl@gmail.com");
		
		WebElement dropdown=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select=new Select(dropdown); 
		select.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String str=driver.getTitle();
		
		System.out.println(str);
		
		driver.close();
		
	}

}
