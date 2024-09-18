package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Validar implements Question<Boolean> {
    private String strLabelHomePage;

    public Validar(String strLabelHomePage) {
        this.strLabelHomePage = strLabelHomePage;
    }

    public static Validar homePage(String strLabelHomePage) {
        return new Validar(strLabelHomePage);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
}
