CREATE DATABASE IF NOT EXISTS RepuestosHard;
USE RepuestosHard;

CREATE TABLE IF NOT EXISTS LineasPedido(
	CodPedido INT,
    NumLinea INT,
	Fabricante VARCHAR(5),
    Producto VARCHAR(20),
    Cantidad INT,
    Importe DOUBLE(8,2),
    PRIMARY KEY(CodPedido, NumLinea))Engine = InnoDB;
    
CREATE TABLE IF NOT EXISTS Productos(
	IdFabricante VARCHAR(5),
    IdProducto VARCHAR(20),
    Descripcion VARCHAR(20),
    Precio DOUBLE(6,2),
    Existencias INT,
    PRIMARY KEY(IdFabricante, IdProducto))Engine = InnoDB;
    
CREATE TABLE IF NOT EXISTS Pedidos(
	CodPedido INT PRIMARY KEY,
    FechaPedido DATE,
    CodCliente VARCHAR(5),
    CodRepresentante VARCHAR(5))Engine = InnoDB;
    
CREATE TABLE IF NOT EXISTS Clientes(
	CodCliente VARCHAR(5) PRIMARY KEY,
    Nombre VARCHAR(50),
    CodRepCliente CHAR(5),
    LimiteCredito DOUBLE(7,2))Engine = InnoDB;
    
CREATE TABLE IF NOT EXISTS Empleados(
	CodEmpleado VARCHAR(5) PRIMARY KEY,
    Nombre VARCHAR(30),
    FecNacimiento DATE,
    Oficina VARCHAR(3),
    Categoria VARCHAR(20),
    Contrato DATE,
    CodJefe CHAR(5),
    Cuota DOUBLE(10,2),
    Ventas DOUBLE(10,2))Engine = InnoDB;

CREATE TABLE IF NOT EXISTS Oficinas(
	CodOficina VARCHAR(3) PRIMARY KEY,
    Nombre VARCHAR(30),
    Region ENUM('Coruña', 'Lugo', 'Ourense', 'Pontevedra'),
    CodDirector VARCHAR(5),
	Objetivo DOUBLE(10,2),
    Ventas DOUBLE (10,2))Engine = InnoDB;
    
ALTER TABLE LineasPedido
	ADD FOREIGN KEY (CodPedido) REFERENCES Pedidos (CodPedido);
    
ALTER TABLE LineasPedido
	ADD FOREIGN KEY (Fabricante, Producto) REFERENCES Productos (IdFabricante, IdProducto);
    
ALTER TABLE Empleados
	ADD FOREIGN KEY (Oficina) REFERENCES Oficinas (CodOficina);
    
ALTER TABLE Oficinas
	ADD FOREIGN KEY (CodDirector) REFERENCES Empleados (CodEmpleado);

ALTER TABLE Pedidos
	ADD FOREIGN KEY (CodRepresentante) REFERENCES Empleados (CodEmpleado);
    
ALTER TABLE Empleados
	ADD FOREIGN KEY (CodJefe) REFERENCES Empleados (CodEmpleado);
    
ALTER TABLE Clientes 
	ADD FOREIGN KEY (CodRepCliente) REFERENCES Empleados (CodEmpleado);
    
    
    
    
    
    
    
    
    