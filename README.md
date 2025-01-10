Ejercicio para prueba técnica hiberus
----------------------------------------

EL proyecto consta de un endpoint destinado a obtener el precio de un producto para una fecha y una cadena de grupo.
El endpoint que invocaremos es el siguiente: http://localhost:8080/inditex/api/1.0/prices/findProductPrice

Un ejemplo de llamada sería este JSON:
{
  "brandId": 1,
  "productId": 35455,
  "date": "2020-08-01T14:55:53"
}

y un ejemplo de salida sería este:
{
  "brandId": 1,
  "productId": 35455,
  "priceList": 4,
  "price": 38.95,
  "startDate": "2020-06-15T16:00:00",
  "endDate": "2020-12-31T23:59:59",
  "currency": "EUR"
}

Disponemos tanto de un test unitario parametrizado para cumplir los siguientes casos:
-          Test 1: petición a las 10:00 del día 14 del producto 35455   para la brand 1 (ZARA)
-          Test 2: petición a las 16:00 del día 14 del producto 35455   para la brand 1 (ZARA)
-          Test 3: petición a las 21:00 del día 14 del producto 35455   para la brand 1 (ZARA)
-          Test 4: petición a las 10:00 del día 15 del producto 35455   para la brand 1 (ZARA)
-          Test 5: petición a las 21:00 del día 16 del producto 35455   para la brand 1 (ZARA)

Además disponemos de un test de integración para validar una llamada al endpoint.

La información irá en una base de datos en memoria H2, con el usuario 'sa' y el password 'password', a la cual accedemos con el siguiente enlace:
http://localhost:8080/inditex/h2-console

Por último, el proyecto esta documentado para publicarse en Swagger, podemos acceder a al información documentada de los servicios en el siguiente enlace:
http://localhost:8080/inditex/swagger-ui.html
