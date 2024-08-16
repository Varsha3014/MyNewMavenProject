package Takescreenshort;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Example2 {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    String random = RandomString.make(3);
		File destination =new File("C:\\Users\\Asus\\Desktop\\software testing class\\seleniumScreenshort\\sample"+random+".png");
	    FileHandler.copy(source, destination);
	}

}