package movistar.onb.libre.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import movistar.onb.libre.pageObject.PagePremium;
import movistar.onb.libre.steps.Ingreso2Steps;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class IngresoStepPremiumDefinitions {

    @Steps
    Ingreso2Steps pasospremium;

    @Steps
    PagePremium premium;

    @Dado("el usuario premium ingresa al simulador")
    public void elUsuarioPremiumIngresaAlSimulador() throws InterruptedException {
        System.out.println("pasos 1.... premium");
        pasospremium.abrirNavegadorBasic();
        Thread.sleep(2000);

    }

    @Entonces("el usuario premium selecciona la cantidad que desea solicitar en el credito")
    public void elUsuarioPremiumSeleccionaLaCantidadQueDeseaSolicitarEnElCredito() throws InterruptedException {
        System.out.println("Segundo paso premium......");
        pasospremium.seleccionarMontoBasic();
        Thread.sleep(3000);
    }


    @Cuando("el usuario premium verifica si existen tres opciones de plazo")
    public void elUsuarioPremiumVerificaSiExistenTresOpcionesDePlazo() throws InterruptedException {
        System.out.println("Tercer paso premium.....");
        pasospremium.validarCuotasBasic();
        Thread.sleep(3000);
    }

    @Entonces("el usuario premium selecciona una opcion")
    public void elUsuarioPremiumSeleccionaUnaOpcion() throws InterruptedException {
        System.out.println("Cuarto paso premium......");
        System.out.println(pasospremium.selectCuotaBasic());
        Assert.assertTrue("Valor invalido de cuota",pasospremium.selectCuotaBasic());
        Thread.sleep(4000);
        System.out.println("funcionooo");
    }

    @Entonces("el usuario premium mirar la tasa anual efectiva")
    public void elUsuarioPremiumMirarLaTasaAnualEfectiva() throws InterruptedException {
        System.out.println("Quinto paso....");
        pasospremium.validarTEA();
        Thread.sleep(2000);
    }

    @Y("el usuario premium termina el proceso dando en el boton lo quiero")
    public void elUsuarioPremiumTerminaElProcesoDandoEnElBotonLoQuiero() throws InterruptedException {
        System.out.println("Sexto paso.....");
        pasospremium.clickLoQuiero();
        Thread.sleep(3000);
    }
}
