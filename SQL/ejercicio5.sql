/* 1 */
SELECT idFabricante, idProducto, descripcion, precioCompra AS PrecioSinIVA, precioCompra*1.21 AS PrecioConIVA FROM productos;
