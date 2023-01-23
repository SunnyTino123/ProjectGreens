package com.adactin;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Adactin_Hotel {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Adactin\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.id("username")); // using id
		login.sendKeys("gowtham0909");
		WebElement pwd = driver.findElement(By.xpath("//input[@name='password']")); // using xpath
		pwd.sendKeys("gowtham09091996");
		WebElement button = driver.findElement(By.id("login"));
		button.click();
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByValue("New York");
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select h = new Select(hotels);
		h.selectByVisibleText("Hotel Sunshine");
		WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select r = new Select(room);
		r.selectByValue("Super Deluxe");
		WebElement roomnos = driver.findElement(By.id("room_nos"));
		Select ar = new Select(roomnos);
		ar.selectByVisibleText("3 - Three");
		WebElement adroom = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select adr = new Select(adroom);
		adr.selectByValue("3");
		WebElement childroom = driver.findElement(By.id("child_room"));
		Select cr = new Select(childroom);
		cr.selectByValue("1");
		driver.findElement(By.id("Submit")).click();
		WebElement radiobutton = driver.findElement(By.id("radiobutton_0"));
		Actions mouse = new Actions(driver);
		mouse.click(radiobutton).build().perform();
		WebElement ct = driver.findElement(By.id("continue"));
		mouse.click(ct).build().perform();
		WebElement name = driver.findElement(By.xpath("(//input[@class='reg_input'])[1]"));
		name.sendKeys("Gowthaman");
		driver.findElement(By.id("last_name")).sendKeys("Jayabalachadran");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.id("address")).sendKeys("Xyz street,Mylapre");
		driver.findElement(By.id("cc_num")).sendKeys("1234 5678 9012 3456");
		WebElement card = driver.findElement(By.id("cc_type"));
		Select c = new Select(card);
		c.selectByValue("VISA");
		WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
		Select em = new Select(expmonth);
		em.selectByValue("3");
		WebElement expyear = driver.findElement(By.id("cc_exp_year"));
		Select ey = new Select(expyear);
		ey.selectByValue("2015");
		driver.findElement(By.id("cc_cvv")).sendKeys("123");
		WebElement book = driver.findElement(By.id("book_now"));
		mouse.click(book).build().perform();
		Thread.sleep(6000);
		WebElement element = driver.findElement(By.xpath("//input[@id='my_itinerary']"));
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.visibilityOf(element));
		js.executeScript("arguments[0].scrollIntoView();", element);
		element.click();
		driver.findElement(By.id("check_all")).click();
		driver.findElement(By.xpath("//input[@name='cancelall']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		mouse.click(logout).build().perform();
		//mouse.moveToElement(logout).build().perform();
		//Robot rc = new Robot();
				//rc.keyPress(KeyEvent.VK_DOWN);
				//rc.keyRelease(KeyEvent.VK_TAB);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.close();

	}

}















