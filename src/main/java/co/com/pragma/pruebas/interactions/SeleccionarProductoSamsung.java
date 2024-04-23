package co.com.pragma.pruebas.interactions;

import co.com.pragma.pruebas.userinterfaces.ObjetosDeProductoSelecionados;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.pragma.pruebas.userinterfaces.ObjetosDeProductoSelecionados.SAMSUNG_GALAXY_S6;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarProductoSamsung implements Task {
    private ObjetosDeProductoSelecionados ObjetosDeProductoSelecionados;

    public static SeleccionarProductoSamsung ProductoSelecionar(){
        return Tasks.instrumented(SeleccionarProductoSamsung.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SAMSUNG_GALAXY_S6, isVisible()).forNoMoreThan(10000).seconds(),
                Click.on(SAMSUNG_GALAXY_S6));
                //Click.on(SAMSUNG_GALAXY_S6));


    }
}
