package co.com.pragma.pruebas.interactions;

import co.com.pragma.pruebas.tasks.ManejarVentanaEmergente;
import co.com.pragma.pruebas.userinterfaces.ObjetosDeProductoSelecionados;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.pragma.pruebas.userinterfaces.ObjetosDeProductoSelecionados.BOTON_AÑADIR_PRODUCTO;
import static co.com.pragma.pruebas.userinterfaces.ObjetosDeProductoSelecionados.BOTON_CARRITO_HOME;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BotonCarritoHome implements Task {
    private ObjetosDeProductoSelecionados ObjetosDeProductoSelecionados;

    public static BotonCarritoHome botonCarritoHome() {
        return Tasks.instrumented(BotonCarritoHome.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        WaitUntil.the(BOTON_CARRITO_HOME, isVisible()).forNoMoreThan(1000).seconds(),
                Click.on(BOTON_CARRITO_HOME));
        //ManejarVentanaEmergente.accept();
        //ManejarVentanaEmergente.dismiss();


    }
}
