package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub                                
		System.setProperty("webdriver.gecko.driver", "D:\\JAVA\\Software\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");				
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.name("ctl00$MainContent$txtFirstName")).sendKeys("Mary Smith");
		driver.findElement(By.id("MainContent_txtEmail")).sendKeys("ma@testemail.com");
		driver.findElement(By.xpath(".//*[@id='MainContent_txtHomePhone']")).sendKeys("1231231234");
		//driver.findElement(By.xpath("html/body/form/div[3]/div[2]/div/div[2]/div[3]/div[2]/input")).sendKeys("1231231234");
		
		driver.findElement(By.cssSelector("input[type='password'][id='MainContent_txtPassword']")).sendKeys("mspass");	
		driver.findElement(By.name("ctl00$MainContent$txtVerifyPassword")).sendKeys("mspass");		
		
		driver.findElement(By.id("MainContent_Female")).click();
		//driver.findElement(By.cssSelector("input[name='ctl00$MainContent$Gender'][value='Female']")).click();
		
		new Select(driver.findElement(By.id("MainContent_menuCountry"))).selectByVisibleText("Germany");
		driver.findElement(By.name("ctl00$MainContent$checkWeeklyEmail")).click();
		driver.findElement(By.id("MainContent_btnSubmit")).click();
		
		String conf = driver.findElement(By.id("MainContent_lblTransactionResult")).getText();
		System.out.println("CONFIRMATION: " + conf);
		
		driver.close();		
	}
}     
