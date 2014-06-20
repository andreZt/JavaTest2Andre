import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;



public class TestMain {

	public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.chrome.driver","D:\\javagit\\seleniumDriverChrome\\chromedriver.exe" );
		//ChromeDriver dr = new ChromeDriver();
		//dr.get("http://google.com.ua");
				
		ProfilesIni allProf = new ProfilesIni();
		FirefoxProfile profile = allProf.getProfile("Andre");
		
		FirefoxDriver dr = new FirefoxDriver(profile);
		dr.get("http://google.com.ua");
		
		//dr.quit();
	}

}
