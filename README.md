# 🛍️ Sistema de Gestão de Pedidos

Este projeto foi desenvolvido como **Trabalho Final da disciplina de Programação Orientada a Objetos**, com o objetivo de aplicar na prática os principais conceitos da POO em Java, como **encapsulamento**, **herança**, **polimorfismo**, **tratamento de exceções**, **threads** e **integração com banco de dados** via **JDBC**.

---

## 🎯 Objetivo do Sistema

O sistema simula uma **pequena loja virtual** (ou estabelecimento similar) e permite realizar as operações básicas de **cadastro, listagem, atualização e remoção (CRUD)** de dados referentes a clientes, produtos e pedidos.

---

## 🧩 Funcionalidades

- 📋 Cadastro, listagem, atualização e exclusão de clientes, produtos e pedidos.  
- 🛒 Associação de múltiplos produtos a um pedido.  
- 💾 Integração com banco de dados relacional via **JDBC**.  
- ⚙️ Tratamento de exceções (incluindo exceção personalizada).  
- 🧠 Aplicação de **herança e polimorfismo** em entidades.  
- ⏱️ Uso de **threads** para simulação de tarefas em paralelo (como logs e verificações automáticas).  
- ✅ Interface simples em console para interação do usuário.

---

## 🧮 Conceitos Aplicados
### 🧱 Encapsulamento
Todos os atributos das classes são **privados**, com métodos **getters** e **setters** para acesso controlado.  
Há validação de dados (ex: preço não pode ser negativo).

### 🧬 Herança
A hierarquia de classes foi implementada, por exemplo:
Funcionario → Vendedor → Gerente

### 🔁 Polimorfismo
Foi utilizado em:
- Sobrescrita de métodos (`toString()`, `calcularComissao()`, etc.);
- Uso de coleções genéricas (`List<Funcionario>`) que armazenam objetos de subclasses.

### ⚠️ Exceções
O projeto trata exceções comuns como:
- `SQLException`
- `NumberFormatException`
- `NullPointerException`

### 🧵 Threads
As threads são usadas para simular tarefas em segundo plano, como geração de logs ou atualização de status de pedidos.

### 🗄️ Banco de Dados
O sistema utiliza um banco de dados relacional (ex: MySQL, PostgreSQL ou SQLite) conectado via JDBC.

---

## 📥 Clonar o repositório
Clone o projeto em sua máquina:
```
git clone https://github.com/<seu-usuario>/gestao-de-pedidos.git
cd gestao-de-pedidos
```

