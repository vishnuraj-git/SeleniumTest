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

        System.out.println( "completed!" );
        //commit changes0
        //commit chages2
        //commit chages3
        //commit changes4
        //commit changes5
      //commit changes6
        //commit changes7
      //commit changes8
        //commit changes9
    }
}
