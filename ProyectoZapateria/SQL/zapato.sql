drop database zapato;
drop table Cliente,Zapato;
select *from Zapato, Cliente;
/*sincronización MySQL con  Eclipse*/
create database zapato;
use zapato;



create table Usuario(
	Id int auto_increment,
	Nombre varchar(50) not null,
    Contraseña varchar(70),
    Correo varchar (50),
    Telefono varchar(50)
);

create table Zapato(
	Idzapato int primary key,
    Precio int,
    Marca nvarchar (50),
    Modelo nvarchar(50)
    
);



create table Compra(
	Idcompra int primary key,
    Idcliente int,
    Idzapato int
);

insert into Usuario (Nombre, Contraseña, Correo, Telefono)
	values ('Erik', 'fenix','al045321@uacam.mx', '9811599957');
           

insert into Zapato (Idzapato, Precio, Marca, Modelo)
	values (01, 399, 'Stylo','D142001-1' ),
		   (02, 789, 'Discovery Expedition','Sochi 1961'),
           (03, 999, 'Discovery Expedition','Forlandet 1911'),
           (04, 949, 'Discovery Expedition','Blackwood 1952'),
           (05, 1199,'Flexi','95001'),
           (06, 1199,'Flexi','95004'),
           (07, 1199,'Flexi','79802'),
           (08, 1149,'Flexi','50701'),
           (09, 879,'Flexi','68610'),
           
           (10, 1328,'Evolución','62830 Negro'),
           (11, 899,'Flexi','D190137-1'),
           (12, 865,'Flexi','92401'),
           (13, 499,'Stylo','D047024-2'),
           (14, 899,'Flexi','58301'),
           (15, 865,'Flexi','68607'),
           (16, 1335,'Evolución','20607-negro'),
           (17, 699,'Ferrato','1043099'),
           (18, 439,'Aranza','050'),
           (19, 865,'Flexi','68607'),
           (20, 1256,'Evolución','25706-testa'),
           (21, 469,'Stylo','D047011-4'),
           (22, 499,'Stylo','D047023-1'),
           (23, 1321,'Evolución','62830 Naranja'),
           (24, 865,'Flexi','92401'),
           (25, 699,'Flexi','987502'),
           (26, 899,'Flexi','92405'),
           (27, 596,'Mirage','4509'),
           
           (28, 1006,'Derby','61555'),
           (29, 1006,'Derby','61552'),
           (30, 696,'Palermo','7722'),
           (31, 1006,'Derby','61556'),
           (32, 879,'Derby','7735'),
           (33, 695,'Monaco','8510'),
           
           (34, 966,'Derby','20101'),
           (35, 1080,'Derby','20102'),
           
           (36, 90603,'Choclo','90603'),
           (37, 1045,'Moka','90603'),
           (38, 900,'Choclo','90402'),
           (39, 892,'Derby','801'),
           (40, 979,'Derby','811'),
           (41, 900,'Choclo','90402');
           



        call Usuario;