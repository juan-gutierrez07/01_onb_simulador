package movistar.onb.libre.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickCuota {

    public void selectCuotaClick(WebDriver driver, WebElement elemento){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        System.out.println("......." + elemento);
        js.executeScript("arguments[0].click()",elemento);
    }
}
