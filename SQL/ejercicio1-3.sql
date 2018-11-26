USE empresa;

-- Insertamos unos datos al azar
/*INSERT INTO persona VALUES
	('12345678A', 'Jose', 'Vigo', null),
    ('12345674V', 'Manuel', 'Vigo', null),
    ('12318948C', 'Ambrosio', 'Tui', null),
    ('12345678S', 'Ezequiel', 'Tui', null),
    ('12345678Q', 'Zacarias', 'Vigo', null),
    ('12345238U', 'Mongolito', 'Porriño', null); */
    
-- Consultas

/*SELECT * FROM persona;*/ -- Consulta que selecciona todo el contenido de la tabla

/*SELECT * FROM persona WHERE Direccion = 'Vigo';*/ -- Filtro WHERE

/*SET SQL_SAFE_UPDATES = 0;*/ -- Permite usar update sin problemas
/*UPDATE persona SET Direccion = 'Vigo City' WHERE Direccion = 'Vigo';*/ -- MODIFICAR DATOS EN MASA
/*SELECT * FROM persona WHERE Direccion = 'Vigo City';*/

