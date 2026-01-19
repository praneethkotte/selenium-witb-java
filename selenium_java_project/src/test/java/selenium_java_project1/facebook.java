package selenium_java_project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		Faker faker = new Faker();

		String firstName = faker.name().firstName();
		String lastName  = faker.name().lastName();
		String phone     = faker.number().digits(10);
		String password  = faker.internet().password(8,12,true,true);
		driver.findElement(By.name("firstname")).sendKeys(firstName);
		driver.findElement(By.name("lastname")).sendKeys(lastName);
		
		new Select(driver.findElement(By.id("day"))).selectByVisibleText("12");
		new Select(driver.findElement(By.id("month"))).selectByVisibleText("Jan");
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("1998");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.name("reg_email__")).sendKeys(phone);
		driver.findElement(By.name("reg_passwd__")).sendKeys(password);
		driver.findElement(By.name("websubmit")).click();
		
		
		
		
	}

}
