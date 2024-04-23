package co.com.pragma.pruebas.tasks;

import co.com.pragma.pruebas.userinterfaces.DatosRegistroUsuarios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

public class RegistroRandomUsuario implements Task {


        private final String username;
        private final String password;

        public RegistroRandomUsuario(String username, String password) {
            this.username = username;
            this.password = password;
        }



        public static Performable conUsuario(String username) {
            return Task.where("{0} enters username '#username'",
                    Enter.theValue(username).into(DatosRegistroUsuarios.CAMPO_USUARIO)
            );
        }

        public static Performable yContraseña(String password) {
            return Task.where("{0} enters password '#password'",
                    Enter.theValue(password).into(DatosRegistroUsuarios.CAMPO_CONTRASEÑA)
            );
        }

        @Override
        public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(
                    Enter.theValue(username).into(DatosRegistroUsuarios.CAMPO_USUARIO),
                    Enter.theValue(password).into(DatosRegistroUsuarios.CAMPO_CONTRASEÑA)
            );
            //actor.remember("registeredUsername", username);

        }
}
