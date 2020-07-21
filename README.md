# estudos-codenation

## Quarto Módulo
- Spring Boot
	- [Projeto Biblioteca](./biblioteca)

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

## Quinto Módulo
- SQL
```sql
-- adiciona sequence
CREATE SEQUENCE professor_id_seq;
CREATE SEQUENCE aluno_id_seq;
CREATE SEQUENCE disciplina_id_seq;

ALTER TABLE professor
ALTER id set default nextval('professor_id_seq');

ALTER TABLE aluno
ALTER id set default nextval('aluno_id_seq');

ALTER TABLE disciplina
ALTER id set default nextval('disciplina_id_seq');

-- adiciona professores
INSERT INTO professor 
	(cpf, login, nome)
VALUES
	('123.456.789-00', 'loginprof1', 'Professor Banco de Dados')

INSERT INTO professor 
	(cpf, login, nome)
VALUES
	('222.222.222-22', 'loginprof2', 'Professor Lógica');

-- adiciona colunas em aluno
ALTER TABLE aluno
ADD column cpf varchar(14) unique;

ALTER TABLE aluno
ADD column login varchar(100);

ALTER TABLE aluno
ADD column nome varchar(255);

ALTER TABLE aluno
ADD column numeromatricula integer;

-- adiciona aluno
INSERT INTO aluno
	(cpf, login, nome)
VALUES
	('111.111.111-11', 'LOGINALUNO1', 'Adriano');

-- atualiza aluno
UPDATE aluno
SET numeromatricula = 222
WHERE id = 2;

UPDATE aluno
SET numeromatricula = 111
WHERE id = 1;

-- adiciona discipĺina
INSERT INTO disciplina
	(descricao, nome, idprofessor)
VALUES
	('Disciplina de Matemática Intro', 'Matemática', 2);

INSERT INTO disciplina
	(descricao, nome, idprofessor)
VALUES
	('Disciplina de Literatura', 'Literatura', 3);

-- adiciona discipĺina_aluno
INSERT INTO disciplina_aluno
VALUES
(1, 3),
(1, 4),
(2, 3);

-- Inner Join
SELECT a.id, a.nome, d.nome 
FROM aluno a  
INNER JOIN disciplina_aluno da
ON a.id = da.idaluno
INNER JOIN disciplina d
ON d.id = da.iddisciplina;

SELECT iddisciplina, COUNT(iddisciplina)
FROM disciplina_aluno  
GROUP BY iddisciplina;

SELECT id, nome, COUNT(iddisciplina)
FROM disciplina_aluno da
INNER JOIN  disciplina d
ON d.id = da.iddisciplina
GROUP BY nome, id
ORDER BY id DESC;
```
## Sexto Módulo

### Tópicos desse  módulo
- Cração de API		
	- GET, POST, PUT, DELETE
	- Status code (20x, 40x, 50x)
	- Paginação
	- Bean Validation

### Links

- [All You Need To Know About Bean Validation With Spring Boot](https://reflectoring.io/bean-validation-with-spring-boot/)
- [Validation in Spring Boot](https://www.baeldung.com/spring-boot-bean-validation)
- [Using @ResponseStatus to Set HTTP Status Code](https://www.baeldung.com/spring-response-status)
- [Error Handling for REST with Spring](https://www.baeldung.com/exception-handling-for-rest-with-spring)
- [HTTP response status codes](https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Status)
- [REST: Princípios e boas práticas](http://blog.caelum.com.br/rest-principios-e-boas-praticas/)

