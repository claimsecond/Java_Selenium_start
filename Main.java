import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com/ncr");

        WebElement input = driver.findElement(By.name("q"));
        input.sendKeys("Selenium");
        input.sendKeys(Keys.ENTER);

        List<WebElement> elements = driver.findElements(By.cssSelector("a h3"));
        elements.get(0).click();
    }
}
