# Delivery Tech API

Sistema de delivery desenvolvido com **Spring Boot 3.5.6** e **Java 21**, como parte do curso **Arquitetura de Sistemas - FAT: Escola Técnica**.

---

## 🚀 Tecnologias Utilizadas

- Java 21 LTS
- Spring Boot 3.5.6
- Spring Web
- Spring Data JPA
- H2 Database
- Maven
- Spring Boot DevTools

---

## ⚡ Recursos Modernos do Java

- Records (Java 14+)
- Text Blocks (Java 15+)
- Pattern Matching com `instanceof` (Java 17+)
- Virtual Threads (Java 21)

---

## 📚 Contexto do Projeto

A DeliveryTech está em expansão e precisa de um sistema funcional para demonstrar aos investidores. Este projeto implementa a persistência de dados, regras de negócio e exposição via REST APIs para clientes, restaurantes, produtos e pedidos.

---

## 🏃‍♂️ Como Executar

1. Pré-requisitos: JDK 21 instalado
2. Clone o repositório:
   **bash**
   git clone https://github.com/EvertonTrindadeRibeiro/delivery-api-evertont.ribeiro.git
   cd delivery-api-evertont.ribeiro
   ./mvnw spring-boot:run

3. Acesse:
http://localhost:8080/health
http://localhost:8080/info
http://localhost:8080/h2-console

## 📋 Endpoints
### 👥 ClienteController
POST /clientes – Cadastrar cliente
GET /clientes – Listar todos os clientes
GET /clientes/{id} – Buscar cliente por ID
PUT /clientes/{id} – Atualizar cliente
DELETE /clientes/{id} – Inativar cliente

### 🍽️ RestauranteController
POST /restaurantes – Cadastrar restaurante
GET /restaurantes – Listar todos
GET /restaurantes/categoria/{categoria} – Buscar por categoria
PUT /restaurantes/{id} – Atualizar restaurante
DELETE /restaurantes/{id} – Inativar restaurante

### 🛒 ProdutoController
POST /restaurantes/{id}/produtos – Cadastrar produto
GET /restaurantes/{id}/produtos – Listar produtos por restaurante
GET /produtos/categoria/{categoria} – Buscar por categoria
PUT /produtos/{id} – Atualizar produto
DELETE /produtos/{id} – Inativar produto

### 📦 PedidoController
POST /pedidos – Criar pedido
GET /pedidos/cliente/{id} – Buscar pedidos por cliente
PUT /pedidos/{id}/status – Atualizar status do pedido

### 🧪 Testes e Validação
- Testes realizados via Postman (collection incluída em /postman)
- Dados de exemplo disponíveis no H2 Console
- Validações aplicadas: e-mail único, cálculo de valores, status de pedidos
- Hot reload testado com DevTools

## 🔧 Configuração
- Arquivo application.properties:
server.port=8080
spring.datasource.url=jdbc:h2:mem:deliverydb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.devtools.restart.enabled=true
spring.jpa.open-in-view=false
logging.level.org.springframework.web=DEBUG

## 👨‍💻 Desenvolvedor
Everton Ribeiro — Turma TI56 02726 
Desenvolvido com JDK 21 e Spring Boot 3.5.6