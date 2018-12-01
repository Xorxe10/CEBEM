CREATE DATABASE IF NOT EXISTS Bomberos;
USE Bomberos;

CREATE TABLE IF NOT EXISTS Bombero(
	codBombero INT PRIMARY KEY,
    nombre VARCHAR(20),
    apellidos VARCHAR(50),
    fecnacimiento DATE,
    direccion VARCHAR(50),
    dni VARCHAR(9),
    codParque INT,
    codEquipo INT,
    puesto VARCHAR(20))Engine = InnoDB;
    
CREATE TABLE IF NOT EXISTS Equipo(
	codEquipo INT PRIMARY KEY,
    nombre VARCHAR(30))Engine = InnoDB;

CREATE TABLE IF NOT EXISTS Turnos(
	codTurno INT PRIMARY KEY,
    descripcion VARCHAR(20))Engine = InnoDB;
    
CREATE TABLE IF NOT EXISTS ParqueBomberos(
	codParque INT PRIMARY KEY,
    categoria VARCHAR(20),
    direccion VARCHAR(50),
    nombre VARCHAR(30))Engine = InnoDB;

CREATE TABLE IF NOT EXISTS TurnosBomberos(
	codTurno INT,
    codBombero INT,
    fecInicio DATE,
    fecFinal DATE,
    FOREIGN KEY (codTurno) REFERENCES Turnos (codTurno),
    FOREIGN KEY (codBombero) REFERENCES Bombero (codBombero))Engine = InnoDB;
    
CREATE TABLE IF NOT EXISTS TelefonosBomberos(
	numTelefono INT PRIMARY KEY,
    codBombero INT,
    FOREIGN KEY (codBombero) REFERENCES Bombero (codBombero))Engine = InnoDB;
    
CREATE TABLE IF NOT EXISTS TelefonosParque(
telefono INT PRIMARY KEY,
codParque INT,
FOREIGN KEY (codParque) REFERENCES ParqueBomberos (codParque))Engine = InnoDB;
    
CREATE TABLE IF NOT EXISTS PeticionServicio(
	codPeticion INT PRIMARY KEY,
    tipoServicio VARCHAR(20),
    gradoUrgencia VARCHAR(10),
    codEquipo INT,
    FOREIGN KEY (codEquipo) REFERENCES Equipo (codEquipo))Engine = InnoDB;
    
CREATE TABLE IF NOT EXISTS PeticionParques(
	codParque INT,
    codPeticion INT,
    fecha DATE,
    hora DATETIME,
    PRIMARY KEY(codParque, codPeticion),
    FOREIGN KEY (codParque) REFERENCES ParqueBomberos (codParque),
    FOREIGN KEY (codPeticion) REFERENCES PeticionServicio (codPeticion))Engine = InnoDB;

ALTER TABLE Bombero
	ADD FOREIGN KEY (codParque) REFERENCES ParqueBomberos (codParque),
    ADD FOREIGN KEY (codEquipo) REFERENCES Equipo (codEquipo);
    
