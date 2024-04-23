package co.com.pragma.pruebas.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ObjetosDeProductoSelecionados extends PageObject {
    public static final Target SAMSUNG_GALAXY_S6 = Target.the("Seleccionar el producto Samsung Galaxy S6 cell phone")
            .locatedBy("//a[contains(text(),'Samsung galaxy s6')]");
    public static final Target BOTON_AÑADIR_PRODUCTO = Target.the("Hacer clic en el botón añadir al carrito")
            .locatedBy("//a[contains(text(), 'Add to cart')]");
    public static final Target BOTON_CARRITO_HOME = Target.the("Hacer clic en el boton de registrar")
            .located(By.id("cartur"));
    public static final Target NOMBRE_PRODUCTO = Target.the("Selecciono el nombre del producto")
            .locatedBy("//td[contains(text(),'Samsung galaxy s6')]");
    public static final Target NOKIA_LUMIA_1520 = Target.the("Selecciono el nombre del producto")
            .locatedBy("//a[contains(text(),'Nokia lumia 1520')]");
    public static final Target NOMBRE_PRODUCTO_NOKIA = Target.the("Selecciono el nombre del producto")
            .locatedBy("//td[contains(.,'Nokia lumia 1520')]");
    public static final Target BOTON_REALIZAR_PEDIDO = Target.the("Selecciono el nombre del producto")
            .locatedBy("//button[contains(@class,'btn btn-success')]");
    public static final Target BOTON_ELMINAR_PRODUCTO = Target.the("Selecciono el nombre del producto")
            .locatedBy("//a[contains(.,'Delete')]");

}

