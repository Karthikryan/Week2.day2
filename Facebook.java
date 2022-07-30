package week2.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//Step 1: Download and set the path 
//Step 2: Launch the chromebrowser
//Step 3: Load the URL https://en-gb.facebook.com/
//Step 4: Maximise the window
//Step 5: Add implicit wait
//Step 6: Click on Create New Account button
//Step 7: Enter the first name
//Step 8: Enter the last name
//Step 9: Enter the mobile number
//Step 10: Enterthe password
//Step 11: Handle all the three drop downs
//Step 12: Select the radio button "Female" 
//   ( A normal click will do for this step) 

public class Facebook {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//div[@class='_6ltg'][2]")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sample");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("T");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8561577851");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("abcd");
        WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
        Select dayselect = new Select(day);
        dayselect.selectByVisibleText("10");
        WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
        Select Monthselect = new Select(month);
        Monthselect.selectByVisibleText("Sep");
        WebElement Year = driver.findElement(By.xpath("//select[@name='birthday_year')]"));
        Select Yearselect = new Select (Year);
        Yearselect.selectByVisibleText("2011");
        driver.findElement(By.xpath("//label[@text='Female']/following-sibling::input")).click();
        driver.findElement(By.xpath("//button[@name='websubmit']"));
        
        
	}

}
