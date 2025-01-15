create table usuarios(

    id bigint not null auto_increment,
    login VARCHAR(100) NOT NULL,
    senha VARCHAR(255) NOT NULL,

    primary key(id)
);