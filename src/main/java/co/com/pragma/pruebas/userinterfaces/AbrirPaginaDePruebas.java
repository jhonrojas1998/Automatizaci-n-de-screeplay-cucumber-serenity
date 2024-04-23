package co.com.pragma.pruebas.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.demoblaze.com/ ")
public class AbrirPaginaDePruebas extends PageObject {
    public static final Target INICIO = Target.the("Boton de inicio en la pagina")
            .locatedBy("//a[contains(.,'Home (current)')]");
}

