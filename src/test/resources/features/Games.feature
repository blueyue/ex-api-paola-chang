Feature: Obtener datos de videojuego
          As a usuario
          I want obtener los datos de los videojuegos
          So that puedo elegir que jugar

  Scenario: Obtener datos de videojuego exitosamente
    When consulto los datos por "pc" y "shooter"
    Then el codigo de resultado es 200


  Scenario: Obtener datos de videojuego falla
    When consulto los datos por "pc" y "shoote5"
    Then el codigo de resultado es 404