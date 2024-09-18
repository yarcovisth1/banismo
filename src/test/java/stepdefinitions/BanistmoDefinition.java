package stepdefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import task.Navegacion;


public class BanistmoDefinition {
    @Before
    public static void onStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("el usuario accede al sitio web de Banistmo")
    public void elUsuarioAccedeAlSitioWebDeBanistmo() {
        OnStage.theActorCalled("Banistmo").attemptsTo(
                Open.url("https://www.banistmo.com/wps/portal/banistmo/personas/")
    );
    }
    @Then("el usuario valida que la ventana emergente es la correcta")
    public void elUsuarioValidaQueLaVentanaEmergenteEsLaCorrecta() {

    }

    @When("el usuario navega a la sección {string} realiazando los pasos recomendados")
    public void elUsuarioNavegaALaSecciónRealiazandoLosPasosRecomendados(String opcion) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Navegacion.navegar(opcion)
        );
    }
}

