package com.freetogame.steps;

import com.freetogame.games.ObtenerDatos;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ObtenerDatosDef {

    @Steps
    ObtenerDatos obtenerDatos;

    @When("consulto los datos por {string} y {string}")
    public void consultoLosDatosPorY(String platform, String category) {
        obtenerDatos.obtenerUsuario(platform,category);
    }

    @Then("el codigo de resultado es {int}")
    public void elCodigoDeResultadoEs(int codigo) {
        restAssuredThat(response -> response.statusCode(codigo));
    }
}
