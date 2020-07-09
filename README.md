# estudos-codenation

## Quarto Módulo
- Spring Boot
	- [Projeto Biblioteca](./Biblioteca)

- Modelagem SQL
```sql
create table usuario
(
	id BIGINT PRIMARY KEY,
	login VARCHAR(45) NOT NULL,
	cpf VARCHAR(14) UNIQUE NOT NULL,
	nome VARCHAR(120) NOT NULL
);

CREATE TABLE professor
(
	id BIGINT PRIMARY KEY,
	idUsuario BIGINT NOT NULL,
	FOREIGN KEY (IdUsuario) REFERENCES usuario(id)
);

CREATE TABLE disciplina
(
	id BIGINT PRIMARY KEY,
	nome VARCHAR(120) NOT NULL
);

ALTER TABLE disciplina
ADD COLUMN descricao VARCHAR(60);

ALTER TABLE disciplina
ADD COLUMN idProfessor BIGINT REFERENCES professor(id);



CREATE TABLE aluno
(
	id BIGINT PRIMARY KEY,
	idUsuario BIGINT REFERENCES usuario(id)
);

CREATE TABLE disciplina_aluno
(
	idAluno BIGINT REFERENCES aluno(id),
	idDisciplina BIGINT REFERENCES disciplina(id),
	PRIMARY KEY (idAluno, idDisciplina)
);
```
