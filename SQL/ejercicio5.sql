USE empresasabc;
-- 1
SELECT idFabricante, idProducto, descripcion, precioCompra AS PrecioSinIVA, precioCompra*1.21 AS PrecioConIVA FROM productos;

-- 2
SELECT codPedido, fabricante, producto, cantidad, precioVenta, precioventa * cantidad AS importe FROM lineaspedido;

-- 3
SELECT nombre, fecContrato, datediff(curdate(), fecContrato), YEAR(curdate()) - YEAR(fecNacimiento) FROM empleados;

-- 4
SELECT * FROM clientes ORDER BY codRepCliente ASC;

-- 5 
SELECT * FROM oficinas ORDER BY region, nombre, codOficina;

-- 6 
SELECT * FROM pedidos ORDER BY fechaPedido;

-- 7
SELECT * FROM lineaspedido ORDER BY (cantidad*precioVenta) DESC LIMIT 8;

-- 8
SELECT * FROM lineaspedido ORDER BY precioVenta ASC LIMIT 5;

-- 9 
SELECT * FROM pedidos WHERE MONTH(fechaPedido) = 3;

-- 10
SELECT codEmpleado FROM empleados WHERE oficina IS NOT NULL;

-- 11
SELECT codEmpleado FROM empleados WHERE oficina IS NULL;

-- 12
SELECT * FROM oficinas WHERE region='Galicia' OR region ='Euzkadi' ORDER BY region DESC;

-- 13
SELECT * FROM clientes WHERE nombre LIKE '%Julia %';

-- 14
SELECT * FROM productos WHERE idProducto LIKE '%x';

-- 15
SELECT * FROM empleados WHERE YEAR(curdate()) - YEAR(fecNacimiento) >= 40 AND YEAR(curdate()) - YEAR(fecNacimiento) <= 60;

-- 16
SELECT * FROM clientes WHERE CodRepCliente='102' OR CodRepCliente='104' OR CodRepCliente = '109';

-- 17
SELECT * FROM productos ORDER BY idFabricante ASC, precioCompra DESC;

-- 18
SELECT * FROM empleados WHERE YEAR(curdate()) - YEAR(fecContrato) > 25;

-- 19
SELECT * FROM oficinas WHERE objetivo IS NULL;

-- 20


-- 21
SELECT nombre, sueldo, comision, sueldo+comision AS 'sueldo bruto', retencionesIRPF, retencionesSS, (sueldo+comision) - ((sueldo+comision) * retencionesIRPF) - ((sueldo+comision) * retencionesSS) AS 'sueldo neto' FROM empleados;







