# <h1 align="center">User Department API com Spring Boot</h1>

### <h3 align="center">API que permite a criação de usuários com seu respectivo departamento. Projeto desenvolvido para o Desafio de Projeto do Bootcamp Santander na trilha Java + Angular Fullstack</h3>

</br>

<div align="center">

![image](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![image](https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot)
![image](https://img.shields.io/badge/Swagger-85EA2D?style=for-the-badge&logo=Swagger&logoColor=white)

</div>

</br>

## Features
- [x] Cadastro e remoção de usuários
- [x] Atualização do departamento de usuários.
- [x] Cadastro e remoção de departamentos

</br>

## Diagrama de Classes
```mermaid
classDiagram
  class User {
    id: Number
    name: String
    email: String
    department: Department
  }

  class Department {
    id: Number
    name: String
  }

  User "1" --> "1" Department: has
```
