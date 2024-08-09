package testngg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstt 
{
	ChromeDriver d=new ChromeDriver();
	@Before
	public void setup()
	{
	
	d.get("https://www.youtube.com/");
	}
	@Test
	public void test1()
	{
		d.findElement(By.id("search")).sendKeys("indian 2 trailer",Keys.ENTER);
	}
}
