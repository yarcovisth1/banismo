package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Login implements Task {

    public static Login conCredenciales(String strUsuario, String strClave) {
        return Tasks.instrumented(Login.class,strUsuario,strClave);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

        );
    }
}
