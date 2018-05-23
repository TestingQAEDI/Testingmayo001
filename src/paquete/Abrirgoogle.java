package paquete;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Abrirgoogle {
	public static void main(String[] args){
		  System.setProperty("webdriver.gecko.driver", "E:\\_Archivos Estables\\Programas\\para java del driver de firefox201\\geckodriver.exe");

		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.yahoo.com");
		
		//prueba
		
	}
}