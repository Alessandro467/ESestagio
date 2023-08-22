CREATE DATABASE projetoEstagio;

USE projetoEstagio;

-- 1) Gerar o script de criação do banco de dados, modelo físico:
--


CREATE TABLE Coordenador (
nomeCoordenador varchar(30),
emailCoordenador varchar(30),
codCoordenador int PRIMARY KEY,
foneCoordenador varchar(30)
);

CREATE TABLE ProfOrientador (
nomeProf varchar(30),
codProf int PRIMARY KEY,
emailProf varchar(30),
foneProf varchar(30),
cpfProf varchar(11),
codCoordenador int,
FOREIGN KEY(codCoordenador) REFERENCES Coordenador (codCoordenador) -- DEFINIR CHAVE ESTRANGEIRA
);

CREATE TABLE Curso(
codCurso int PRIMARY KEY,
siglaCurso varchar(5),
nomeCurso varchar(30)
);
CREATE TABLE Aluno (
nomeAluno varchar(30),
matricula INT PRIMARY KEY,
emailAluno varchar(30),
foneAluno varchar(30),
cpfAluno varchar(11),
codCoordenador int,
codProf int,
codCurso int,
FOREIGN KEY(codCoordenador) REFERENCES Coordenador (codCoordenador), -- DEFINIR CHAVE ESTRANGEIRA
FOREIGN KEY(codProf) REFERENCES ProfOrientador (codProf), -- DEFINIR CHAVE ESTRANGEIRA
FOREIGN KEY(codCurso) REFERENCES Curso (codCurso) -- DEFINIR CHAVE ESTRANGEIRA
);

CREATE TABLE Empresa(
codEmpresa INT PRIMARY KEY,
cnpj varchar (11),
nomeEmpresa varchar(30),
enderecoEmpresa varchar(100),
foneEmp varchar (15),
codCoordenador int,
FOREIGN KEY(codCoordenador) REFERENCES Coordenador (codCoordenador) -- DEFINIR CHAVE ESTRANGEIRA
);

CREATE TABLE Vaga(
codVaga INT PRIMARY KEY, 
descricaoVaga varchar(250),
gerente varchar (30),
qtdVaga int,
nomeVaga varchar (30),
codCoordenador int,
codEmpresa int,
FOREIGN KEY(codCoordenador) REFERENCES Coordenador (codCoordenador), -- DEFINIR CHAVE ESTRANGEIRA
FOREIGN KEY(codEmpresa) REFERENCES Empresa (codEmpresa) -- DEFINIR CHAVE ESTRANGEIRA
);

CREATE TABLE Documento(
codDoc INT PRIMARY KEY,
dataDoc date,
tipoDoc varchar (30),
tituloDoc varchar (150)
);
CREATE TABLE Inscricao(
numInscricao INT PRIMARY KEY,
codVaga int,
matricula int,
codDoc int,
FOREIGN KEY(matricula) REFERENCES Aluno (matricula), -- DEFINIR CHAVE ESTRANGEIRA
FOREIGN KEY(codVaga) REFERENCES Vaga (codVaga), -- DEFINIR CHAVE ESTRANGEIRA
FOREIGN KEY(codDoc) REFERENCES Documento (codDoc) -- DEFINIR CHAVE ESTRANGEIRA

);
