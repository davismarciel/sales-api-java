# Sales API com Spring Boot e Spring Security

Este projeto consiste em uma API RESTful completa para gerenciamento de um sistema de vendas, desenvolvida com Java e o ecossistema Spring. A aplicação foi projetada para ser robusta, segura e escalável, seguindo as melhores práticas de desenvolvimento de software.

O sistema permite o cadastro de usuários, produtos, categorias e o registro de pedidos, implementando um modelo de domínio coeso e relacional. Além disso, conta com um sistema de autenticação e autorização baseado em tokens JWT (JSON Web Tokens) para garantir a segurança dos endpoints.

## ✨ Features

- **Autenticação e Autorização:**
  - Sistema de login com geração de token JWT para acesso seguro à API.
  - Controle de acesso baseado em papéis (roles): `ADMIN` e `USER`.
  - Senhas dos usuários armazenadas de forma segura utilizando criptografia BCrypt.
- **Endpoints CRUD:**
  - Operações completas de Criar, Ler, Atualizar e Excluir para as principais entidades da aplicação: Usuários, Pedidos e Produtos.
- **Modelo de Dados Relacional:**
  - Mapeamento de entidades complexas com relacionamentos `One-to-One`, `One-to-Many` e `Many-to-Many`.
- **Tratamento de Exceções:**
  - Handlers de exceção personalizados para fornecer respostas de erro claras e padronizadas.
- **Configuração de Ambientes:**
  - Suporte a múltiplos ambientes (`test` e `prod`) com configurações de banco de dados distintas (H2 em memória para testes e PostgreSQL para produção).
- **Containerização:**
  - Aplicação e banco de dados totalmente containerizados com Docker e Docker Compose para facilitar o deploy e garantir a portabilidade.

## 🛠️ Tecnologias Utilizadas

O projeto foi construído utilizando as seguintes tecnologias e dependências:

- **Backend:**
  - **Java 17**
  - **Spring Boot 3.3.4**
  - **Spring Web:** Para a criação dos endpoints REST.
  - **Spring Data JPA:** Para a persistência de dados e abstração do acesso ao banco de dados.
  - **Spring Security:** Para a implementação da camada de segurança e autenticação.
- **Banco de Dados:**
  - **PostgreSQL:** Banco de dados relacional para o ambiente de produção.
  - **H2 Database:** Banco de dados em memória para o ambiente de testes e desenvolvimento.
- **Autenticação:**
  - **Java JWT (da Auth0):** Para a geração e validação de tokens JWT.
- **Build e Gerenciamento de Dependências:**
  - **Maven**
- **Containerização:**
  - **Docker** e **Docker Compose**

## 📊 Modelo de Dados (Entidades e Relacionamentos)

A API é estruturada em torno de um modelo de domínio que reflete um sistema de vendas. Abaixo estão as principais entidades e seus relacionamentos:

- **User e Order (Um-para-Muitos):** Um usuário pode ter vários pedidos, mas cada pedido pertence a um único usuário.
- **Product e Category (Muitos-para-Muitos):** Um produto pode pertencer a várias categorias, e uma categoria pode conter vários produtos. A relação é implementada com uma tabela de junção `tb_product_category`.
- **Order e OrderItem (Um-para-Muitos):** Um pedido é composto por vários itens de pedido (`OrderItem`).
- **Product e OrderItem (Um-para-Muitos):** Um produto pode estar presente em vários itens de pedido.
- **Order e Payment (Um-para-Um):** Um pedido pode ter um pagamento associado. O `Payment` compartilha o mesmo ID do `Order`, indicando uma forte dependência.

## 🔐 Segurança

A segurança da aplicação é implementada com Spring Security e utiliza um sistema de tokens JWT. O fluxo geral de segurança é o seguinte:

1.  **Autenticação:** O usuário envia suas credenciais (email e senha) para o endpoint `/auth/login`.
2.  **Geração de Token:** Se as credenciais forem válidas, a API gera um token JWT assinado com o algoritmo HMAC256.
3.  **Acesso a Recursos Protegidos:** Para acessar endpoints protegidos, o cliente deve incluir o token JWT no cabeçalho `Authorization` de cada requisição.
4.  **Validação do Token:** Um filtro de segurança (`SecurityFilter`) intercepta cada requisição, valida o token e, se for válido, define o contexto de segurança do Spring, permitindo o acesso ao recurso solicitado com base nas roles do usuário.

As senhas são criptografadas usando **BCrypt** antes de serem salvas no banco de dados.

## ⚙️ Configuração de Ambientes

O projeto utiliza **Spring Profiles** para gerenciar diferentes configurações para cada ambiente. Os perfis principais são `test` e `prod`.

### Perfil de Teste (`test`)

Este é o perfil padrão da aplicação, ativado através do arquivo `src/main/resources/application.properties`.

- **Ativação:** Automática ao rodar a aplicação localmente (ex: via `mvn spring-boot:run`).
- **Banco de Dados:** Utiliza o banco de dados em memória **H2**. A configuração pode ser encontrada em `src/main/resources/application-test.properties`.
- **H2 Console:** O console do H2 é habilitado para facilitar a visualização dos dados em tempo de desenvolvimento. Ele pode ser acessado em: `http://localhost:8080/h2-console`.
- **Povoamento de Dados:** Ao iniciar com este perfil, a classe `TestConfig.java` é executada para popular o banco de dados com dados de exemplo.

### Perfil de Produção (`prod`)

Este perfil é destinado ao ambiente de produção e é configurado para usar um banco de dados PostgreSQL.

- **Ativação:** Deve ser ativado explicitamente. No `docker-compose.yaml`, isso é feito com a variável de ambiente: `SPRING_PROFILES_ACTIVE=prod`.
- **Banco de Dados:** Utiliza **PostgreSQL**. As configurações de conexão estão em `src/main/resources/application-prod.properties` e dependem de variáveis de ambiente.
- **Variáveis de Ambiente:** Para executar o perfil de produção, é necessário configurar as seguintes variáveis de ambiente:
  - `POSTGRES_DB`: Nome do banco de dados.
  - `POSTGRES_USER`: Usuário do banco de dados.
  - `POSTGRES_PASSWORD`: Senha do banco de dados.
  - `JWT_SECRET_KEY`: Chave secreta para a assinatura dos tokens JWT.

## 🚀 Como Executar o Projeto

Existem duas maneiras principais de executar esta aplicação: utilizando Docker (recomendado para um ambiente de produção simulado) ou executando-a localmente com Maven.

### 1. Com Docker (Ambiente de Produção)

A forma mais simples de subir a aplicação e o banco de dados PostgreSQL é utilizando o Docker Compose.

**Pré-requisitos:**

- Docker
- Docker Compose

**Passos:**

1.  **Clone o repositório:**

    ```bash
    git clone https://github.com/davismarciel/sales-api-java.git
    cd sales-api-java
    ```

2.  **Crie e configure o arquivo de ambiente:**
    O projeto usa um arquivo `.env.example` como template. Copie-o para criar seu arquivo de configuração local:

    ```bash
    cp .env.example .env
    ```

    Agora, abra o arquivo `.env` e preencha as variáveis com suas credenciais:

    ```env
    SPRING_PROFILES_ACTIVE=prod
    JWT_SECRET_KEY=seu-segredo-super-secreto
    POSTGRES_DB=salesdb
    POSTGRES_USER=admin
    POSTGRES_PASSWORD=admin
    ```

3.  **Construa e suba os containers:**
    ```bash
    docker-compose up --build
    ```
    Este comando irá construir a imagem da aplicação (na primeira vez ou após mudanças no código), baixar a imagem do PostgreSQL e iniciar os dois contêineres. A API estará acessível em `http://localhost:8080`.

### 2. Localmente (Ambiente de Teste)

Para executar a aplicação localmente, você precisará ter o Java 17 e o Maven instalados. Este método ativará o perfil `test` por padrão.

**Pré-requisitos:**

- Java 17
- Apache Maven

**Passos:**

1.  **Clone o repositório:**

    ```bash
    git clone https://github.com/davismarciel/sales-api-java.git
    cd sales-api-java
    ```

2.  **Execute a aplicação com Maven:**
    ```bash
    mvn spring-boot:run
    ```
    A aplicação será iniciada com o perfil `test`, utilizando o banco de dados em memória H2. O console do H2 estará disponível em `http://localhost:8080/h2-console`.

## 🗺️ Endpoints da API

A seguir, uma visão geral dos principais endpoints disponíveis na API:

| Método HTTP | Endpoint         | Descrição                                    | Nível de Acesso |
| :---------- | :--------------- | :------------------------------------------- | :-------------- |
| `POST`      | `/auth/login`    | Autentica um usuário e retorna um token JWT. | Público         |
| `POST`      | `/auth/register` | Registra um novo usuário.                    | Público         |
| `GET`       | `/users`         | Retorna todos os usuários.                   | ADMIN           |
| `GET`       | `/users/{id}`    | Busca um usuário pelo ID.                    | ADMIN           |
| `POST`      | `/users`         | Cria um novo usuário.                        | ADMIN           |
| `PUT`       | `/users/{id}`    | Atualiza os dados de um usuário.             | ADMIN           |
| `DELETE`    | `/users/{id}`    | Exclui um usuário.                           | ADMIN           |
| `GET`       | `/products`      | Retorna todos os produtos.                   | Público         |
| `GET`       | `/products/{id}` | Busca um produto pelo ID.                    | Público         |
| `GET`       | `/categories`    | Retorna todas as categorias.                 | Authenticated   |
| `GET`       | `/orders`        | Retorna todos os pedidos.                    | ADMIN           |
| `GET`       | `/orders/{id}`   | Busca um pedido pelo ID.                     | ADMIN           |
