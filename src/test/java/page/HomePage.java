package page;

import io.cucumber.java.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;
import util.Evidencia;
import util.Util;

public class HomePage  {

	Evidencia tela = new Evidencia();
	Util util = new Util();
	WebDriver driver = DriverFactory.getDriver("chrome");
	By iconBuscar = By.xpath("//*[@id='search-trigger']");
	By inputBuscar = By.id("global-search-input");
	By btnBuscar = By.xpath("//*[@class='c-search-box__form']/button");
	By tabResultado = By.xpath("//*[@class='c-search-page c-search-dropdown']/section");
	By paginacao = By.xpath("//*[@class='o-pagination']");
	By popup = By.xpath("");
	By popResultado = By.xpath("//*[@class='o-modal is-modal-open']/div/div/div");
	By menuHamburguer = By.className("c-menu-trigger__icon");

	boolean result = false ;


	public  boolean digitaBusca(String texto) {

		try {
			util.AguardaElementoDesaparecer(driver , menuHamburguer );
			tela.capturar(driver, "1_HomePage");
			util.clickJs(driver, iconBuscar, 10);
			if (util.escrever(driver, inputBuscar, texto)) {
				tela.capturar(driver, "2_Superget");

			}
			util.click(driver, btnBuscar, 10);
			return true ;
		}catch(Exception e){
			return result;
		}
	}

	public boolean seleciona(String texto){
		try{
			util.select(driver, tabResultado , paginacao , texto );
			tela.capturar(driver , texto);
			return true ;
		}catch(Exception e){
			return result ;
		}

	}

	public boolean Assercao(String texto){
		try{
			tela.capturar(driver , "Resultado");
			util.valida(driver, popResultado  , texto );
			driver.quit();
			return true;
		}
		catch(Exception e){
			return false ;
		}

	}
	@Before
	public void setup(){
		driver.navigate().to("https://site.getnet.com.br/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); //delete all cookies


	}

}
