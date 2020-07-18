package util;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {
	By pagina = null ;
	public boolean exist(WebDriver driver, By by, int time) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, time);

			if (wait.until(ExpectedConditions.visibilityOfElementLocated((by))) != null) {

				return true;
			} else {

				return false;
			}
		} catch (Exception e) {

			return false;
		}

	}


	public boolean click(WebDriver driver, By by, int time) {
		try {
			exist(driver, by, time);
				driver.findElement(by).click();



			return true;
		} catch (Exception e) {
			return false;
		}

	}


	public boolean escrever(WebDriver driver, By by, String text) {
		try {
			exist(driver, by, 10);
			WebElement inpt = driver.findElement(by);
			inpt.sendKeys(text);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean select(WebDriver driver, By tab, By pagination, String text) {
		boolean result = false;
		List<WebElement> tableOption;
		List<WebElement> listPag  = driver.findElements(pagination);
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
							option.click();
							return true;
						}

					}

					listPag  = driver.findElements(pagination);
					listPag.get(j+1).click();
				}
			}catch (Exception e)
				{ System.out.println("Option " + text + " not found ");
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

}
