package co.com.pragma.pruebas.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import co.com.pragma.pruebas.userinterfaces.ObjetosDeProductoSelecionados;

public class ClicEnBotonRealizarPedido implements Task {
    private ObjetosDeProductoSelecionados ObjetosDeProductoSelecionados;

    public static ClicEnBotonRealizarPedido BotonRealizarPedido() {
        return Tasks.instrumented(ClicEnBotonRealizarPedido.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ObjetosDeProductoSelecionados.BOTON_REALIZAR_PEDIDO));

    }
}
