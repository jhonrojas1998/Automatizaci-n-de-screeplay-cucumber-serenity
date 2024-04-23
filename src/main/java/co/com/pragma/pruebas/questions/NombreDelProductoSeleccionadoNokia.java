package co.com.pragma.pruebas.questions;

import co.com.pragma.pruebas.userinterfaces.ObjetosDeProductoSelecionados;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class NombreDelProductoSeleccionadoNokia implements Question<String> {
    public static Question<String> value(){
        return new NombreDelProductoSeleccionadoNokia();
    }
    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(ObjetosDeProductoSelecionados.NOMBRE_PRODUCTO_NOKIA).getText();

    }

}
