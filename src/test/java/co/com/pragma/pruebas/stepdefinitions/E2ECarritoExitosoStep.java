package co.com.pragma.pruebas.stepdefinitions;

import co.com.pragma.pruebas.interactions.*;
import co.com.pragma.pruebas.questions.BienvenidoUsuarioLogin;
import co.com.pragma.pruebas.questions.MensajeCompraExitosa;
import co.com.pragma.pruebas.questions.NombreDelProducto;
import co.com.pragma.pruebas.questions.NombreDelProductoSeleccionadoNokia;
import co.com.pragma.pruebas.tasks.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class E2ECarritoExitosoStep {

    @And("Envio el formulario de registros")
    public void envioElFormularioDeRegistros() {
        OnStage.theActorCalled("Jhon Hader").wasAbleTo(ClicBotonEnviarRegistroUsuarios.enLaPaginaRegistroUsuarios());
        //OnStage.theActorCalled("Jhon Hader").wasAbleTo(AbrirUrlNavegador.LaPagina());
        //OnStage.theActorCalled("Jhon Hader").wasAbleTo(ClicBotonLoginHome.LoginHome());


    }

    @And("Ingreso el nombre de usuario  y mi contrasena")
    public void ingresoElNombreDeUsuarioYMiContrasena() {
        OnStage.theActorCalled("Jhon Hader").wasAbleTo(LoginAleatorio.LaPaginaLogin());
        OnStage.theActorCalled("Jhon Hader").wasAbleTo(BotonIngresarLogin.LaPaginaRegistroUsuarios());
        OnStage.theActorCalled("Jhon Hader").wasAbleTo(AbrirUrlNavegador.LaPagina());

    }

    @And("selecciono un producto")
    public void seleccionoUnProducto() {
        OnStage.theActorCalled("Jhon Hader").wasAbleTo(SeleccionarProductoSamsung.ProductoSelecionar());


    }

    @And("agrego el producto al carrito")
    public void agregoElProductoAlCarrito() {
        OnStage.theActorCalled("Jhon Hader").wasAbleTo(BotonAñadirCarrito.AñadirCarrito());


    }

    @Then("verifico que el producto seleccionado está en el carrito")
    public void verificoQueElProductoSeleccionadoEstáEnElCarrito() {
        OnStage.theActorCalled("Jhon Hader").wasAbleTo(BotonCarritoHome.botonCarritoHome());
        System.out.println(NombreDelProducto.value().answeredBy(theActorInTheSpotlight()));
        theActorInTheSpotlight().should(
                seeThat("validar el nombre del producto en el carrito", NombreDelProducto.value(), equalTo("Samsung galaxy s6")));


    }

    @Then("verifico que el producto seleccionado nokia está en el carrito")
    public void verificoQueElProductoSeleccionadoNokiaEstáEnElCarrito() {

        OnStage.theActorCalled("Jhon Hader").wasAbleTo(BotonCarritoHome.botonCarritoHome());
        System.out.println(NombreDelProductoSeleccionadoNokia.value().answeredBy(theActorInTheSpotlight()));
        theActorInTheSpotlight().should(
                seeThat("validar el nombre del producto en el carrito", NombreDelProductoSeleccionadoNokia.value(), equalTo("Nokia lumia 1520")));


    }

    @And("selecciono un producto diferente")
    public void seleccionoUnProductodoDiferente() {
        OnStage.theActorCalled("Jhon Hader").wasAbleTo(ClicLinkNokiaProducto.LinkSamsung());


    }

    @And("Hago Clic en el boton de registrar pago")
    public void HagoClicEnElBotonDeRegistrarPago() {
        OnStage.theActorCalled("Jhon Hader").wasAbleTo(ClicEnBotonRealizarPedido.BotonRealizarPedido());

    }

    @And("Ingreso los datos para el pago")
    public void IngresoLosDatosParaElPago() {
        OnStage.theActorCalled("Jhon Hader").wasAbleTo(DatosDelProductoCompra.FormularioCompra());

    }

    @And("Verifico el mensaje de pago exitoso en pantalla")
    public void VerificoElMensajeDePagoExitosoEnPantalla() {
        System.out.println(MensajeCompraExitosa.value().answeredBy(theActorInTheSpotlight()));
        theActorInTheSpotlight().should(
                seeThat("validar el nombre del producto en el carrito", MensajeCompraExitosa.value(), equalTo("Thank you for your purchase!")));

    }

    @And("hago clic en el boton de eliminar producto")
    public void hagoClicEnElBotonDeEliminarProducto() {
        OnStage.theActorCalled("Jhon Hader").wasAbleTo(ClicBotonEliminarProducto.botonEliminar());


    }
}
