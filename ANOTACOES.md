# E-commerce Backend

## Objetivo

Desenvolver um sistema de e-commerce para praticar Java, POO e posteriormente conceitos de backend.

## Classes

### Cliente

* O que representa: Pessoa que realiza compras no sistema.
* Atributos: id, nome, email.
* Métodos: cadastrar, atualizar dados.

### Produto

* O que representa: Produto disponível para venda.
* Atributos: id, nome, preço, estoque.
* Métodos: adicionar estoque, remover estoque.

### Pedido

* O que representa: Compra realizada por um cliente.
* Atributos: id, cliente, itens, status.
* Métodos: adicionar item, remover item, calcular total.

### ItemPedido

* O que representa: Produto e sua quantidade dentro de um pedido.
* Atributos: produto, quantidade, preço unitário.
* Métodos: calcular subtotal.

## Relacionamentos

* Cliente → Pedido: um cliente pode ter vários pedidos.
* Pedido → ItemPedido: um pedido pode ter vários itens.
* ItemPedido → Produto: cada item representa um produto.

## Primeira versão

* [ ] Criar produtos
* [ ] Criar clientes
* [ ] Criar pedidos
* [ ] Adicionar produtos ao pedido
* [ ] Remover produtos do pedido
* [ ] Alterar quantidade de um item
* [ ] Calcular total do pedido
