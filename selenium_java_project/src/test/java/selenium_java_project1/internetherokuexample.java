package selenium_java_project1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class internetherokuexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.linkText("JavaScript Alerts")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
//		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert myalert= driver.switchTo().alert();
		Thread.sleep(2000);
		myalert.sendKeys("praneeth");
		Thread.sleep(2000);
		myalert.accept();
		

	}

}
