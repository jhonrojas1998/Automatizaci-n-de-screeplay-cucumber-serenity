package co.com.pragma.pruebas.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import co.com.pragma.pruebas.userinterfaces.DatosLoginIngreso;

public class ClicBotonLoginHome implements Task {


        private DatosLoginIngreso DatosLoginIngreso;

        public static ClicBotonLoginHome LoginHome() {
            return Tasks.instrumented(ClicBotonLoginHome.class);
        }

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(DatosLoginIngreso.BOTON_LOGIN));


        }
}
