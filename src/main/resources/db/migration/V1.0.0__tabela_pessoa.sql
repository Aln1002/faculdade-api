CREATE TABLE PESSOA(
    CODIGO NUMBER(6) NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1),
    NOME VARCHAR (50),
    CPF VARCHAR (12),
    DATA_NASCIMENTO VARCHAR,
    CONSTRAINT PESSOA_PK PRIMARY KEY (CODIGO)
);