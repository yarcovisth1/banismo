package task;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.BanistmoPage;

public class Navegacion implements Task {

    private String opcion;

    public Navegacion(String opcion) {
        this.opcion = opcion;
    }

    public static Navegacion navegar(String opcion) {
      return Instrumented.instanceOf(Navegacion.class).withProperties(opcion);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BanistmoPage.VENTANA_MENSAJE),
                Click.on(BanistmoPage.OPCION_MENU.of(opcion)),
                Click.on(BanistmoPage.OPCION_MENU.of("Información Corporativa")),
                Click.on(BanistmoPage.OPCION_MENU.of("Sostenibilidad"))

        );

    }
}
