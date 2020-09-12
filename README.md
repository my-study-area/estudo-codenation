# estudos-codenation

<p>
    <img alt="GitHub top language" src="https://img.shields.io/github/languages/top/my-study-area/estudo-codenation">
    <a href="https://github.com/my-study-area">
        <img alt="Made by" src="https://img.shields.io/badge/made%20by-adriano%20avelino-gree">
    </a>
    <img alt="Repository size" src="https://img.shields.io/github/repo-size/my-study-area/estudo-codenation">
    <a href="https://github.com/EliasGcf/readme-template/commits/master">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/my-study-area/estudo-codenation">
    </a>
</p>

## Primeiro Módulo - Introdução a Linguagem Java

### Tópicos desse  módulo
- Pacotes e classes
- Operadores Aritméticos
- Veriáveis e métodos
	- Tipos Primitivos
	- Objetos
	- Construtores
	- Modificadores de Acesso
- Arrays e ArrayLists
- Controles de Fluxos
	- Estruturas Condicionais e de Repetição
	- Operadores Lógicos

### Links
- [Java - Tipos primitivos](http://www.universidadejava.com.br/materiais/java-tipos-primitivos/)
- [Explicando os tipos de métodos existentes na programação OO](https://www.devmedia.com.br/metodos/7348)
- [Controle de Fluxo - Parte I](https://www.devmedia.com.br/controle-de-fluxo-parte-l/5527)
- [Controle de Fluxo Parte II](https://www.devmedia.com.br/controle-de-fluxo-parte-ll/5722)
- [Operadores lógicos e matemáticos da linguagem Java](https://www.devmedia.com.br/operadores-logicos-e-matematicos-da-linguagem-java/25248)
- [Arraylist Java: Explorando a classe ArrayList no Java](https://www.devmedia.com.br/explorando-a-classe-arraylist-no-java/24298)
- [Gradle | Installation](https://gradle.org/install/)
- [Trabalhando com string: String em Java](https://www.devmedia.com.br/trabalhando-com-string-string-em-java/21737)
- [Tipos de dados por valor e por referência em Java](https://www.devmedia.com.br/tipos-de-dados-por-valor-e-por-referencia-em-java/25293)

### Desafios
- Fibonacci
- Criptografia de Júlio César
- Calculadora de Salário Líquido

## Segundo Módulo - Programação a Objetos I

### Tópicos desse  módulo
- Classes
- Objetos
- Encapsulamento
- Exceções
- Herança

### Links
- [FP vs. OO](https://blog.cleancoder.com/uncle-bob/2018/04/13/FPvsOO.html)
- [Programação Orientada a Objetos com Java](https://www.devmedia.com.br/programacao-orientada-a-objetos-com-java/18449)
- [Encapsulamento, Polimorfismo, Herança em Java](https://www.devmedia.com.br/encapsulamento-polimorfismo-heranca-em-java/12991)
- [Java Exceptions](https://www.devmedia.com.br/trabalhando-com-excecoes-em-java/27601)
- [Entendendo e Aplicando Herança em Java](https://www.devmedia.com.br/entendendo-e-aplicando-heranca-em-java/24544)


### Desafios
- [Gerenciador de Times de Futebol](https://github.com/my-study-area/desafio-aceleradev-java-gerenciador-times-futebol)
- [Controle de estacionamento](https://github.com/my-study-area/desafio-aceleradev-java-controle-estacionamento)
- [Media, Moda e Mediana](https://github.com/my-study-area/desafio-aceleradev-java-media-moda-mediana)

## Terceiro Módulo - Programação a Objetos II

### Tópicos desse  módulo
- Interfaces
- Classes Abstratas
- java Reflection
- Annotations

### Links
- [Entendendo interfaces em Java](https://www.devmedia.com.br/entendendo-interfaces-em-java/25502)
- [Java Interface: Aprenda a usar corretamente](https://www.devmedia.com.br/java-interface-aprenda-a-usar-corretamente/28798)
- [Polimorfismo, Classes abstratas e Interfaces: Fundamentos da POO em Java](https://www.devmedia.com.br/polimorfismo-classes-abstratas-e-interfaces-fundamentos-da-poo-em-java/26387)
- [Conceitos – Classes Abstratas: Programação Orientada a Objetos](https://www.devmedia.com.br/conceitos-classes-abstratas-programacao-orientada-a-objetos/18812)
- [Conhecendo Java Reflection](https://www.devmedia.com.br/conhecendo-java-reflection/29148)
- [Entendendo Anotações em Java](https://www.devmedia.com.br/entendendo-anotacoes-em-java/26772)
- [Java Reflection – Parte I](https://www.devmedia.com.br/java-reflection-parte-i/4888)

## Quarto Módulo - Modelagem de Banco de Dados Relacional

### Tópicos desse  módulo
- Criação de banco de dados
- Modelagem de banco de dados
- JPA e Hibernate

### Links
- [pgAdmin - PostgreSQL Tools for Windows, Mac, Linux and the Web](https://www.pgadmin.org/download/)
- [Como Instalar e Utilizar o PostgreSQL no Ubuntu 16.04](https://www.digitalocean.com/community/tutorials/como-instalar-e-utilizar-o-postgresql-no-ubuntu-16-04-pt)
- [Instalando Postgresql](https://www.devmedia.com.br/instalando-postgresql/23364)
- [Learn PostgreSQL from Scratch](https://www.postgresqltutorial.com/)
- [Guia Completo de Hibernate: Aprenda Hibernate do Básico ao Avançado](https://www.devmedia.com.br/guia/hibernate/38312)
- [Spring Boot](https://www.codenation.dev/private-journey/java-online-4/challenge/spring-boot)

### Outros:
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

## Quinto Módulo - Manipulaçao de Banco de Dados Relacional

### Tópicos desse  módulo
- SQL (INSERT, SELECT, UPDATE, DELETE)
- Maninpulação de Dados com Hibernate
- Manipulação de Dados Spring Boot/Data

### Links
- [Spring Data Annotations](https://www.baeldung.com/spring-data-annotations)
- [Spring Data JPA - Reference Documentation](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#reference)
- [Database auditing JPA](https://www.baeldung.com/database-auditing-jpa)
- [Spring data JPA Query](https://www.baeldung.com/spring-data-jpa-query)
- [Introduction to Query Methods](https://www.petrikainulainen.net/programming/spring-framework/spring-data-jpa-tutorial-introduction-to-query-methods/)
- [Spring Data Annotations](https://www.baeldung.com/spring-data-annotations)
- [Database auditing JPA](https://www.baeldung.com/database-auditing-jpa)
- [Spring data JPA Query](https://www.baeldung.com/spring-data-jpa-query)

### Outros:
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
## Sexto Módulo - Cração de API REST

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

## Sétimo Módulo - Documetação de API REST
Documentação e Segurança de API REST

### Tópicos desse  módulo
- Swagger com SpringFox
- Spring Security com Oauth2

### Links
- [Spring Security e o protocolo OAuth2 na sua API RESTful](https://www.youtube.com/watch?v=UsM2BY20Ux4)
- [Uma introdução ao OAuth 2](https://www.digitalocean.com/community/tutorials/uma-introducao-ao-oauth-2-pt)
- [Autenticação com Spring e OAuth2](https://academiadev.gitbook.io/joinville/seguranca/oauth2)
- [Modelando APIs REST com Swagger](https://blog.caelum.com.br/modelando-apis-rest-com-swagger/)
- [Swagger Documentation](https://swagger.io/docs/)
- [SpringFox](https://springfox.github.io/springfox/)
- [O que é Spring Security?](https://blog.algaworks.com/spring-security/)

## Oitavo Módulo - Git, boas práticas e Clean Code

### Tópicos desse  módulo
- Clean code
- S.O.L.I.D.
- TDD - Test Driven Development

### Links
- [Princípios do Código Sólido na orientação a objetos](https://blog.caelum.com.br/principios-do-codigo-solido-na-orientacao-a-objetos/)
- [Princípios S.O.L.I.D: o que são e porque projetos devem utilizá-los](https://medium.com/@mari_azevedo/princ%C3%ADpios-s-o-l-i-d-o-que-s%C3%A3o-e-porque-projetos-devem-utiliz%C3%A1-los-bf496b82b299)
- [Clean Code: aprenda a manter o seu código limpo!](https://becode.com.br/clean-code/)
- [Boas práticas técnica para um código limpo (Clean Code)](https://pt.slideshare.net/rodrigokono/boas-prticas-tcnica-para-um-cdigo-limpo-clean-code)
- [Object Calisthenics](https://williamdurand.fr/2013/06/03/object-calisthenics/)
- [Test Driven Development: TDD Simples e Prático](https://www.devmedia.com.br/test-driven-development-tdd-simples-e-pratico/18533)
- [Garantia da qualidade de software com TDD (Test Driven Development)](https://knowledge21.com.br/blog/qualidade-de-software-com-tdd-test-driven-development/)
- [Introdução ao desenvolvimento guiado por teste (TDD) com JUnit](https://www.devmedia.com.br/introducao-ao-desenvolvimento-guiado-por-teste-tdd-com-junit/26559)

## Novo Módulo - Deply de Aplicações

### Tópicos desse  módulo
- Build de aplicações Java
- Deploy de aplicações
- Introdução ao Devops e conceitos de CI/CD

### Links
- [O que é DevOps?](https://www.redhat.com/pt-br/topics/devops)
- [O que é CI/CD?](https://www.redhat.com/pt-br/topics/devops/what-is-ci-cd)
- [Heroku Cloud Application Platform](https://www.heroku.com/)
- [Welcome to Apache Maven](https://maven.apache.org/)
- [Processo de build com o Maven](http://blog.caelum.com.br/processo-de-build-com-o-maven/)
