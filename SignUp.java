import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\godspower.osayomwanb\\eclipse-workspace\\Swadel_project_Godspower\\browserfolder\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://netowsolutions.com/swadel/");
		driver.findElement(By.cssSelector("#layout > div > header > div.header_1.cz_menu_fx_fade_in > div > div > div.elms_right.header_1_right > div.cz_elm.icon_header_1_right_4.inner_icon_header_1_right_2 > a > i")).click();		
		driver.findElement(By.id("reg_email")).click();
		
		driver.findElement(By.id("reg_email")).sendKeys("godspowerprosper@icloud.com");
		
		driver.findElement(By.cssSelector("#customer_login > div.u-column2.col-2 > form > p:nth-child(4) > button")).click();	
		driver.quit();
	}

}
