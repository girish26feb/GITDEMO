package Section13;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chromeoptions_Proxy_plugin_paths {

	public static void main(String[] args) {
		
//1 -add plugin
		ChromeOptions options =new ChromeOptions();
		options.addExtensions();
		
		System.setProperty("webdriver,chrome.driver", "D:\\seleniummaterial\\chromedriver-win64\\.exe");

		WebDriver driver = new ChromeDriver(options);
		
//2-proxy setting

		ChromeOptions options11 = new ChromeOptions();
		Proxy proxy = new Proxy();

		proxy.setHttpProxy("IP:8080");

		options.setCapability("proxy", proxy);

		System.setProperty("webdriver,chrome.driver", "D:\\seleniummaterial\\chromedriver-win64\\.exe");

		WebDriver driver11 = new ChromeDriver(options);
		
//3-block unnecessary pop-up
		ChromeOptions options12 = new ChromeOptions();
		options12.setExperimentalOption("Exclude switches", Arrays.asList("disable-popup-blocking"));
		
		
//4-download file to particular directory
		Map<String, Object> pref = new HashMap<String, Object>();

		pref.put("download.default_directory", "/directory/path");
		ChromeOptions options13 = new ChromeOptions();

		options12.setExperimentalOption("prefs", pref);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
