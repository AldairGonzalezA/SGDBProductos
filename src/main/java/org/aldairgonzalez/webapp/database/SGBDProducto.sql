create database SGDBProductos;

use SGDBProductos;

create table Productos(
	productoId int not null auto_increment,
    nombreProducto varchar(40) not null,
    marcaProducto varchar(40),
    descripcionProducto text,
    precio decimal(10,2),
    primary key PK_productoId(productoId)
);

select *from Productos;

