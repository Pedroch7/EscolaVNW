use escola; 

create table colaborador (

id bigint auto_increment, 
nome varchar (100) not null,
email varchar (100) not null,
cpf varchar (50) not null, 
cargo int not null, 
primary key (id)

); 