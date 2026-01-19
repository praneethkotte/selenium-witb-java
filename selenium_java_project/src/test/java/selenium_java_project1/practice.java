package selenium_java_project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver= new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("Gender")).click();
//		driver.findElement(By.id("FirstName")).sendKeys("abcdsa");
//		driver.findElement(By.id("LastName")).sendKeys("ugdga");
//		driver.findElement(By.id("Email")).sendKeys("aydghahda@gmail.com");
		Faker faker = new Faker();

		String firstName = faker.name().firstName();
		String lastName  = faker.name().lastName();
		String email     = faker.internet().emailAddress();
		
		driver.findElement(By.id("FirstName")).sendKeys(firstName);
		driver.findElement(By.id("LastName")).sendKeys(lastName);
		driver.findElement(By.id("Email")).sendKeys(email);
		
		driver.findElement(By.id("Password")).sendKeys("abcd@1234");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("abcd@1234");
		driver.findElement(By.name("register-button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Books")).click();
		//driver.findElement(By.xpath("input[@onclick='AjaxCart.addproducttocart_catalog('/addproducttocart/catalog/22/1/1    ');return false;'")).click();
		driver.findElement(By.xpath(
			    "//a[@href='/health']" +
			    "/ancestor::div[contains(@class,'product-item')]" +
			    "//input[contains(@class,'add-to-cart')]"
			)).click();
		driver.findElement(By.linkText("Shopping cart")).click();
		driver.findElement(By.id("CountryId")).sendKeys("india");
		Thread.sleep(2000);
		driver.findElement(By.name("termsofservice")).click();
		driver.findElement(By.name("checkout")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("BillingNewAddress.CountryId")).sendKeys("india");
		driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Bangalore");
		driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("Bangalore");
		String postalCode = faker.number().digits(6);
		String PhoneNumber = faker.number().digits(10);
		driver.findElement(By.name("Continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Confirm")).click();
		
		
		
	
		
		

	}

}
