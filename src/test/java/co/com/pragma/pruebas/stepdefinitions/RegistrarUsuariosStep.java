package co.com.pragma.pruebas.stepdefinitions;

import co.com.pragma.pruebas.interactions.ClicBotonEnviarRegistroUsuarios;
import co.com.pragma.pruebas.interactions.ClicBotonLoginHome;
import co.com.pragma.pruebas.interactions.ClicBotonRegistrarUsuarios;
import co.com.pragma.pruebas.interactions.ClicEnviarFormularioRegistroUsuarios;
import co.com.pragma.pruebas.tasks.AbrirUrlNavegador;
import co.com.pragma.pruebas.tasks.DatosLogin;
import co.com.pragma.pruebas.tasks.DatosRegistro;
import co.com.pragma.pruebas.userinterfaces.DatosRegistroUsuarios;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.PerformsTasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.Visibility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import static co.com.pragma.pruebas.userinterfaces.DatosRegistroUsuarios.ACCEPT_BUTTON;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistrarUsuariosStep {

    @When("Hago clic en el boton de registrar")
    public void hagoClicEnElBotonDeRegistrar() {
        OnStage.theActorCalled("Jhon Hader").wasAbleTo(ClicBotonRegistrarUsuarios.enLaPaginaRegistro());

    }

    @When("Ingreso los datos de registro")
    public void ingresoLosDatosDeRegistro() {
        OnStage.theActorCalled("Jhon Hader").wasAbleTo(DatosRegistro.PaginaRegistro());

    }
    @When("Envio el formulario de registro de usuarios")
    public void EnvioElFormularioDeRegistroDeUsuarios() {
        OnStage.theActorCalled("Jhon Hader").wasAbleTo(ClicEnviarFormularioRegistroUsuarios.enviarFormularioRegistro());

    }

    @When("Envio el formulario de registro")
    public void envioElFormularioDeRegistro() {
        OnStage.theActorCalled("Jhon Hader").wasAbleTo(ClicBotonEnviarRegistroUsuarios.enLaPaginaRegistroUsuarios());



    }
    @When("Ingreso a la opcion login del home")
    public void ingresoALOpcionLoginDelHome() {
        OnStage.theActorCalled("Jhon Hader").wasAbleTo(ClicBotonLoginHome.LoginHome());

    }

    @Then("debo visualizar un mensaje de confirmación de registro")
    public void deboVisualizarUnMensajeDeConfirmaciónDeRegistro() {

    }
}




