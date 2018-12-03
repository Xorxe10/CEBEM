-- 1
SELECT idFabricante, idProducto, descripcion, precioCompra AS PrecioSinIVA, precioCompra*1.21 AS PrecioConIVA FROM productos;

-- 2
SELECT codPedido, fabricante, producto, cantidad, precioVenta, precioventa * cantidad AS importe FROM lineaspedido;

-- 3
SELECT nombre, fecContrato, datediff(curdate(), fecContrato), YEAR(curdate()) - YEAR(fecNacimiento) FROM empleados;

-- 4
SELECT * FROM clientes ORDER BY codRepCliente ASC;