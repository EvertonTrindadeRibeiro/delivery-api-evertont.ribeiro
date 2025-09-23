# Delivery Tech API
Sistema de delivery desenvolvido com **Spring Boot 3.2.5** e **Java 21**, como parte do projeto do curso **Arquitetura de Sistemas - FAT: Escola Técnica**.

---

## 🚀 Tecnologias
- **Java 21 LTS** (versão mais recente)
- **Spring Boot 3.2.5**
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

---

## ⚡ Recursos Modernos do Java
- Records (Java 14+)
- Text Blocks (Java 15+)
- Pattern Matching com `instanceof` (Java 17+)
- Virtual Threads (Java 21)

## 🏃‍♂️ Como executar
1. **Pré-requisitos:** JDK 21 instalado e configurado (`JAVA_HOME`)
2. Clone o repositório  ```bash
    git clone https://github.com/seu-usuario/delivery-tech-api.git
    cd delivery-tech-api
3. Execute: './mvnw spring-boot:run'
4. Acesse: http://localhost:8080/health

## 📋 Endpoints
- GET /health - Status da aplicação (inclui versão Java)
'http://localhost:8080/health'
- GET /info - Informações da aplicação
'http://localhost:8080/info'
- GET /h2-console - Console do banco H2
'http://localhost:8080/h2-console'

## 🔧 Configuração
- Porta: 8080
- Banco: H2 em memória (jdbc:h2:mem:deliverydb)
- Profile: development

## 👨‍💻 Desenvolvedor
- Everton Ribeiro - Arquitetura de Sistemas — FAT (Matrícula: TI56 02726 )
- Projeto desenvolvido com JDK 21 e Spring Boot 3.5.5