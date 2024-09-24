-- Criar o banco de dados
CREATE DATABASE ada_db;

-- Usar o banco de dados
USE ada_db;

-- Criar tabela discentes
CREATE TABLE discentes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    login VARCHAR(50) NOT NULL UNIQUE,
    senha VARCHAR(255) NOT NULL
);

-- Criar tabela docentes
CREATE TABLE docentes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    login VARCHAR(50) NOT NULL UNIQUE,
    senha VARCHAR(255) NOT NULL
);

-- Criar tabela gerentes
CREATE TABLE gerentes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    login VARCHAR(50) NOT NULL UNIQUE,
    senha VARCHAR(255) NOT NULL
);

-- Criar tabela materias
CREATE TABLE materias (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL UNIQUE
);

-- Criar tabela turmas
CREATE TABLE turmas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL UNIQUE
);


-- Inserir dados na tabela discentes
INSERT INTO discentes (nome, login, senha) VALUES
('Alice Silva', 'alice123', 'senhaAlice'),
('Bruno Souza', 'bruno456', 'senhaBruno'),
('Carla Oliveira', 'carla789', 'senhaCarla');

-- Inserir dados na tabela docentes
INSERT INTO docentes (nome, login, senha) VALUES
('Dr. João Mendes', 'joao.mendes', 'senhaJoao'),
('Profa. Maria Lima', 'maria.lima', 'senhaMaria'),
('Dr. Carlos Pereira', 'carlos.pereira', 'senhaCarlos');

-- Inserir dados na tabela gerentes
INSERT INTO gerentes (nome, login, senha) VALUES
('Admin', 'admin', 'admin'),
('Pedro Santos', 'pedro.santos', 'senhaPedro'),
('Luciana Costa', 'luciana.costa', 'senhaLuciana');

-- Inserir dados na tabela materias
INSERT INTO materias (nome) VALUES
('Matemática'),
('História'),
('Física'),
('Química'),
('Biologia');

-- Inserir dados na tabela turmas
INSERT INTO turmas (nome) VALUES
('Turma A - 1º Ano'),
('Turma B - 1º Ano'),
('Turma C - 2º Ano'),
('Turma D - 3º Ano');
