package com.bancolombia.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestInicial {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		String exePath = "C:\\driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.grupobancolombia.com");
		
		//para que el driver se maximice
		driver.manage().window().maximize();
		
		
		//Click en visitanos
		driver.findElement(By.xpath("//*[@id=\"footer-content\"]/div[1]/div/div/div[4]/div/a/img")).click();
		
		
		//Envío la dirección por parámetro
		driver.findElement(By.xpath("//*[@id=\"srch-term\"]")).sendKeys(args[0]);   
		
		//Click en lupa para busqueda
		driver.findElement(By.xpath("//*[@id='tab1']/div[1]/div[1]/div")).click();
		
		//Primer elemento desplegado
		driver.findElement(By.xpath("//*[@id=\"tab1\"]/div[1]/div[6]/div[1]/div/div[2]/p")).click();
		
		String PrimerDireccion = driver.findElement(By.xpath("//*[@id=\"tab1\"]/div[1]/div[6]/div[1]/div/div[2]/p")).getText();
		
		System.out.println("La primera dirección es: " + PrimerDireccion);
		
		
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        // Después de hacer el print screen se guarda en una ruta local; la cual es un parametro
        FileUtils.copyFile(scrFile, new File(args[1]));

		
	
		driver.quit();
		
		
	}

}
