# Padrão Factory Method em Java com Spring Boot

## Descrição
Este projeto demonstra o uso do padrão de projeto Factory Method em Java usando o Spring Boot. O padrão Factory Method define uma interface para criar um objeto, mas permite que as subclasses alterem o tipo de objetos que serão criados.

## Estrutura do Projeto
- `Produto`: Interface que define o método `exibirDetalhes`.
- `ProdutoA` e `ProdutoB`: Implementações concretas da interface `Produto` com detalhes adicionais.
- `FabricaProduto`: Classe abstrata que define o método `criarProduto` e o método `exibirProduto`.
- `FabricaProdutoA` e `FabricaProdutoB`: Implementações concretas da classe `FabricaProduto`.
- `ProdutoController`: Controlador Spring Boot para testar a implementação.
- `FabricaProdutosApplication`: Classe principal do Spring Boot.

## Como Executar
1. Importe o projeto em sua IDE.
2. Execute a classe `FabricaProdutosApplication`.
3. Acesse as URLs no navegador para ver os detalhes dos produtos:
   - [http://localhost:8080/produtoA](http://localhost:8080/produtoA)
   - [http://localhost:8080/produtoB](http://localhost:8080/produtoB)

## Saída Esperada
