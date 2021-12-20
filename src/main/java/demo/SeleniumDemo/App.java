package demo.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.co.in");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("flowers");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.RETURN);
       // driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
			

        System.out.println( "completed!" );

        System.out.println( "completed from git!" );
        System.out.println( "completed2!" );

        System.out.println( "completed from git2!" );

    }
}
