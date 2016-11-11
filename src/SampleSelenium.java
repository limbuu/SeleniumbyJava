import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;


public class SampleSelenium {

	public static void main(String[] args) throws InterruptedException {
		
     WebDriver dr1=new FirefoxDriver();
     //FirefoxDriver dr2= new FirefoxDriver();
     
     dr1.get("http://www.google.com");
     //dr2.get("http://www.bbc.com");
     System.out.println("Sucesssfully opened the website");
   //Wait for 5 Sec
     Thread.sleep(5);

     // Close the driver
     dr1.quit();


	}

}
