package co.com.pragma.pruebas.questions;


import co.com.pragma.pruebas.userinterfaces.DatosLoginIngreso;
import co.com.pragma.pruebas.userinterfaces.ObjetosDeProductoSelecionados;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class NombreDelProducto implements Question<String> {
        public static Question<String> value(){
            return new NombreDelProducto();
        }
        @Override
        public String answeredBy(Actor actor) {
            return BrowseTheWeb.as(actor).find(ObjetosDeProductoSelecionados.NOMBRE_PRODUCTO).getText();

        }

    }
