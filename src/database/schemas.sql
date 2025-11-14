-- Criação das tabelas para o sistema de locadora de veículos

CREATE TABLE IF NOT EXISTS clientes (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nome TEXT NOT NULL,
    cpf TEXT NOT NULL UNIQUE,
    telefone TEXT
);

CREATE TABLE IF NOT EXISTS veiculos (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    modelo TEXT NOT NULL,
    marca TEXT NOT NULL,
    placa TEXT NOT NULL UNIQUE,
    ano INTEGER NOT NULL,
    categoria TEXT NOT NULL,
    valor_diaria REAL NOT NULL,
    status TEXT DEFAULT 'Disponível'
);

CREATE TABLE IF NOT EXISTS locacoes (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    cliente_id INTEGER NOT NULL,
    veiculo_id INTEGER NOT NULL,
    data_retirada TEXT NOT NULL,
    data_devolucao TEXT NOT NULL,
    valor_total REAL NOT NULL,
    FOREIGN KEY (cliente_id) REFERENCES clientes(id),
    FOREIGN KEY (veiculo_id) REFERENCES veiculos(id)
);
