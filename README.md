# Gerenciamento de Loja Online

Este projeto é um sistema de gerenciamento de loja online desenvolvido em Java. O sistema permite a gestão de produtos, carrinhos de compras e pedidos, incluindo o gerenciamento de estoque e processamento de pagamentos.

## Funcionalidades

- **Gerenciamento de Produtos**: Adiciona e remove produtos do estoque.
- **Carrinho de Compras**: Adiciona e remove produtos do carrinho, calcula o preço total e lista os produtos.
- **Pedidos**: Cria e finaliza pedidos com base nos produtos presentes no carrinho.
- **Pagamentos**: Suporta diferentes métodos de pagamento, incluindo cartão de crédito, PayPal e transferência bancária.

## Estrutura do Projeto

- **Classes Principais**:
  - `Cliente`: Representa um usuário que pode adicionar produtos ao carrinho e realizar pedidos.
  - `Carrinho`: Gerencia a adição e remoção de produtos, e calcula o preço total.
  - `Estoque`: Controla a quantidade de produtos disponíveis.
  - `Pedido`: Representa um pedido feito por um cliente, com o estado do pedido sendo gerenciado.
  - `GerenciamentoDePedidos`: Coordena a criação e finalização dos pedidos.
  - `Pagamento`: Classe abstrata para diferentes métodos de pagamento, incluindo subclasses como `PagamentoCartaoCredito`, `PagamentoPayPal`, e `PagamentoTransferenciaBancaria`.

## Métodos Importantes

- **Carrinho**:
  - `adicionarProduto(Estoque estoque, Produto produto, int quantidade)`: Adiciona um produto ao carrinho, ajustando o estoque.
  - `removerProduto(Estoque estoque, Produto produto, int quantidade)`: Remove um produto do carrinho e ajusta o estoque.

- **GerenciamentoDePedidos**:
  - `criarPedido(Carrinho carrinho, Estoque estoque)`: Cria um pedido e remove os produtos do estoque.
  - `finalizarPedido(Pedido pedido)`: Finaliza um pedido, mudando seu estado para "entregue".

- **Pagamento**:
  - Subclasses como `PagamentoCartaoCredito` e `PagamentoPayPal` implementam diferentes formas de pagamento e suas respectivas validações.

## Requisitos

- Java 11 ou superior
- IDE como NetBeans para desenvolvimento (opcional)

## Testes

O projeto inclui testes unitários para garantir a funcionalidade correta das classes principais, como `Carrinho`, `GerenciamentoDePedidos`, e suas interações com o `Estoque`.

## Execução

1. Clone o repositório:
   ```sh
   git clone https://github.com/DaviOSC/MI3-PBL3.git
   
