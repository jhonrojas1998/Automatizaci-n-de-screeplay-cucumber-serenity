package co.com.pragma.pruebas.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosRegistroUsuarios extends PageObject {
    public static final Target BOTON_REGISTRAR = Target.the("Hacer clic en el boton de registrar")
            .located(By.id("signin2"));
    public static final Target CAMPO_USUARIO = Target.the("Ingresar el usuario")
            .located(By.id("sign-username"));
    public static final Target CAMPO_CONTRASEÑA = Target.the("Ingresar la contraseña")
            .located(By.id("sign-password"));
    public static final Target BOTON_DE_ENVIAR_REGISTRO = Target.the("Hacer clic en el boton de enviar registro")
            .locatedBy("//button[contains(text(),'Sign up')]");
    public static final Target MENSAJE_SUCCESS = Target.the("Success message")
            .locatedBy(".sweet-alert h2");
    public static final Target ACCEPT_BUTTON = Target.the("clic en botón aceptar emergente")
            .locatedBy("//button[contains(text(),'Accept')]");
    public static final Target CONFIRMACION_MENSAJE = Target.the("Confirmation message")
            .locatedBy(".modal-body");
}
