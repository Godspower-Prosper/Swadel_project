import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Review {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\godspower.osayomwanb\\Downloads\\browserfolder\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

		driver.get("https://netowsolutions.com/swadel/my-account/");

        driver.findElement(By.id("username")).sendKeys("osayomwanborgodspower@yahoo.com");

        driver.findElement(By.id("password")).sendKeys("Osagie@080");

        driver.findElement(By.cssSelector("#customer_login > div.u-column1.col-1 > form > p:nth-child(3) > button")).click();
        try {
		    Thread.sleep(2000);
		} catch (Exception e) {
			
		}
	
	    driver.findElement(By.xpath("//*[@id=\"page_content\"]/div/section/div/div/div/nav/ul/li[2]/a\r\n")).click();	
	    
        driver.findElement(By.xpath("//a[contains(text(),'Browse products')]")).click();
        
        driver.findElement(By.tagName("h2")).click();
        
        try {
		    Thread.sleep(2000);
		} catch (Exception e) {
			
		}

        driver.findElement(By.partialLinkText("Reviews (")).click();
     
        driver.findElement(By.linkText("5")).click();
        
        driver.findElement(By.cssSelector("#comment")).sendKeys("the dress is nice");       
        
        try {
		    Thread.sleep(2000);
		} catch (Exception e) {
			
		}
        
        driver.findElement(By.tagName("button")).click();

        
        driver.quit();
    }
}
