import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Order {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\godspower.osayomwanb\\Downloads\\browserfolder\\chromedriver.exe");

        WebDriver driver = null;
        try {
            driver = new ChromeDriver();
            driver.get("https://netowsolutions.com/swadel/my-account/");

            driver.findElement(By.id("username")).click();
            driver.findElement(By.id("username")).sendKeys("osayomwanborgodspower@yahoo.com");

            driver.findElement(By.id("password")).click();
            driver.findElement(By.id("password")).sendKeys("Osagie@080");

            driver.findElement(By.cssSelector("#customer_login > div.u-column1.col-1 > form > p:nth-child(3) > button")).click();

            // Add explicit wait for element visibility
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Browse products')]")));

            driver.findElement(By.xpath("//a[contains(text(),'Browse products')]")).click();

            // Add explicit wait or other necessary actions

        } catch (Exception e) {
            // Handle the exception or log the error
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
