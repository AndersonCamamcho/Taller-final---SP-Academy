package com.demoqa.stepdefinitions;


import com.demoqa.tasks.TablasWeb;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RegistroDeDatosStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    
    @Given("^la persona quiere registrarse$")
    public void AbrirPaginasRequeridas() {
    OnStage.theActorCalled("Ander_Bot").wasAbleTo(Open.url( "https://demoqa.com/"));

    }
    @When("^llene los campos requeridos$")
    public void lleneLosCamposRequeridos() {
        OnStage.theActorInTheSpotlight().attemptsTo(TablasWeb.tablasWeb());

    }

    @Then("^quedara registrado de manera exitosa$")
    public void quedaraRegistradoDeManeraExitosa() {

    }
}
