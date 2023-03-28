package runTestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import testCases.Case1;
import testCases.Case2;

public class runHere {
	

public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhuvaneshwarip\\Desktop\\Automation_SCUBA\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		
		Case1 ticketBooking = new Case1(driver);
		Case2 hotelBooking = new Case2(driver);

		ticketBooking.flightticket();
		hotelBooking.resortbooking();
		
		driver.quit();
}
}
