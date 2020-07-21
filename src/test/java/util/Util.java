package util;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {
	By pagina = null ;
	Evidencia tela = new Evidencia();
	public boolean exist(WebDriver driver, By by, int time) {
		//try {
			WebDriverWait wait = new WebDriverWait(driver, time);

			if (wait.until(ExpectedConditions.visibilityOfElementLocated((by))) != null) {

				return true;
			}

				return false;
	}

//		} catch (Exception e) {
//
//			return false;
//	}

//	}
	public boolean AguardaElementoDesaparecer(WebDriver driver, By by) {
		try {
			WebElement element = driver.findElement(by);
			while(element.isDisplayed()){
				System.out.println("Menu ativo...");
			}


			return true;
		} catch (Exception e) {

			return false;
		}

	}


	public void click(WebDriver driver, By by, int time) {
			do {
				System.out.println("Aguardando o Elemento Icon Buscar...");
			}while(!exist(driver, by, time)) ;
			driver.findElement(by).click();

	}
	public boolean clickJs(WebDriver driver, By by, int time) throws InterruptedException {
		try {

			WebElement element = driver.findElement(by);
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			Thread.sleep(20000);
			executor.executeScript("arguments[0].click()", element);

			return true;
		} catch (Exception e) {
			throw  e;
		}

	}

	int i = 1;
	public boolean escrever(WebDriver driver ,By input, String text) {
		try {
			;
			if(exist(driver, input , 2)){
					WebElement inpt = driver.findElement(input);
					inpt.click();
					inpt.sendKeys(text);
					return true;
			}

		} catch (Exception e) {
			throw e;
		}
		return false;
	}

	public boolean select(WebDriver driver, By tab, By pagination,  String text) {

		boolean result = false;
		int indice = 0;
		List<WebElement> tableOption;
		List<WebElement> listPag  = driver.findElement(pagination).findElements(By.xpath("./*"));

		WebElement option;

		String textOption = "";
		try {

			System.out.println("Selecionando um resultado ...");

				for (int j = 0 ; j < listPag.size(); j++) {
					tableOption = driver.findElement(tab).findElements(By.xpath("./a"));
					for (int i = 0; i < tableOption.size(); i++) {
						option = tableOption.get(i);
						textOption = option.getText();
						System.out.println("Verificando resultado: "+textOption);
						if (textOption.equals(text)) {
							System.out.println("Sucesso: "+textOption);
							option.click();
							return true;
						}

					}
					//
					tela.capturar(driver,"Pagina_"+indice+"");
					indice = j+1;
					scroll(driver);
					WebElement pagina = driver.findElement(By.xpath("//*[@class='o-pagination']/a["+indice+"]"));

					pagina.click();
					Thread.sleep(10000);
					pagina = null;


				}
			}catch (Exception e)
				{ System.out.println("Opcao " + text + " Nao econtrada ");
				result = false;
			}
			return result;
	}

	public boolean valida(WebDriver driver, By by, String text) {
		String message = "";
		String msg = "";
		WebElement pop = null;
		if(exist(driver, by, 6)) {
			pop = driver.findElement(by);
			message = pop.getText();
			msg = message.substring(message.length() - text.length());
			if (msg.equals(text)) {
				return true;
			}
		}
		return false;
	}

	public void scroll(WebDriver driver){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,5000)");
	}

}
