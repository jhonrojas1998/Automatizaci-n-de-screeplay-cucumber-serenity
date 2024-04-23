package co.com.pragma.pruebas.questions;

import co.com.pragma.pruebas.userinterfaces.DatosLoginIngreso;
import co.com.pragma.pruebas.userinterfaces.FormularioRealizarPedido;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class MensajeCompraExitosa implements Question<String> {
    public static Question<String> value(){
        return new MensajeCompraExitosa();
    }
    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(FormularioRealizarPedido.MENSAJE_COMPRA_EXITOSA).getText();

    }
}
