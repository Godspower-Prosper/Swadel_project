import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
    WebDriver driver;

    @BeforeTest
    public void setupBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\godspower.osayomwanb\\Downloads\\browserfolder\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://netowsolutions.com/swadel/");
        driver.findElement(By.cssSelector("#layout > div > header > div.header_1.cz_menu_fx_fade_in > div > div > div.elms_right.header_1_right > div.cz_elm.icon_header_1_right_4.inner_icon_header_1_right_2 > a > i")).click();
    }

    @Test(priority = 0)
    public void invalidLogin1() throws InterruptedException {
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("invalid1@yahoo.com");
        Thread.sleep(4000);

        driver.findElement(By.id("password")).sendKeys("password1");
        driver.findElement(By.className("button")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 1)
    public void invalidLogin2() throws InterruptedException {
        driver.findElement(By.id("username")).click();
        Thread.sleep(4000);

        driver.findElement(By.id("username")).clear();
        Thread.sleep(4000);

        driver.findElement(By.id("username")).sendKeys("invalid2@yahoo.com");
        Thread.sleep(4000);

        driver.findElement(By.id("password")).click();
        Thread.sleep(4000);

        driver.findElement(By.id("password")).clear();
        Thread.sleep(4000);

        driver.findElement(By.id("password")).sendKeys("password2");
        driver.findElement(By.className("button")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void invalidLogin3() throws InterruptedException {
        driver.findElement(By.id("username")).click();
        Thread.sleep(4000);

        driver.findElement(By.id("username")).clear();
        Thread.sleep(4000);

        driver.findElement(By.id("username")).sendKeys("invalid3@yahoo.com");
        Thread.sleep(4000);

        driver.findElement(By.id("password")).click();
        Thread.sleep(4000);

        driver.findElement(By.id("password")).clear();
        Thread.sleep(4000);

        driver.findElement(By.id("password")).sendKeys("password3");
        driver.findElement(By.className("button")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void validLogin() throws InterruptedException {
        driver.findElement(By.id("username")).click();
        Thread.sleep(4000);

        driver.findElement(By.id("username")).clear();
        Thread.sleep(4000);

        driver.findElement(By.id("username")).sendKeys("osayomwanborgodspower@yahoo.com");
        Thread.sleep(4000);

        driver.findElement(By.id("password")).click();
        Thread.sleep(4000);

        driver.findElement(By.id("password")).clear();
        Thread.sleep(4000);

        driver.findElement(By.id("password")).sendKeys("Osagie@080");
        driver.findElement(By.className("button")).click();
        Thread.sleep(2000);
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
