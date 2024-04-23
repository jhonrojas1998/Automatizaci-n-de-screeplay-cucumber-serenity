package co.com.pragma.pruebas.tasks;

import co.com.pragma.pruebas.userinterfaces.DatosRegistroUsuarios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class DatosRegistro implements Task {

        private DatosRegistroUsuarios DatosRegistroUsuarios;


    public static DatosRegistro PaginaRegistro() {
        return Tasks.instrumented(DatosRegistro.class);
    }

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Enter.theValue("dianas").into(DatosRegistroUsuarios.CAMPO_USUARIO),
                    Enter.theValue("JHONrojas1234").into(DatosRegistroUsuarios.CAMPO_CONTRASEÑA)
                    );


        }
}
