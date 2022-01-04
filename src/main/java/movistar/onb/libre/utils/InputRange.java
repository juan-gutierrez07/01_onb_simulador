package movistar.onb.libre.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputRange {

    public void selectMonto(WebDriver driver, By elemento, String value){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(elemento);
        js.executeScript("arguments[0].value="+value,element);
    }
}
