package co.com.pragma.pruebas.tasks;
import co.com.pragma.pruebas.userinterfaces.AbrirPaginaDePruebas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirUrlNavegador implements Task {

        private AbrirPaginaDePruebas AbrirPaginaDePruebas;
        public static AbrirUrlNavegador LaPagina() {
            return Tasks.instrumented(AbrirUrlNavegador.class);

        }


        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(Open.browserOn(AbrirPaginaDePruebas));

        }
}
