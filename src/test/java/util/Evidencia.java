package util;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;

public class Evidencia {

    String pathAtual = System.getProperty("user.dir")+"//"+"Result";
    File diretorio = new File(pathAtual);




        public  void capturar(WebDriver driver, String nomEvidencia){
            if (!diretorio.exists()) {
                diretorio.mkdir();
            }

            try {
                File evidencia = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(evidencia, new File(pathAtual+"//"+nomEvidencia+".png"));
            } catch (IOException e) {

            }
        }

}