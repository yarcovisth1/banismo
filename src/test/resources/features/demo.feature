Feature: Validar Ventana Emergente en la Sección de Reciclaje
  @CasoExitoso
  Scenario: Validar ventana emergente en la sección de reciclaje
    Given el usuario accede al sitio web de Banistmo
    When el usuario navega a la sección "Acerca de nosotros" realiazando los pasos recomendados
    And el usuario hace clic en "Conoce más" en la opción '¿Por qué es importante reciclar?'
    Then el usuario valida que la ventana emergente es la correcta