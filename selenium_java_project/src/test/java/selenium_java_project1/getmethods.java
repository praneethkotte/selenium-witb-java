package selenium_java_project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://www.abdn.ac.uk/pgap/login.php?/?utm_source=google&utm_medium=cpc&utm_campaign=CEN-Undergraduate-S26&utm_content=CEN-Undergraduate-S26&gad_source=1&gad_campaignid=23256298995&gbraid=0AAAAAC_sjDDhIzRXotY5S-k-1Yme9uEjV&gclid=Cj0KCQiAyP3KBhD9ARIsAAJLnnbimARLFq7vrSoD2aGzaSKgwFDzANStllH5VJPiXvUtcBT-8Ae_JuwaAsYCEALw_wcB");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("username")).sendKeys("praneeth.kotte9@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Prani@143");
		driver.findElement(By.xpath("//span[text()='Accept All Cookies']")).click();
		//driver.findElement(By.className(submit_button minimal minimal_cursor));
		
		driver.findElement(By.xpath("//input[@value='LOG IN']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("VIEW APPLICATIONS")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("HOME")).click();
		
		

	}

}
