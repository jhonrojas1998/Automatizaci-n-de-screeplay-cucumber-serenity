package co.com.pragma.pruebas.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/RegistrarUsuariosAleatorios.feature",
        //tags = "@Stories",
        glue = "co.com.pragma.pruebas.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty"}
)
public class RegistrarUsuariosAleatoriosRun {
}
