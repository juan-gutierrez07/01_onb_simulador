package movistar.onb.libre.pageObject;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PagePremium extends PageObject {
    By listPlazos = By.xpath("/html/body/div/div/div[2]/div/div[2]/div[3]");
    By titlePage = By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/h1");
    By inputMonto = By.xpath("/html/body/div/div/div[2]/div/div[2]/div[2]/input");
    By bttnFin = By.xpath("/html/body/div/div/div[2]/div/div[2]/div[3]/div[5]/button");
    By textMonto = By.xpath("/html/body/div/div/div[2]/div/div[2]/div[2]/h1");
    By textTEA = By.xpath("/html/body/div/div/div[2]/div/div[2]/div[3]/div[5]/section/p[2]");

    public By getListPlazos() {
        return listPlazos;
    }

    public void setListPlazos(By listPlazos) {
        this.listPlazos = listPlazos;
    }

    public By getTitlePage() {
        return titlePage;
    }

    public void setTitlePage(By titlePage) {
        this.titlePage = titlePage;
    }

    public By getInputMonto() {
        return inputMonto;
    }

    public void setInputMonto(By inputMonto) {
        this.inputMonto = inputMonto;
    }

    public By getBttnFin() {
        return bttnFin;
    }

    public void setBttnFin(By bttnFin) {
        this.bttnFin = bttnFin;
    }

    public By getTextMonto() {
        return textMonto;
    }

    public void setTextMonto(By textMonto) {
        this.textMonto = textMonto;
    }

    public By getTextTEA() {
        return textTEA;
    }

    public void setTextTEA(By textTEA) {
        this.textTEA = textTEA;
    }

}
