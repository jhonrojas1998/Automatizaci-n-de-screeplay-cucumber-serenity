package co.com.pragma.pruebas.interactions;


import co.com.pragma.pruebas.userinterfaces.DatosRegistroUsuarios;
import co.com.pragma.pruebas.userinterfaces.TiempoDeEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.pragma.pruebas.userinterfaces.DatosRegistroUsuarios.ACCEPT_BUTTON;
import static co.com.pragma.pruebas.userinterfaces.DatosRegistroUsuarios.BOTON_REGISTRAR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ClicBotonRegistrarUsuarios implements Task {


    private DatosRegistroUsuarios DatosRegistroUsuarios;

    public static ClicBotonRegistrarUsuarios enLaPaginaRegistro() {
        return Tasks.instrumented(ClicBotonRegistrarUsuarios.class);

    }

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    WaitUntil.the(BOTON_REGISTRAR, isVisible()).forNoMoreThan(10).seconds(),
                    Click.on(BOTON_REGISTRAR));


        }



}
