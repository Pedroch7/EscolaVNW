use escola; 

create table endereco ( 
id bigint auto_increment, 
cep varchar (100) not null, 
rua varchar (100) not null, 
bairro varchar (100) not null, 
cidade varchar (100) not null, 
colaborador_id bigint, 
primary key (id), 
foreign key (colaborador_id) references colaborador (id) 

); 
