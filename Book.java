
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;

 import org.sikuli.script.Screen;

 

public class Book {
private static WebDriver driver;



public static void main(String[] args) throws FindFailed, InterruptedException, IOException {

 // Setting the path for Chrome.
	System.setProperty("webdriver.chrome.driver", "C://Users//ujjawalverma//Desktop//NagarroFramework//Tests//bin//Debug//chromedriver.exe");
	 driver= new ChromeDriver();
	 driver.get("http://dev.lutron.com/_login/default.aspx?ReturnUrl=%2fen-us%2f_layouts%2fAuthenticate.aspx%3fSource%3d%252Fen%252Dus%252F%255Flayouts%252Fviewlsts%252Easpx&Source=%2Fen-us%2F_layouts%2Fviewlsts%2Easpx");
	 driver.findElement(By.id("ctl00_PlaceHolderMain_ClaimsLogonSelector")).click();
	 WebElement element=driver.findElement(By.id("ctl00_PlaceHolderMain_ClaimsLogonSelector"));
	 Select se=new Select(element);
	 se.selectByValue("Windows");
	 driver.get("http://dev.lutron.com/en-us/_vti_bin/listdata.svc/TechnicalDocuments?$filter=TechnicalDocProductName%20eq%20%27Vive%E2%84%A2%27");
	 
	 Runtime.getRuntime().exec("C:/Users/ujjawalverma/Documents/Original_XMLDownload - Copy.exe");
	 
	 System.out.println("After first print");
	 Thread.sleep(1000);
	 Runtime.getRuntime().exec("C:/Users/ujjawalverma/Documents/Original_XMLDownload - Copy.exe");


 }

}
