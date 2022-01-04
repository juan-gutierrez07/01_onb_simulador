package movistar.onb.libre.steps;

import movistar.onb.libre.pageObject.PageBasic;
import movistar.onb.libre.utils.ClickCuota;
import movistar.onb.libre.utils.Datos;
import movistar.onb.libre.utils.InputRange;
import movistar.onb.libre.utils.Solicitud;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import java.util.List;



public class IngresoSteps {

    List<WebElement> hs;
    PageBasic page = new PageBasic();
    Datos dataUrls = new Datos();
    List<Solicitud> solicituds = dataUrls.solicitudesCampañas();
    InputRange monto = new InputRange();
    ClickCuota clickCuo = new ClickCuota();
    @Step
    public void abrirNavegadorBasic(){
        page.openUrl(solicituds.get(1).getUrl());
    }
    @Step
    public void seleccionarMontoBasic(){
        double limit = 5500000;
        while (dataUrls.solicitudesCampañas().get(1).getMonto()< limit){
            limit = limit-500000;
            page.getDriver().findElement(page.getInputMonto()).sendKeys(Keys.LEFT);
        }
    }
    @Step
    public void validarCuotasBasic(){
        WebElement list = page.getDriver().findElement(page.getListPlazos());
        this.hs = list.findElements(By.xpath("//section[@class='container-value-cuotas']/h1"));
        Assert.assertEquals(3,hs.size()); //Funciona

    }
    @Step
    public boolean selectCuotaBasic(){
        System.out.println("Llegando a selectCuotaBasic..."+ solicituds.get(1).getCuota());
        if(solicituds.get(1).getCuota() >0){
            if(solicituds.get(1).getCuota() == 12 || solicituds.get(1).getCuota() == 24 || solicituds.get(1).getCuota() == 36){
                for( WebElement i : this.hs){
                    if(Integer.parseInt(i.getText()) == solicituds.get(1).getCuota() ){
                       clickCuo.selectCuotaClick(page.getDriver(),i.findElement(By.xpath("./../..")));
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
    @Step
    public void validarTEA(){
        Assert.assertEquals(page.getDriver().findElement(page.getTextTEA()).getText(), (dataUrls.solicitudesCampañas().get(1).getTasa_anual_ef()+"%").replace(".",","));
    }
    @Step
    public void clickLoQuiero(){
        page.getDriver().findElement(page.getBttnFin()).click();
    }
}
