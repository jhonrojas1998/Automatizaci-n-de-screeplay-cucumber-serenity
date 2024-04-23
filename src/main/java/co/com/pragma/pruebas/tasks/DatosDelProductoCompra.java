package co.com.pragma.pruebas.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import co.com.pragma.pruebas.userinterfaces.FormularioRealizarPedido;

public class DatosDelProductoCompra implements Task {
    private FormularioRealizarPedido FormularioRealizarPedido;


    public static DatosDelProductoCompra FormularioCompra() {
        return Tasks.instrumented(DatosDelProductoCompra.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Celular").into(FormularioRealizarPedido.NOMBRE_PEIDO),
                Enter.theValue("Colombia").into(FormularioRealizarPedido.PAIS_PEDIDO),
                Enter.theValue("Medellin").into(FormularioRealizarPedido.CIUDAD_PEDIDO),
                Enter.theValue("6547867635").into(FormularioRealizarPedido.TARJETA_CREDITO_PEDIDO),
                Enter.theValue("Abril").into(FormularioRealizarPedido.MES_PEDIDO),
                Enter.theValue("2024").into(FormularioRealizarPedido.AÑO_PEDIDO),
                Click.on(FormularioRealizarPedido.BOTON_COMPRAR)
        );


    }
}
