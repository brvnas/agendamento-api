# 📅 Agendamento API

## 💻 Sobre o Projeto
API RESTful desenvolvida em Java com Spring Boot para gerenciamento de agendamentos, clientes e serviços. Este projeto foi construído como parte do meu portfólio para demonstrar conhecimentos práticos em desenvolvimento backend, persistência e modelagem de dados relacionais e testes de integração. =D

## 🛠️ Tecnologias Utilizadas
* **Linguagem:** Java
* **Framework:** Spring Boot (Web, Data JPA)
* **Banco de Dados:** PostgreSQL
* **Gerenciador de Dependências:** Maven
* **Testes de API:** Postman

## ⚙️ Funcionalidades
* Cadastro, listagem, atualização e exclusão (CRUD) de Clientes.
* Gerenciamento de Serviços e Profissionais.
* Controle e registro de Agendamentos.

## 🚀 Como Executar Localmente
1. Clone este repositório:
   `git clone https://github.com/SEU-USUARIO/agendamento-api.git`
2. Configure as credenciais do seu PostgreSQL local no arquivo `src/main/resources/application.properties`.
3. Atualize as dependências do Maven.
4. Execute a classe principal `AgendamentoApiApplication.java`.
5. A API estará rodando na porta `http://localhost:8080`.

## 🛣️ Endpoints Principais
| Método | Rota | Descrição |
|---|---|---|
| `GET` | `/clientes` | Retorna a lista de clientes cadastrados |
| `POST` | `/clientes` | Cadastra um novo cliente no banco de dados |
| `GET` | `/agendamentos` | Lista todos os agendamentos |
| `POST` | `/agendamentos` | Registra um novo agendamento |

> *Nota: Os testes de integração e validação das rotas foram realizados utilizando o Postman.*