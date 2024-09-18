package userinterface;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class BanistmoPage  {

    public final static Target VENTANA_MENSAJE = Target.the("Ventana mensaje")
            .locatedBy("//*[@id='btn-aceptar-cookies']/strong");

    public final static Target OPCION_MENU = Target.the("Opcion de Menu Principal")
            .locatedBy("//a[contains(text(),'{0}')]");
}
