package Test2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tes1 {
	@Test
	public void Quiz11() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravik\\Downloads\\chromedriver_win32");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		
		dr.findElement(By.xpath("//*[@id=\"leftcontainer\"]/div[4]/a[4]")).click();
		
		System.out.println(dr.getTitle());
		System.out.println(dr.getTitle().contains("https://money.rediff.com/gainers/bsc/daily/groupa"));
		
		Assert.assertEquals(dr.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/ul/li[1]/a")).getText(), "Home");
		Assert.assertEquals(dr.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/ul/li[2]/a")).getText(), "My Portfolio");
		Assert.assertEquals(dr.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/ul/li[3]/a")).getText(), "My Watchlist");
		Assert.assertEquals(dr.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/ul/li[4]/a")).getText(), "Trends");
		Assert.assertEquals(dr.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/ul/li[5]/a")).getText(), "Market News");
		
		
		List<WebElement> rownum = dr.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		
		System.out.println("The total row num is : "+rownum);
		
		List<WebElement> colnum = dr.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td"));
		
		System.out.println("The total col num is : "+colnum);
		
		System.out.println(dr.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[25]/td[2]")));
		
		
		
		//dr.close();
		
		
	}

}
