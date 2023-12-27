package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestBase{

	public static WebDriver driver;

	@BeforeSuite
	    public void startDriver() {
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

	        // Create ChromeOptions instance
	        ChromeOptions options = new ChromeOptions();

	        // Add the desired option
	        options.addArguments("--remote-allow-origins=*");

	        // Set other options if needed

	        // Create ChromeDriver with the configured options
	        driver = new ChromeDriver(options);

	        // Configure other settings
	        driver.manage().window().maximize();
	    }

	@Test()
	public void navigteToPetro() throws Exception {
		driver.navigate().to("http://hiring.petroapp.com/test2.html");
		}

//
//	@AfterSuite
//	public void closeDriver(){
//		driver.quit();
//	}

}
