# 🚗 Sistema de Locadora de Veículos
Este projeto implementa um Sistema de Locadora de Veículos totalmente em Java, utilizando o terminal (CLI) como interface de interação.
O objetivo é aplicar conceitos fundamentais de Programação Orientada a Objetos (POO), juntamente com persistência em banco de dados via JDBC, boas práticas de arquitetura e modularização.

# 🎯 Objetivos do Sistema
* O sistema permite:
* Cadastro de clientes
* Listagem de clientes
* Atualização de dados
* Remoção de clientes
* Persistência dos dados em banco SQLite (via JDBC)
* Organização das camadas segundo boas práticas de software
* Outros módulos (Veículos, Reservas e Locações) podem ser integrados seguindo a mesma arquitetura.

# 🧱 📂 Estrutura do Projeto
```
locadora-de-veiculos/
├── src/
│   ├── Main.java                   → Ponto de entrada do sistema
│   ├── models/                     → Classes de dados (Cliente, Veiculo...)
│   ├── dao/                        → CRUD e comunicação com o banco (JDBC)
│   ├── services/                   → Regras de negócio e validações
│   ├── ui/                         → Menus e interação com o usuário
│   ├── utils/                      → Logs, monitoramentos, auxiliares
│   └── database/                   → Conexão com o banco + schema.sql
└── libs/                           → JDBC Driver (sqlite-jdbc-x.x.x.jar)
```

# 🧬 Conceitos de POO Aplicados
✔ Encapsulamento
As classes modelo (ex: Cliente) encapsulam atributos com private e expõem apenas getters/setters.

✔ Abstração
O sistema modela elementos reais (Cliente, Veículo, Reserva…), escondendo detalhes internos.

✔ Polimorfismo
Aplicado no módulo de Veículos, onde a classe Veiculo define:
```
public abstract double calcularDiaria();
```
E cada tipo (Carro, Moto) implementa sua própria lógica.

✔ Herança
Veículos compartilham atributos comuns através de uma classe base Veiculo.

# 🗃 Persistência de Dados (JDBC + SQLite)

O sistema utiliza um banco SQLite local:
* Arquivo criado automaticamente: locadora.db
* Script SQL: src/database/schema.sql
* Driver necessário: sqlite-jdbc-x.x.x.jar

A conexão é gerenciada pela classe:
```
src/database/ConnectionFactory.java
```

Esta classe é responsável por:
* Carregar o driver JDBC
* Criar o banco se não existir
* Executar o schema inicial
* Fornecer conexão única via método estático getConnection()

# 🔄 Fluxo Completo do Módulo Cliente
```
[Terminal]
   ↓
MenuCliente.java (UI)
   ↓
ClienteService.java (Regra de negócio + validações)
   ↓
ClienteDAO.java (CRUD no banco via JDBC)
   ↓
ConnectionFactory.java (Conexão)
   ↓
SQLite (locadora.db)
```

# 🧪 Validações Aplicadas

O ClienteService aplica validações antes de permitir qualquer operação:
🔹 Nome
* Não pode ser nulo
* Deve conter pelo menos 3 caracteres

🔹 CPF
* Deve conter 11 dígitos

🔹 Telefone
* Aceita entre 8 e 11 dígitos numéricos

Em caso de falha, o Service bloqueia a operação e informa o erro ao usuário.

# 🖥 Interface de Terminal (UI)

Todos os menus seguem um padrão simples e direto:
Exemplo: Menu de Clientes

```
=== Menu Cliente ===
1 - Cadastrar Cliente
2 - Deletar Cliente
3 - Listar Clientes
0 - Voltar
```

A UI é responsável apenas por:
* Pedir dados ao usuário
* Mostrar o resultado
* Encaminhar ações ao Service
A lógica nunca fica na camada UI.

# 🗂 Banco de Dados (schema.sql)

Exemplo da tabela usada:
```
CREATE TABLE IF NOT EXISTS cliente(
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nome TEXT NOT NULL,
    cpf TEXT UNIQUE NOT NULL,
    telefone TEXT
);
```

# ▶️ Como Executar o Sistema

1️⃣ Baixe o driver SQLite JDBC
Coloque o arquivo .jar dentro da pasta:
```
/libs
```

2️⃣ Compile com o classpath:
```
javac -cp ".;libs/sqlite-jdbc-3.36.0.3.jar" src/**/*.java
```
(Em Linux/Mac use :)

3️⃣ Execute:
```
java -cp ".;libs/sqlite-jdbc-3.36.0.3.jar;src" Main
```
O banco será criado automaticamente.

📄 Projeto acadêmico, uso livre para fins educacionais.
