package com.demo.blaze;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlazeProduct {

	
	public void getproduct(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().to("https://www.demoblaze.com/");
		List <WebElement> productname = driver.findElements(By.xpath("//*[@class='col-lg-9']//h4"));
		//System.out.println(productname.get(0).getText()); //single print er jonno
		System.out.println(productname.size());
	for(int i=0;i<productname.size(); i++) { // sob gula print korar joinno
			System.out.println(productname.get(i).getText());
			
		}
		
		List <WebElement> productprice = driver.findElements(By.xpath("//*[@class='col-lg-9']//h5"));
		System.out.println(productprice.size());
	//System.out.println(productprice.get(0).getText());
	
		for(int j=0; j<productprice.size(); j++) {
			
			System.out.println(productprice.get(j).getText());
		}
		

		
	}
	
	
	public static void main(String[] args) {
		DemoBlazeProduct obj = new DemoBlazeProduct();
		obj.getproduct();
		
		
	}
	
	
}
