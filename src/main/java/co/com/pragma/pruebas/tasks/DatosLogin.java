package co.com.pragma.pruebas.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import co.com.pragma.pruebas.userinterfaces.DatosLoginIngreso;
public class DatosLogin implements Task {

    private DatosLoginIngreso DatosLoginIngreso;

    public static DatosLogin enLaPagina() {
        return Tasks.instrumented(DatosLogin.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Click.on(DatosLoginIngreso.BOTON_LOGIN),
        Enter.theValue("jhonhader").into(DatosLoginIngreso.CAMPO_USUARIO),
        Enter.theValue("JHONrojas1234").into(DatosLoginIngreso.CAMPO_CONTRASEÑA)
        );
    }

}
