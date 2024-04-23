package co.com.pragma.pruebas.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static net.serenitybdd.core.Serenity.getDriver;

public class ManejarVentanaEmergente implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        Alert alert = driver.switchTo().alert();
        alert.accept(); // Opcional: Puedes aceptar la alerta, rechazarla o realizar otras acciones según sea necesario
    }

    public static ManejarVentanaEmergente accept() {
        return new ManejarVentanaEmergente();
    }

    public static ManejarVentanaEmergente dismiss() {
        return new ManejarVentanaEmergente();


    }




}
