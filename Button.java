package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");	
		driver.manage().window().maximize();
		org.openqa.selenium.Point location = driver.findElement(By.id("position")).getLocation();
		System.out.println(location);
		WebElement cssValue = driver.findElement(By.id("color"));
		System.out.println(cssValue.getCssValue("background-color"));
		WebElement cssValue2 = driver.findElement(By.id("size"));
		System.out.println(cssValue2.getSize());
		driver.findElement(By.id("home")).click();
	}

}
