Feature: Registro de usuario y compra de producto exitoso


  Scenario: Registro de usuario y compra de producto
    Given Estoy en la pagina de inicio de sesion
    When  Hago clic en el boton de registrar
    And   Ingreso los datos de registro random del usuario
    And  Envio el formulario de registros
    And Ingreso el nombre de usuario  y mi contrasena
    And selecciono un producto
    And agrego el producto al carrito
    Then verifico que el producto seleccionado está en el carrito

    #Este escenario es una pruebas mas robusta E2E en donde se registra un usuario ramdom luego se inciia sesion y despues se agrega un producto al carrito