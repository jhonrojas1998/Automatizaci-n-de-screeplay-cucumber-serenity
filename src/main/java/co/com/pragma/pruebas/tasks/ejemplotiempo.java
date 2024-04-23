package co.com.pragma.pruebas.tasks;

import co.com.pragma.pruebas.interactions.BotonIngresarLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

import static org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration.milliseconds;

public class ejemplotiempo implements Task{

    public static Performable Tiempo() {
        return Tasks.instrumented(BotonIngresarLogin.class);
    }

     public <T extends Actor> void performAs(T actor){
        try {
            // Pausa de 6 segundos
            Thread.sleep(3000);
        } catch (InterruptedException  e) {
            e.printStackTrace();

        }
    }

}


//public <T extends Actor> void performAs(T actor) {
    //try {
        // Pausa de 6 segundos
        //Thread.sleep(6000);
    //} catch (InterruptedException e) {
       // e.printStackTrace();
    //}
//}