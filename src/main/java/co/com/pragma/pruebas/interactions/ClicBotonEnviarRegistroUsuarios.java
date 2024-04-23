package co.com.pragma.pruebas.interactions;

import co.com.pragma.pruebas.tasks.ManejarVentanaEmergente;
import co.com.pragma.pruebas.tasks.ejemplotiempo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import co.com.pragma.pruebas.userinterfaces.DatosRegistroUsuarios;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.pragma.pruebas.userinterfaces.DatosLoginIngreso.BOTON_LOGIN;
import static co.com.pragma.pruebas.userinterfaces.DatosRegistroUsuarios.ACCEPT_BUTTON;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ClicBotonEnviarRegistroUsuarios implements Task {



        private DatosRegistroUsuarios DatosRegistroUsuarios;

        public static ClicBotonEnviarRegistroUsuarios enLaPaginaRegistroUsuarios() {
            return Tasks.instrumented(ClicBotonEnviarRegistroUsuarios.class);
        }

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(DatosRegistroUsuarios.BOTON_DE_ENVIAR_REGISTRO),
                    WaitUntil.the(BOTON_LOGIN, isVisible()).forNoMoreThan(300000).seconds(),
                    Click.on(BOTON_LOGIN));
                    //ManejarVentanaEmergente.accept();
                    //ejemplotiempo.Tiempo(),
                    //ManejarVentanaEmergente.dismiss();


        }
}
