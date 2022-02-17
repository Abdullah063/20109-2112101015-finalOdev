
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ymgodev {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://yazilimci.club/");

        WebElement eposta = driver.findElement(By.id("floatingInput"));
        eposta.click();
        eposta.sendKeys("Enomevo08.41@gmail.com");
        Thread.sleep(2000);

        WebElement sifre = driver.findElement(By.id("floatingPassword"));
        sifre.click();
        sifre.sendKeys("asdsadsa");
        Thread.sleep(2000);

        WebElement tikla = driver.findElement(By.className("btn-primary"));
        tikla.click();
        Thread.sleep(2000);

        WebElement epostam = driver.findElement(By.id("floatingInput"));
        epostam.click();
        epostam.sendKeys("coskundogukan338@gmail.com");
        Thread.sleep(2000);

        WebElement sifrem = driver.findElement(By.id("floatingPassword"));
        
        sifrem.click();
        sifrem.sendKeys("1224");
        Thread.sleep(2000);

        WebElement tiklam = driver.findElement(By.className("btn-primary"));
        
        tiklam.click();
        Thread.sleep(2000);
        WebElement cikis = driver.findElement(By.className("btn-secondary"));
        cikis.click();


    }
}
