package stepDefination;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;

public class testBase {

	@Given("^User launches URL$")
	public void user_launches_URL() throws Throwable {
		System.out.println("hi");

		Properties pop = new Properties();

		FileInputStream file = new FileInputStream(
				"C:\\Users\\GANGULA\\Desktop\\Automation\\Projects\\BDDFramework\\src\\main\\java\\resource\\data.properties");
		pop.load(file);

		String browserVal = pop.getProperty("browser");
		if (browserVal.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\GANGULA\\Desktop\\Automation\\Projects\\BDDFramework\\src\\main\\java\\resource\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(pop.getProperty("url"));
			driver.close();
			driver.quit();

		} else {
			System.out.println("No a browser is selected");
		}

	}

}
