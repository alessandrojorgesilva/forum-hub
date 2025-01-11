create table topicos(

    id bigint not null auto_increment,
    titulo VARCHAR(100) NOT NULL,
    mensagem TEXT NOT NULL,
    dataCriacao DATETIME NOT NULL,
    status ENUM('SOLUCIONADO', 'NAO_RESPONDIDO') NOT NULL,
    autor VARCHAR(100) NOT NULL,
    curso VARCHAR(100) NOT NULL,

    primary key(id)
);