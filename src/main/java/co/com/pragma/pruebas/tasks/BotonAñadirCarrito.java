package co.com.pragma.pruebas.tasks;

import co.com.pragma.pruebas.userinterfaces.ObjetosDeProductoSelecionados;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;

import static co.com.pragma.pruebas.userinterfaces.ObjetosDeProductoSelecionados.BOTON_AÑADIR_PRODUCTO;
import static co.com.pragma.pruebas.userinterfaces.ObjetosDeProductoSelecionados.SAMSUNG_GALAXY_S6;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BotonAñadirCarrito implements Task {
    private ObjetosDeProductoSelecionados ObjetosDeProductoSelecionados;

    public static BotonAñadirCarrito AñadirCarrito() {
        return Tasks.instrumented(BotonAñadirCarrito.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        WaitUntil.the(BOTON_AÑADIR_PRODUCTO, isVisible()).forNoMoreThan(1000).seconds(),
                Click.on(BOTON_AÑADIR_PRODUCTO));
        //ManejarAlerta.handleAlert();




    }
}
