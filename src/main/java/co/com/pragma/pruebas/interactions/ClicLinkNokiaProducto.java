package co.com.pragma.pruebas.interactions;

import co.com.pragma.pruebas.tasks.ManejarVentanaEmergente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import co.com.pragma.pruebas.userinterfaces.ObjetosDeProductoSelecionados;

public class ClicLinkNokiaProducto implements Task {
    private ObjetosDeProductoSelecionados ObjetosDeProductoSelecionados;

    public static ClicLinkNokiaProducto LinkSamsung() {
        return Tasks.instrumented(ClicLinkNokiaProducto.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ObjetosDeProductoSelecionados.NOKIA_LUMIA_1520));
        //ManejarVentanaEmergente.accept();
        //ManejarVentanaEmergente.dismiss();
    }
}
