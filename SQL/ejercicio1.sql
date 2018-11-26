--CREA BBDD Y LA SELECCIONA CON USE
CREATE DATABASE empresa; 
USE empresa;

--CREA Y DA ATRIBUTOS A LAS TABLAS. INSERTA LAS FOREIGN KEY
CREATE TABLE IF NOT EXISTS Empresa(  
	Nombre VARCHAR(30) PRIMARY KEY,     
	FechaEntrada DATE,     
	Facturación INT,     
	NumVendedores INT)Engine = InnoDB;

CREATE TABLE IF NOT EXISTS Asesor(  
	DNI VARCHAR(9) PRIMARY KEY,     
	Titulo VARCHAR(50))Engine = InnoDB;

CREATE TABLE IF NOT EXISTS Vendedor(  
	DNI CHAR(9) PRIMARY KEY,     
	PorComision INT)Engine = InnoDB;

CREATE TABLE IF NOT EXISTS Pais(  
	Nombre VARCHAR(30) PRIMARY KEY,     
	PIB INT,     
	Habitantes INT,
	Capital VARCHAR(40))Engine = InnoDB;

CREATE TABLE IF NOT EXISTS Areaa(  
	Nombre VARCHAR(20) PRIMARY KEY,     
	Descripcion VARCHAR(100)) Engine = InnoDB;

CREATE TABLE IF NOT EXISTS CaptaVenVenEmp(  
	NomEmpresa VARCHAR(30),     
	DniVenCapta CHAR(9),     
	DniVenCaptado CHAR(9),     
	Fecha DATE NOT NULL,     
	PRIMARY KEY(NomEmpresa, DniVenCapta, DniVenCaptado),     
	FOREIGN KEY (DniVenCapta) REFERENCES Vendedor (DNI),     
	FOREIGN KEY (DniVenCaptado) REFERENCES Vendedor (DNI))Engine = InnoDB;
    
CREATE TABLE IF NOT EXISTS AsesoraAseAreEmp(  
	DniAsesor CHAR(9),     
	NomArea VARCHAR(20),     
	NomEmpresa VARCHAR(30),     
	Fecha DATE,     
	PRIMARY KEY(DniAsesor, NomArea, NomEmpresa),     
	FOREIGN KEY (DniAsesor) REFERENCES Asesor (DNI),     
	FOREIGN KEY (NomArea) REFERENCES Areaa (Nombre),     
	FOREIGN KEY (NomEmpresa) REFERENCES Empresa (Nombre)) Engine = InnoDB;

CREATE TABLE IF NOT EXISTS ActuaEmpPais(  
	NomEmpresa VARCHAR(30),     
	NomPais VARCHAR(30),     
	PRIMARY KEY(NomEmpresa, NomPais),     
	FOREIGN KEY (NomEmpresa) REFERENCES Empresa (Nombre),     
	FOREIGN KEY (NomPais) REFERENCES Pais (Nombre)) Engine = InnoDB;

CREATE TABLE IF NOT EXISTS TieneSedeEmpPais(
	NomEmpresa VARCHAR(30),     
	NomPais VARCHAR(30),     
	Ciudad VARCHAR(30),     
	PRIMARY KEY(NomEmpresa, NomPais),     
	FOREIGN KEY (NomEmpresa) REFERENCES Empresa (Nombre),     
	FOREIGN KEY (NomPais) REFERENCES Pais (Nombre))Engine = InnoDB;





