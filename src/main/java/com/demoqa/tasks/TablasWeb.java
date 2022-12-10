package com.demoqa.tasks;


import com.demoqa.userinterfaces.AgregarDatosTablasWeb;
import com.demoqa.userinterfaces.PaginaElementos;
import com.demoqa.userinterfaces.PaginaInicial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SendKeys;


import java.util.List;

public class TablasWeb implements Task {

    private PaginaInicial paginaInicial;
    private PaginaElementos paginaElementos;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(paginaInicial),
                Click.on(PaginaInicial.BOTON_ELEMENTOS),
                Click.on(PaginaElementos.TABLAS_WEB),
                Click.on(AgregarDatosTablasWeb.ELIMINAR_3),
                Click.on(AgregarDatosTablasWeb.ELIMINAR_2),
                Click.on(AgregarDatosTablasWeb.ELIMINAR_1),
                Click.on(AgregarDatosTablasWeb.BOTON_REGISTER_FORM),
                SendKeys.of("lucero").into(AgregarDatosTablasWeb.FIRTS_NAME),
                SendKeys.of("Jimenez").into(AgregarDatosTablasWeb.LAST_NAME),
                SendKeys.of("lucero@sophos.com").into(AgregarDatosTablasWeb.EMAIL),
                SendKeys.of("30").into(AgregarDatosTablasWeb.AGE),
                SendKeys.of("4000 usd").into(AgregarDatosTablasWeb.SALARY),
                SendKeys.of("Automatizacion").into(AgregarDatosTablasWeb.DEPARTMENT)
    );


    }
    public static TablasWeb tablasWeb (){
        return Tasks.instrumented(TablasWeb.class);
    }

}
