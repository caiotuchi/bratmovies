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

## Workflow
O Workflow escolhido foi o Github Flow, que por ser mais simples permitiria uma entrega mais rápida dessa API de pequeno escopo.

## Endpoints

1. Listar Filmes (GET)
Endpoint: GET /filmes
Descrição: Retorna todos os filmes cadastrados.
Exemplo de requisição:
http://localhost:8080/filmes

3. Adicionar Filme (POST)
Endpoint: POST /filmes
Exemplo de Requisição pelo Postman:
Abra o Postman.
Selecione o método POST.
Insira a URL: http://localhost:8080/filmes.
Vá para a aba Headers e adicione:
Key: Content-Type
Value: application/json
Na aba Body, escolha a opção raw e selecione JSON no menu suspenso.

Insira o JSON da seguinte forma:
{
    "titulo": "O Senhor dos Anéis",
    "diretor": "Peter Jackson",
    "ano": 2001
}
Clique em Send para enviar a requisição.

3. Remover Filme (DELETE)
Endpoint: DELETE /filmes/{id}
Descrição: Remove um filme pelo ID.

Caso o filme não exista, a API retornará 404 (Not Found).
Caso o filme exista, ele será removido e a API retornará 204 (No Content).
