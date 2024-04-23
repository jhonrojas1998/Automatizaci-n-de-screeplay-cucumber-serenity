Feature: Iniciar Sesion en un Sitio Web STORE
  Como usuario registrado
  Quiero iniciar sesión en el sitio web
  Para acceder a mi cuenta

  Scenario: Iniciar Sesion con Credenciales Validas
    Given Estoy en la pagina de inicio de sesion
    When Ingreso mi nombre de usuario  y mi contrasena
    And Hago clic en el boton de iniciar sesion
    Then Deberia estar en la pagina de inicio

    #Este escenario de pruebas es para realizar un inciio de sesion correcto en la plataforma
