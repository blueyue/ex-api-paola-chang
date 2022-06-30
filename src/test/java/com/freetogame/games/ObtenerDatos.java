package com.freetogame.games;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class ObtenerDatos {

    private static String URL_BASE = "https://www.freetogame.com/api/games";

    //https://www.freetogame.com/api/games?platform=pc&category=shooter

    @Step("Obtener datos de juegos ")
    public void obtenerUsuario(String platform, String category){
        SerenityRest.get(URL_BASE+"?platform="+platform+"&category="+category);
    }
}
