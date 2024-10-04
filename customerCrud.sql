--creamos la base de datos y nos posionamos en ella
use mysql;
create database customercrud;
use customercrud;
--creamos la tabla customer
CREATE TABLE customer (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  lastname VARCHAR(100) NOT NULL,
  email VARCHAR(100) UNIQUE,
  phone CHAR(12) NOT NULL
);
--generando insert para la tabla 



INSERT INTO customer (name, lastname, email, phone)
VALUES 
('Luis', 'Ramirez', 'luis.ramirez@example.com', '987654325'),
('Paola', 'Fernandez', 'paola.fernandez@example.com', '987654326'),
('Jorge', 'Martinez', 'jorge.martinez@example.com', '987654327'),
('Lucia', 'Salazar', 'lucia.salazar@example.com', '987654328'),
('Fernando', 'Castro', 'fernando.castro@example.com', '987654329'),
('Claudia', 'Rojas', 'claudia.rojas@example.com', '987654330'),
('Mario', 'Ortiz', 'mario.ortiz@example.com', '987654331'),
('Sofia', 'Vega', 'sofia.vega@example.com', '987654332'),
('Oscar', 'Guzman', 'oscar.guzman@example.com', '987654333'),
('Angela', 'Mendoza', 'angela.mendoza@example.com', '987654334'),
('Diego', 'Lopez', 'diego.lopez@example.com', '987654335'),
('Daniela', 'Paredes', 'daniela.paredes@example.com', '987654336'),
('Raul', 'Diaz', 'raul.diaz@example.com', '987654337'),
('Valeria', 'Silva', 'valeria.silva@example.com', '987654338'),
('Pedro', 'Morales', 'pedro.morales@example.com', '987654339'),
('Gabriela', 'Herrera', 'gabriela.herrera@example.com', '987654340'),
('Rodrigo', 'Flores', 'rodrigo.flores@example.com', '987654341'),
('Camila', 'Alvarez', 'camila.alvarez@example.com', '987654342'),
('Miguel', 'Nuñez', 'miguel.nunez@example.com', '987654343'),
('Rosa', 'Bermudez', 'rosa.bermudez@example.com', '987654344'),
('Carlos', 'Suarez', 'carlos.suarez@example.com', '987654345'),
('Elena', 'Cabrera', 'elena.cabrera@example.com', '987654346'),
('Jose', 'Carrillo', 'jose.carrillo@example.com', '987654347'),
('Marina', 'Paz', 'marina.paz@example.com', '987654348'),
('Felipe', 'Castillo', 'felipe.castillo@example.com', '987654349'),
('Diana', 'Valverde', 'diana.valverde@example.com', '987654350'),
('Andres', 'Cornejo', 'andres.cornejo@example.com', '987654351'),
('Teresa', 'Ramon', 'teresa.ramon@example.com', '987654352'),
('Antonio', 'Huertas', 'antonio.huertas@example.com', '987654353'),
('Cristina', 'Peña', 'cristina.pena@example.com', '987654354'),
('Sebastian', 'Vargas', 'sebastian.vargas@example.com', '987654355'),
('Monica', 'Gomez', 'monica.gomez@example.com', '987654356'),
('Tomas', 'Cruz', 'tomas.cruz@example.com', '987654357'),
('Isabel', 'Navarro', 'isabel.navarro@example.com', '987654358'),
('Eduardo', 'Santana', 'eduardo.santana@example.com', '987654359'),
('Laura', 'Marquez', 'laura.marquez@example.com', '987654360'),
('Francisco', 'Reyes', 'francisco.reyes@example.com', '987654361'),
('Patricia', 'Campos', 'patricia.campos@example.com', '987654362'),
('Javier', 'Rivera', 'javier.rivera@example.com', '987654363'),
('Marta', 'Ponce', 'marta.ponce@example.com', '987654364'),
('Maria', 'lee', 'maria.lee@example.com', '987654322'),
('Carlos', 'Lopez', 'carlos.lopez@example.com', '987654323'),
('Ana', 'Torres', 'ana.torres@example.com', '987654324'),
('Juan', 'Perez', 'juan.perez@example.com', '987654321');