package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class RunBase {
	static WebDriver driver;
	public static WebDriver getDriver() {
		if (driver == null) {
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--headless");
			driver = new FirefoxDriver(options);
			return driver;
		};
		return driver;
	};

	public void fecharDriver() throws InterruptedException {
		getDriver().quit();
		Thread.sleep(100);
		driver = null;
	};
}
