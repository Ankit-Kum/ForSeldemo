import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstCase {
	
	WebDriver driver;
	
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","/Users/apple/Desktop/Selenium/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		
	}	

	/*public void serach()
	{
		//driver.findElement(By.id("w-input-search")).sendKeys("Delhi");
		//driver.findElement(By.id("w-button-search")).click();
		//driver.findElement(By.xpath("//*[@id=\"w-button-search\"]")).click();
		driver.findElement(By.linkText("Products & Services")).click();
		//driver.findElement(By.linkText("Param Shavak ")).click();
		
	}
	
	public void navi() 
	{
		driver.navigate().to("https://www.gmail.com");
		//System.out.println("The tilele is " +driver.getCurrentUrl());
		System.out.println("The tilele is " +driver.getTitle());
		
	}*/
	
	public void opengmail() throws InterruptedException 
	{
		/*driver.findElement(By.name("identifier")).sendKeys("MRANKITGOYAL@gmail.com");
		driver.findElement(By.name("identifier")).clear();
		Thread.sleep(3000);
		driver.findElement(By.name("identifier")).sendKeys("mrankitgoyal@gmail.com");
		driver.findElement(By.name("identifier")).clear();
		Thread.sleep(3000);
		//.sleep(3000);
		driver.findElement(By.name("identifier")).sendKeys("mrANKITgoyal@gmail.com");
		Thread.sleep(3000);
		
		//driver.findElement(By.linkText("Next")).click();
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();*/
		
		//Thread.sleep(4000);
		driver.findElement(By.id("identifierId")).sendKeys("mrankitgoyal@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("11@12334");
		
		
	}
	
	
	
	public static void main  (String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		FirstCase ob = new FirstCase();
		ob.launchBrowser();
		//ob.serach();
		//ob.navi();
	
		ob.opengmail();
		
	}

}
