package com.demoqa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaElementos {

    public static final Target TABLAS_WEB= Target.the( "Sub seccion de preingreso de datos")
            .located(By.xpath("//span[contains(text(),'Tables')]"));

}
