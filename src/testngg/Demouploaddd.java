package testngg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demouploaddd 
{
	
	@Test
	public void test()
	{
		ChromeDriver d = new ChromeDriver();
		d.get("https://demo.automationtesting.in/Register.html");
		d.findElement(By.xpath("//*[@id=\"imagesrc\"]")).click();
	}

}
