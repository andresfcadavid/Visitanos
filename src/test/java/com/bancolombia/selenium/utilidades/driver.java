package com.bancolombia.selenium.utilidades;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class driver {
	
	
	//creando metodo que me va a devolver webDriver, de la clase principal pra no saturarla
	public WebDriver IniciarDriver() 
	{
		String exePath = "src/test/resources/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		
		return driver;
		
	}

}
