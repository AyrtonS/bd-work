-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 07-Dez-2017 às 01:12
-- Versão do servidor: 10.1.13-MariaDB
-- PHP Version: 7.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `university`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `aluno`
--

CREATE TABLE `aluno` (
  `matricula` int(11) NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `telefone` varchar(45) DEFAULT NULL,
  `data_nas` mediumblob,
  `sexo` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `aluno`
--

INSERT INTO `aluno` (`matricula`, `nome`, `email`, `telefone`, `data_nas`, `sexo`) VALUES
(4567890, 'Ayrton', 'ayrton@hotmail.com', '34567890-', 0x6a6176612e7574696c2e477265676f7269616e43616c656e6461725b74696d653d3f2c6172654669656c64735365743d66616c73652c617265416c6c4669656c64735365743d747275652c6c656e69656e743d747275652c7a6f6e653d73756e2e7574696c2e63616c656e6461722e5a6f6e65496e666f5b69643d22474d542d30333a3030222c6f66667365743d2d31303830303030302c647374536176696e67733d302c7573654461796c696768743d66616c73652c7472616e736974696f6e733d302c6c61737452756c653d6e756c6c5d2c66697273744461794f665765656b3d312c6d696e696d616c44617973496e46697273745765656b3d312c4552413d312c594541523d3131372c4d4f4e54483d31312c5745454b5f4f465f594541523d34392c5745454b5f4f465f4d4f4e54483d322c4441595f4f465f4d4f4e54483d332c4441595f4f465f594541523d3334302c4441595f4f465f5745454b3d342c4441595f4f465f5745454b5f494e5f4d4f4e54483d312c414d5f504d3d312c484f55523d382c484f55525f4f465f4441593d32302c4d494e5554453d35392c5345434f4e443d33332c4d494c4c495345434f4e443d3239352c5a4f4e455f4f46465345543d2d31303830303030302c4453545f4f46465345543d305d, 'M');

-- --------------------------------------------------------

--
-- Estrutura da tabela `aluno_disciplina`
--

CREATE TABLE `aluno_disciplina` (
  `aluno_matr` int(11) NOT NULL,
  `disciplina_codigo` int(11) NOT NULL,
  `periodo` varchar(45) NOT NULL,
  `nota` double DEFAULT NULL,
  `frequencia` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `disciplina`
--

CREATE TABLE `disciplina` (
  `codigo` int(11) NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  `creditos` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `disciplina`
--

INSERT INTO `disciplina` (`codigo`, `nome`, `creditos`) VALUES
(543, 'Banco de Dados', 74);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `aluno`
--
ALTER TABLE `aluno`
  ADD PRIMARY KEY (`matricula`);

--
-- Indexes for table `aluno_disciplina`
--
ALTER TABLE `aluno_disciplina`
  ADD PRIMARY KEY (`aluno_matr`,`disciplina_codigo`,`periodo`),
  ADD KEY `CH_DISCIPLINA` (`disciplina_codigo`);

--
-- Indexes for table `disciplina`
--
ALTER TABLE `disciplina`
  ADD PRIMARY KEY (`codigo`);

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `aluno_disciplina`
--
ALTER TABLE `aluno_disciplina`
  ADD CONSTRAINT `CH_ALUNO` FOREIGN KEY (`aluno_matr`) REFERENCES `aluno` (`matricula`) ON UPDATE CASCADE,
  ADD CONSTRAINT `CH_DISCIPLINA` FOREIGN KEY (`disciplina_codigo`) REFERENCES `disciplina` (`codigo`) ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
