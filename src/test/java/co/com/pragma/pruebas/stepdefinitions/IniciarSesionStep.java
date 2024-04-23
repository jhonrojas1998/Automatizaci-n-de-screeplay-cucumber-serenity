package co.com.pragma.pruebas.stepdefinitions;

import co.com.pragma.pruebas.interactions.BotonIngresarLogin;
import co.com.pragma.pruebas.questions.BienvenidoUsuarioLogin;
import co.com.pragma.pruebas.tasks.AbrirUrlNavegador;
import co.com.pragma.pruebas.tasks.DatosLogin;
import co.com.pragma.pruebas.userinterfaces.DatosLoginIngreso;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class IniciarSesionStep {
    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
        WebDriverManager.chromedriver().setup();
    }
    @Given("Estoy en la pagina de inicio de sesion")
    public void estoyEnLaPaginaDeInicioDeSesion() {
        OnStage.theActorCalled("Jhon Hader").wasAbleTo(AbrirUrlNavegador.LaPagina());

    }
    @When("Ingreso mi nombre de usuario  y mi contrasena")
    public void ingresoMiNombreDeUsuarioYMiContrasena() {

    OnStage.theActorCalled("Jhon Hader").wasAbleTo(DatosLogin.enLaPagina());



    }
    @When("Hago clic en el boton de iniciar sesion")
    public void hagoClicEnElBotonDeIniciarSesion() {
        OnStage.theActorCalled("Jhon Hader").wasAbleTo(BotonIngresarLogin.LaPaginaRegistroUsuarios());

    }
    @Then("Deberia estar en la pagina de inicio")
    public void deberiaEstarEnLaPaginaDeInicio() {
        System.out.println(BienvenidoUsuarioLogin.value().answeredBy(theActorInTheSpotlight()));
        theActorInTheSpotlight().should(
                seeThat("validar el nombre de usuario logueado", BienvenidoUsuarioLogin.value(), equalTo("Welcome jhonhader")));


    }
}
