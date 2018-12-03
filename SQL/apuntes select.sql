USE empresasabc;

/*
SELECT ES LO ÚNICO OBLIGATORIO, EL RESTO (FROM, WHERE) NO.

SELECT * FROM Oficinas; muestra todos los registros de esa tabla.

SELECT nombre, region, ventas FROM Oficinas; elegir qué columnas de la tabla seleccionar.

SELECT ALL comision, fecContrato AS Fecha_Contrato FROM empleados; el modificador AS cambia el encabezado de la columna a la hora de
mostrarse por pantalla. se denomina alias. 

SELECT ALL nombre, sueldo, YEAR(FecContrato) Año FROM empleados; La función year saca solo el año de una fecha. La palabra Año de después
es otra manera de poner el alias.

SELECT idProducto, precioCompra PrecioSinIVA, precioCompra*1.21 PrecioConIVA FROM productos; /*Se pueden hacer operaciones en el select.

SELECT DISTINCT codPedido FROM LineasPedido; Selecciona los registros NO REPETIDOS.

La función curdate() da la fecha actual, se puede separar en day, month, year. Por ejemplo, una consulta para comprobar los registros del 
dia de hoy
SELECT * FROM pedidos WHERE DAY(fechaPedido)=DAY(curdate());

SELECT nombre, sueldo FROM empleados ORDER BY sueldo DESC; ASC/DESC, ORDER BY ordena.

LIMIT sirve para sacar solo X resultados. p ej 5 precios mas caros:
SELECT nombre, precio FROM producto ORDER BY precio DESC LIMIT 5;
