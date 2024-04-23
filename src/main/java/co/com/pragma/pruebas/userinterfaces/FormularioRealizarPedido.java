package co.com.pragma.pruebas.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FormularioRealizarPedido extends PageObject {
    public static final Target NOMBRE_PEIDO = Target.the("Ingresar el nombre del pedido")
            .located(By.id("name"));
    public static final Target PAIS_PEDIDO = Target.the("Ingresar el pais")
            .located(By.id("country"));
    public static final Target CIUDAD_PEDIDO = Target.the("Ingresar la ciudad")
            .located(By.id("city"));
    public static final Target TARJETA_CREDITO_PEDIDO = Target.the("Ingresar el numero de la tarjeta")
            .located(By.id("card"));
    public static final Target MES_PEDIDO = Target.the("Ingresar el mes")
            .located(By.id("month"));
    public static final Target AÑO_PEDIDO = Target.the("Ingresar el año")
            .located(By.id("year"));
    public static final Target BOTON_COMPRAR = Target.the("Clic en el boton de comprar")
            .locatedBy("//button[@type='button'][contains(.,'Purchase')]");
    public static final Target MENSAJE_COMPRA_EXITOSA = Target.the("Selecciono el nombre del producto")
            .locatedBy("//h2[contains(.,'Thank you for your purchase!')]");
}
