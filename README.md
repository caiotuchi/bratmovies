# bratmovies
Esta é uma API REST simples para gerenciar filmes, desenvolvida com **Spring Boot** e **MongoDB** para estudos de CI/CD.

## Pré-requisitos
- **JDK 17** ou superior
- **Maven** instalado
- **MongoDB** rodando localmente na porta padrão (`27017`)
- **MongoDB Compass** (opcional, para gerenciar os dados graficamente)

## Configuração

1. Clone o repositório:
   git clone https://github.com/seu-usuario/seu-repositorio.git
   
2. Verifique se o MongoDB está rodando localmente. Caso não esteja, inicie o serviço MongoDB.

3. Compile e instale as dependências com o Maven:
mvn clean install

4. Execute a aplicação:
mvn spring-boot:run
A API estará disponível em: http://localhost:8080.

Endpoints
GET /filmes: Retorna todos os filmes cadastrados.
