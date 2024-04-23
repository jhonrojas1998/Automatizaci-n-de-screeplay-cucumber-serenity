Feature: Añadir producto al carrito
  Como cliente
  Quiero añadir un producto al carrito
  Para poder comprarlo más tarde

#  Scenario: Añadir producto al carrito
#    Given Estoy en la pagina de inicio de sesion
#    And selecciono un producto
#    And agrego el producto al carrito
#    Then verifico que el producto seleccionado está en el carrito
#    And Hago Clic en el boton de registrar pago
#    And Ingreso los datos para el pago
#    And Verifico el mensaje de pago exitoso en pantalla

  Scenario: Añadir producto producto diferente al carrito y eliminarlo
    Given Estoy en la pagina de inicio de sesion
    And selecciono un producto diferente
    Then agrego el producto al carrito
    Then verifico que el producto seleccionado nokia está en el carrito
    And  hago clic en el boton de eliminar producto

    #Aqui cree dos escenarios de pruebas en donde es para selecionar productos diferentes hasta agregarlo al carrito
