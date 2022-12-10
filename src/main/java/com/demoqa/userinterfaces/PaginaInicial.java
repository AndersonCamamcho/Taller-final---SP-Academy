package com.demoqa.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;



public class PaginaInicial extends PageObject {
    public static final Target BOTON_ELEMENTOS  = Target.the( "Boton para ingresar al registro de datos")
                .located(By.xpath("(//div[@class='card-up'])[1]"));
}
