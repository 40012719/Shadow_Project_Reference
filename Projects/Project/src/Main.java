import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	public static void main(String[] args) throws InterruptedException
	{
	        System.out.println("Chrome");
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\99002477\\Downloads\\chromedriver_win32");
	        WebDriver driver=(WebDriver) new ChromeDriver();
	       /* driver.get("file:///D:/selenium/new%201.html");
	        finding with id
	        driver.findElement(By.id("email")).sendKeys("sandy");
	        driver.findElement(By.id("pass")).sendKeys("sandy123");*/
	        //finding  with name
	        driver.manage().window().maximize();
	        driver.get("https://www.phptravels.net/home");
	        driver.findElement(By.xpath("//*[@id=\"cookyGotItBtnBox\"]/div/button")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"s2id_autogen16\"]/a")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"s2id_autogen16\"]/a")).sendKeys("singapore");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[1]/ul/li/div")).click();
	        driver.findElement(By.id("checkin")).clear();
	   driver.findElement(By.id("checkout")).clear();
	        driver.findElement(By.id("checkin")).sendKeys("21/12/2020");
	  driver.findElement(By.id("checkout")).sendKeys("22/12/2020");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"hotels\"]/div/div/form/div/div/div[3]/div/div/div/div/div/div/div[1]/div/div[2]/div/span/button[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"hotels\"]/div/div/form/div/div/div[4]/button")).click();
	  driver.findElement(By.xpath("//*[@id=\"detail-content-sticky-nav-02\"]/form/div/div[2]/div/div[2]/div/div[2]/h5/div/label")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"detail-content-sticky-nav-02\"]/form/div/button")).click();
	 
	        driver.close();       
	    }

	}


