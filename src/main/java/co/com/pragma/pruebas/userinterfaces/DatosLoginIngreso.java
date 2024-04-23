package co.com.pragma.pruebas.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosLoginIngreso extends PageObject {
    public static final Target BOTON_LOGIN = Target.the("Hacer clic en el boton del login")
            .located(By.id("login2"));
    public static final Target CAMPO_USUARIO = Target.the("Ingresa el usuario")
            .located(By.id("loginusername"));
    public static final Target CAMPO_CONTRASEÑA = Target.the("Ingresa la contraseña")
            .located(By.id("loginpassword"));
    public static final  Target BOTON_DE_INGRESAR = Target.the("Iniciar sesión botón enviar")
            .locatedBy("//button[contains(text(),'Log in')]");
    public static final Target USUARIO_INGRESADO = Target.the("Bienvenido usuario")
            .located(By.id("nameofuser"));

//a[contains(.,'Home (current)')]
}
