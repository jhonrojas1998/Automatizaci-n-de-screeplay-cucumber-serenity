package co.com.pragma.pruebas.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import co.com.pragma.pruebas.userinterfaces.DatosLoginIngreso;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.pragma.pruebas.userinterfaces.DatosLoginIngreso.BOTON_DE_INGRESAR;
import static co.com.pragma.pruebas.userinterfaces.DatosLoginIngreso.BOTON_LOGIN;
import static co.com.pragma.pruebas.userinterfaces.DatosRegistroUsuarios.ACCEPT_BUTTON;
import static co.com.pragma.pruebas.userinterfaces.ObjetosDeProductoSelecionados.SAMSUNG_GALAXY_S6;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import co.com.pragma.pruebas.tasks.ejemplotiempo;

public class BotonIngresarLogin implements Task {

        private DatosLoginIngreso DatosLoginIngreso;

        public static BotonIngresarLogin LaPaginaRegistroUsuarios() {
            return Tasks.instrumented(BotonIngresarLogin.class);
        }

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    WaitUntil.the(BOTON_DE_INGRESAR, isVisible()).forNoMoreThan(2000).seconds(),
                    Click.on(BOTON_DE_INGRESAR));
                    //ejemplotiempo.sleep(5000);
                    //ejemplotiempo.Tiempo(),
                    //WaitUntil.the(ACCEPT_BUTTON, isVisible()).forNoMoreThan(2000).seconds(),
                    //Click.on(ACCEPT_BUTTON));

                    //Click.on(BOTON_DE_INGRESAR),
                    //WaitUntil.the(SAMSUNG_GALAXY_S6, isVisible()).forNoMoreThan(1000).seconds(),
                    //Click.on(SAMSUNG_GALAXY_S6));




        }
}
