package co.com.pragma.pruebas.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class ManejarAlerta {

    public static void handleAlert() {
        try {
            Actor actor = new Actor("jhon");
            WebDriver driver = BrowseTheWeb.as(actor).getDriver();
            Alert alert = driver.switchTo().alert();

            String alertText = alert.getText();
            System.out.println("Alert text: " + alertText);
            // Aquí puedes aceptar la alerta, cerrarla o manejarla según sea necesario
            alert.accept(); // Para aceptar la alerta
            //alert.dismiss(); // Para cerrar la alerta
        } catch (NoAlertPresentException e) {
            System.out.println("No alert present");
        }
    }
}
