import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class logOut {
    public void setupBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\godspower.osayomwanb\\Downloads\\browserfolder\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://netowsolutions.com/swadel/");
        driver.findElement(By.id("username")).sendKeys("godspowerprosper@icloud.com");
        driver.findElement(By.id("password")).sendKeys("Osagie@080");
        driver.findElement(By.cssSelector("#customer_login > div.u-column1.col-1 > form > p:nth-child(3) > button")).click();

        // Add wait before clicking logout button
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("xpath_of_logout_button")));
        
        driver.findElement(By.xpath("xpath_of_logout_button")).click();
        
        driver.quit();
    }
}
