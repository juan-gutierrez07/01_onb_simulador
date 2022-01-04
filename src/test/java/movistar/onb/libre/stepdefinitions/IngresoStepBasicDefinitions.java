package movistar.onb.libre.stepdefinitions;


import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import movistar.onb.libre.pageObject.PageBasic;
import movistar.onb.libre.steps.IngresoSteps;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class IngresoStepBasicDefinitions {

    @Steps
    IngresoSteps pasos;

    @Steps
    PageBasic basic;


    @Dado("el usuario ingresa al simulador")
    public void elUsuarioIngresoAlSimulador() throws InterruptedException {
        System.out.println("Ingresando al simulador...");
        pasos.abrirNavegadorBasic();
        Thread.sleep(2000);
    }
    @Entonces("selecciona la cantidad que desea solicitar en el credito")
    public void seleccionaLaCantidadQueDeseaSeleccionarEnElCredito() throws InterruptedException{
        System.out.println("Segundo paso......");
        pasos.seleccionarMontoBasic();
        Thread.sleep(5000);
    }

    @Cuando("verifica si existen tres opciones de plazo")
    public void verificaSiExistenTresOpcionesDePlazo() throws InterruptedException {
        System.out.println("Tercer paso.....");
        pasos.validarCuotasBasic();
        Thread.sleep(5000);

    }

    @Entonces("el usuario selecciona una opcion")
    public void elUsuarioSeleccionaUnaOpcion() throws InterruptedException {
        System.out.println("Cuarto paso......");
        System.out.println(pasos.selectCuotaBasic());
        Assert.assertTrue("Valor invalido de cuota",pasos.selectCuotaBasic());
        Thread.sleep(4000);
        System.out.println("funcionooo");

    }

    @Entonces("el usuario mirar la tasa anual efectiva")
    public void elUsuarioMirarLaTasaAnualEfectiva() throws InterruptedException {
        System.out.println("Quinto paso....");
        pasos.validarTEA();
        Thread.sleep(2000);
    }

    @Y("termina el proceso dando en el boton lo quiero")
    public void terminaElProcesoDandoEnElBotonLoQuiero() throws InterruptedException {
        System.out.println("Sexto paso.....");
        Thread.sleep(3000);
        pasos.clickLoQuiero();
        Thread.sleep(3000);
    }
}
