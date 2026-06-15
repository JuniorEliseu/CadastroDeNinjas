# 🥷 CadastroDeNinjas

<p align="center">
  Sistema de cadastro e gerenciamento de missões para ninjas utilizando Java + Spring Boot.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk">
  <img src="https://img.shields.io/badge/Spring_Boot-3.x-green?style=for-the-badge&logo=springboot">
  <img src="https://img.shields.io/badge/Status-Em_Desenvolvimento-blue?style=for-the-badge">
  <img src="https://img.shields.io/badge/First_Project-Java-purple?style=for-the-badge">
</p>

---

#  Sobre o Projeto

O **CadastroDeNinjas** é um projeto backend criado para praticar desenvolvimento Java com Spring Boot.

A ideia do sistema é permitir o cadastro de ninjas e o gerenciamento de missões com diferentes níveis de dificuldade, explorando conceitos fundamentais do ecossistema Java.

Este projeto está sendo desenvolvido como laboratório de aprendizado prático para:

- Programação Orientada a Objetos (POO)
- Arquitetura backend
- APIs REST
- Spring Boot
- Banco de dados
- Lógica de programação

---

#  Objetivos do Projeto

##  Aprender Java na prática

- Sintaxe da linguagem
- Classes e objetos
- Herança
- Encapsulamento
- Polimorfismo
- Collections
- Tratamento de exceções

---

##  Explorar o ecossistema Spring

- Spring Boot
- Spring Data JPA
- Controllers
- Services
- Repositories
- Injeção de dependência
- Arquitetura MVC

---

##  Conhecer Banco de Dados

- Persistência de dados
- Relacionamentos
- Modelagem de entidades
- JPA / Hibernate

---

## Evoluir lógica de programação

- Organização de código
- Estruturação de regras de negócio
- Resolução de problemas

---

#  Funcionalidades

## Ninja

- [x] Cadastro de ninjas
- [x] Listagem de ninjas
- [ ] Atualização de ninja
- [x] Exclusão de ninja

---
##  Missões

- [x] Cadastro de missões
- [x] Definição de dificuldade
- [ ] Atualização de missão
- [ ] Remoção de missão

---

##  Sistema de Relacionamento

- [ ] Associar missões aos ninjas
- [ ] Histórico de missões
- [ ] Sistema de ranking
- [ ] Sistema de experiência

---

# Tecnologias Utilizadas

| Tecnologia | Descrição |
|---|---|
| Java | Linguagem principal |
| Spring Boot | Framework backend |
| Spring Data JPA | Persistência de dados |
| Hibernate | ORM |
| Maven | Gerenciador de dependências |
| H2 | Banco de dados |

---

# Estrutura do Projeto

```bash
src
 ┣ main
 ┃ ┣ java
 ┃ ┃ ┗ dev.jotta.cadastrodeninjas
 ┃ ┃    ┣ missoes
 ┃ ┃    ┃ ┣ MissoesController
 ┃ ┃    ┃ ┣ MissoesModel
 ┃ ┃    ┃ ┣ MissoesRepository 
 ┃ ┃    ┃ ┗ MissoesService
 ┃ ┃    ┣ ninjas
 ┃ ┃    ┃ ┣ ninjaController
 ┃ ┃    ┃ ┣ ninjaModel
 ┃ ┃    ┃ ┣ ninjaRepository 
 ┃ ┃    ┃ ┗ ninjaService
 ┃ ┃    ┗CadastrodeNinjas.Application
 ┃ ┗ resources
 ┃   ┣ application.properties
 ┃   ┗ data.sql
 ┗ test
```

---

#  Como Executar o Projeto

## Pré-requisitos

- Java 17+
- Maven
- IntelliJ IDEA ou VSCode

---

##  Clone o repositório

```bash
git clone https://github.com/JuniorEliseu/CadastroDeNinjas
```

---

##Acesse a pasta do projeto

```bash
cd CadastroDeNinjas
```

---

## ️ Execute a aplicação

```bash
./mvnw spring-boot:run
```

ou

```bash
mvn spring-boot:run
```

---

#  Endpoints da API

##  Ninja

| Método | Endpoint | Descrição |
|---|---|---|
| GET | `/ninjas` | Lista todos os ninjas |
| POST | `/ninjas` | Cria um ninja |

---

##  Missões

| Método | Endpoint | Descrição |
|---|---|---|
| GET | `/missoes` | Lista todas as missões |
| POST | `/missoes` | Cria uma missão |

---

#  Exemplo JSON

## 🥷 Criar Ninja

```json
{
  "nome": "Subzero",
  "idade": "33",
  "email": "geladoo@gmail.com"
}
```

---

##  Criar Missão

```json
{
  "titulo": "Escoltar mercador",
  "Rank": "B"
}
```

---


---

#  Aprendizados

Este projeto foi criado para consolidar conhecimentos em:

- Desenvolvimento backend
- Java moderno
- APIs REST
- Arquitetura de camadas (monolitica)
- Persistência de dados
- Estruturação de aplicações Spring

---

# Contribuição

Projeto desenvolvido com foco em aprendizado e evolução prática.

Sugestões e melhorias são sempre bem-vindas.

---

# Autor

Desenvolvido por **Jota**.

---

<p align="center">
  Feito para aprender Java e Spring Boot na prática ☕
</p>