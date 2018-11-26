USE empresa;

-- De este modo introducimos información a la base de datos.

-- Podemos poner los nombres de las columnas en las que queremos insertar
INSERT INTO Asesor (DNI, Titulo)
VALUES ('53975529A', 'Máquina'), ('36105949C', 'Crack');

-- Podemos no especificar columnas, por lo tanto insertaremos en todas en orden. Si tenemos un campo autonumérico o donde no deseamos introducir nada,
-- le pasamos el valor null.

INSERT INTO PAIS VALUES --COLUMNAS: Nombre, PIB, Habitantes, Capital.
('España', 8648293, null, 'Madrid'); --En esta linea elijo no insertar el numero de habitantes.