Feature: HU-001 Buscador San Angel
  Yo como usuario de San Angel
  Quiero buscar en el buscador un producto
  Para ver el producto en la pagina

  Scenario Outline: <Escenario>
    Given que me encuentro en la pagina de San Angel con la url <Url>
    When busco el proudcto en el buscador
    Then podre ver el producto en pantalla

    Examples: 
      | Escenario                                          | Url                     |
      | Buscar palabra en el buscador de San Angel exitoso |  https://sanangel.com.co/ |
     
       