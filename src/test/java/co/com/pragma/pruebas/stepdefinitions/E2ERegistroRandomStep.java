package co.com.pragma.pruebas.stepdefinitions;


import co.com.pragma.pruebas.tasks.RegistroRandomUsuario;
import io.cucumber.java.en.And;
import net.serenitybdd.core.Serenity;

import java.util.Random;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class E2ERegistroRandomStep {
    @And("Ingreso los datos de registro random del usuario")
    public void ingresoLosDatosDeRegistroRandomDelUsuario() {
        String username = generateRandomUsername();
        String password = generateRandomPassword();

        Serenity.setSessionVariable("username").to(username);
        Serenity.setSessionVariable("password").to(password);

        theActorInTheSpotlight().attemptsTo(
                RegistroRandomUsuario.conUsuario(username),
                RegistroRandomUsuario.yContraseña(password)
        );




}
private String generateRandomUsername() {
// Lógica para generar un nombre de usuario aleatorio
    String characters = "abcdefghijklmnopqrstuvwxyz0123456789";
    StringBuilder username = new StringBuilder();
    Random rnd = new Random();
    int length = 8; // Longitud del nombre de usuario

    for (int i = 0; i < length; i++) {
        username.append(characters.charAt(rnd.nextInt(characters.length())));
    }

    return username.toString();

}
private String generateRandomPassword() {
    // Lógica para generar una contraseña aleatoria
    String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";
    StringBuilder password = new StringBuilder();
    Random rnd = new Random();
    int length = 12; // Longitud de la contraseña

    for (int i = 0; i < length; i++) {
        password.append(characters.charAt(rnd.nextInt(characters.length())));
    }

    return password.toString();
}

}
