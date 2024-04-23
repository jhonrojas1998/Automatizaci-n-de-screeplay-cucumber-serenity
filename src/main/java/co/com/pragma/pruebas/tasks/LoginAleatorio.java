package co.com.pragma.pruebas.tasks;

import co.com.pragma.pruebas.userinterfaces.DatosLoginIngreso;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

    public class LoginAleatorio implements Task {

        private DatosLoginIngreso DatosLoginIngreso;

          public static LoginAleatorio LaPaginaLogin() {
            return Tasks.instrumented(LoginAleatorio.class);
        }

        @Override
        public <T extends Actor> void performAs(T actor) {
            //String registeredUsername = actor.recall("registeredUsername");
            actor.attemptsTo(
                    Enter.theValue("jhonhader").into(DatosLoginIngreso.CAMPO_USUARIO),
                    Enter.theValue("JHONrojas1234").into(DatosLoginIngreso.CAMPO_CONTRASEÑA)
            );
        }
}
