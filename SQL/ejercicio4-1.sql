USE bomberos;

INSERT INTO ParqueBomberos VALUES (1, 'categoria random', 'nigran', 'ninonino');
INSERT INTO ParqueBomberos VALUES (2, 'emergencias', 'madroa', 'nonainononai');
INSERT INTO ParqueBomberos VALUES (3, 'vaguetes', 'sevilla', 'olemiarma');

INSERT INTO Equipo VALUES (1, 'equipo a');
INSERT INTO Equipo VALUES (2, 'team rocket');
INSERT INTO Equipo VALUES (3, 'equipo xd');

INSERT INTO Bombero VALUES (1, 'Jose', 'Rodriguez', '1987-11-02', 'Calle paisano 4', '24865721A', 1, 2, 'JEFE');
INSERT INTO Bombero VALUES (2, 'Antonio', 'Alcantara', '1976-05-18', 'Calle del arcoiris 98', '87421536R', 1, 2, 'JEFE');
INSERT INTO Bombero VALUES (3, 'Agustín', 'Gonzalez', '1980-03-22', 'Calle brasil 15', '74265102Q', 1, 2, 'JEFE');

INSERT INTO Turnos VALUES (1, 'Ni dios');
INSERT INTO Turnos VALUES (2, 'Todos');
INSERT INTO Turnos VALUES (3, 'Tambien ni dios');

/*INSERT INTO TurnosBomberos VALUES (1, */

SELECT * FROM Bombero WHERE nombre='Jose';