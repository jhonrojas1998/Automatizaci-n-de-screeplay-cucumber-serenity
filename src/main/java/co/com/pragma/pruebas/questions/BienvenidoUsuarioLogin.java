package co.com.pragma.pruebas.questions;

import co.com.pragma.pruebas.userinterfaces.DatosLoginIngreso;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;


    public class BienvenidoUsuarioLogin implements Question<String> {
        public static Question<String> value(){
            return new BienvenidoUsuarioLogin();
        }
        @Override
        public String answeredBy(Actor actor) {
            return BrowseTheWeb.as(actor).find(DatosLoginIngreso.USUARIO_INGRESADO).getText();

        }

    }

