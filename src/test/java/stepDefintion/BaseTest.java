/**
 *
 */
package stepDefintion;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author 13465
 *
 */
public class BaseTest {
	public static WebDriver driver;
//	public static final String USERNAME = "khalilhany_KLrQIy";
//    public static final String AUTOMATE_KEY = "ckCHbxQXw1dXpFeLpzBC";
//    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	public void LunchTheBrowser(){
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setBrowserName("chrome");
//		capabilities.setPlatform(Platform.WIN10);
//		MutableCapabilities capabilities = new MutableCapabilities();
//		HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
//		browserstackOptions.put("osVersion", "16");
//		browserstackOptions.put("deviceName", "iPhone 14");
//		browserstackOptions.put("projectName", "CucumberTemplate");
//		browserstackOptions.put("buildName", "Build");
//		browserstackOptions.put("sessionName", "testCaseBuild");
//		browserstackOptions.put("local", "false");
//		capabilities.setCapability("bstack:options", browserstackOptions);

//    	WebDriverManager.chromedriver().setup();
//		driver= new RemoteWebDriver(new URL("http://192.168.1.104:5555"), capabilities);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\13465\\eclipse\\workspace\\cucumber\\drivers\\chromedriver.exe");
		ChromeOptions optionsBeta = new ChromeOptions();
		optionsBeta.setBinary("C:\\Users\\13465\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");      
		driver = new ChromeDriver(optionsBeta);
//		WebDriverManager.edgedriver().setup();
//		driver= new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.deutsche-bank.de/");
		driver.manage().window().maximize();

	}
}
