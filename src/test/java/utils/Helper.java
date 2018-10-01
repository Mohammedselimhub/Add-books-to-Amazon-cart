package utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {

	// Method to take screenshot when the test cases fail
	public static void captureScreenshotFailure(WebDriver driver , String screenshotname) 
	{
		Path dest = Paths.get("./ScreenShots",screenshotname+".png"); 
		try {
			Files.createDirectories(dest.getParent());
			FileOutputStream out = new FileOutputStream(dest.toString());
			out.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
			out.close();
		} 
		catch (IOException e) 
		{
			System.out.println("Error while taking screenshot"+ e.getMessage());
		}
	}

}
