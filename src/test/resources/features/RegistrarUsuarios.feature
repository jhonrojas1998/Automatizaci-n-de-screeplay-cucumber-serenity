#Autor: Jhon Hader
Feature: Registro de usuarios en DemoBlaze

  Scenario: Registro exitoso de un nuevo usuario
    Given Estoy en la pagina de inicio de sesion
    When  Hago clic en el boton de registrar
    And   Ingreso los datos de registro
    Then  Envio el formulario de registro de usuarios

  # este escenario de pruebas es para hacer registro de usuario con datos quemados