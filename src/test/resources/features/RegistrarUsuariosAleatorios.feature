#Author: Jhon Hader
Feature: Registro de usuarios en DemoBlaze Aleatorios

  Scenario: Registro exitoso de un nuevo usuario de forma aleatoria
    Given Estoy en la pagina de inicio de sesion
    When  Hago clic en el boton de registrar
    And   Ingreso los datos de registro random
    Then  Envio el formulario de registro de usuarios

    #Este escenario es para realizar registros de usuarios aleatorios con una forma ramdom