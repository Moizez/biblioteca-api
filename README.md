# Estilos Arquiteturais: Repositório

Aplicação simples de uma api que compartilha dados de livros como nome, autor e ano.

## Tecnologias Utilizadas
- Java
- Spring Boot
- SQL

## Caracteristicas
Um pequeno sistema de compartilhar dados que podem ser mantidos por um banco de dados central e acessados por outros subsistemas.
utilizando uma abstração de repositorio centralizado.

## Como Executar
Após importar a aplicação Maven:
1. Dentro da pasta "resource", edite o arquivo "application.properties" nos campos:
- spring.datasource.username= "seu nome de usuario do banco de dados"
- spring.datasource.password= "sua senha do banco caso tenha"

2. Com a aplicação já rodando vá no browser e cole os links para testar:
- Retornar a lista dos livros do banco: http://localhost:8080/livro/
- Retornar uma busca especifica por nome: http://localhost:8080/livro/nome?nome= "nome do livreo cadastrado"

Ex de busca: http://localhost:8080/livro/nome?nome=Senhor dos Anéis
