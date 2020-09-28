create database empresa;
use empresa;

create table persona(
	idPersona int not null primary key auto_increment,
    nombre varchar(20),
    apellido1 varchar(20),
    apellido2 varchar(20),
    direccion varchar (100)
);

insert into persona(nombre, apellido1, apellido2, direccion) values ('juan', 'gregorio', 'calderon', 'campeche #1752');
insert into persona(nombre, apellido1, apellido2, direccion) values ('jose', 'gregorio', 'calderon', 'campeche #1752');
insert into persona(nombre, apellido1, apellido2, direccion) values ('pedro', 'gregorio', 'calderon', 'campeche #1752');