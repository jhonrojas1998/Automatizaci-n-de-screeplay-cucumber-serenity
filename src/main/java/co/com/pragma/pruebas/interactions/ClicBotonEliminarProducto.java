package co.com.pragma.pruebas.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import co.com.pragma.pruebas.userinterfaces.ObjetosDeProductoSelecionados;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.pragma.pruebas.userinterfaces.AbrirPaginaDePruebas.INICIO;
import static co.com.pragma.pruebas.userinterfaces.DatosLoginIngreso.BOTON_DE_INGRESAR;
import static co.com.pragma.pruebas.userinterfaces.ObjetosDeProductoSelecionados.BOTON_AÑADIR_PRODUCTO;
import static co.com.pragma.pruebas.userinterfaces.ObjetosDeProductoSelecionados.BOTON_ELMINAR_PRODUCTO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ClicBotonEliminarProducto implements Task {
    private ObjetosDeProductoSelecionados ObjetosDeProductoSelecionados;

    public static ClicBotonEliminarProducto botonEliminar() {
        return Tasks.instrumented(ClicBotonEliminarProducto.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_ELMINAR_PRODUCTO),
                WaitUntil.the(INICIO, isVisible()).forNoMoreThan(5000).seconds());


    }
}
