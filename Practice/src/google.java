import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class google {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Testing\\chromedriver.exe");
				ChromeDriver chrome = new ChromeDriver();

				chrome.get("https://www.verizonwireless.com/?intcmp=vzwdom");
				Thread.sleep(4000);
				WebElement signIn = chrome.findElementByXPath("//*[@id=\"gnavAccountMenu\"]/span");
				Thread.sleep(1000);

				Actions mouseHover = new Actions(chrome);
				mouseHover.moveToElement(signIn).build().perform();


				chrome.findElementByXPath("//*[@id=\"vzw-gn\"]/div/nav/div/div[2]/div[3]/ul[2]/li[3]/ul/li[1]/a").click();
		
	}
}

