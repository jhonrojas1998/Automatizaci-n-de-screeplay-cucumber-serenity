package co.com.pragma.pruebas.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import co.com.pragma.pruebas.tasks.ejemplotiempo;
import net.serenitybdd.screenplay.waits.WaitUntil;
import co.com.pragma.pruebas.userinterfaces.DatosRegistroUsuarios;
import co.com.pragma.pruebas.tasks.ManejarVentanaEmergente;

import static co.com.pragma.pruebas.userinterfaces.DatosLoginIngreso.BOTON_LOGIN;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ClicEnviarFormularioRegistroUsuarios implements Task {
    private DatosRegistroUsuarios DatosRegistroUsuarios;

    public static ClicEnviarFormularioRegistroUsuarios enviarFormularioRegistro() {
        return Tasks.instrumented(ClicEnviarFormularioRegistroUsuarios.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DatosRegistroUsuarios.BOTON_DE_ENVIAR_REGISTRO));
               //ejemplotiempo.Tiempo();
               //ManejarVentanaEmergente.dismiss();



    }
}
