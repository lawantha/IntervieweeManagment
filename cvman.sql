-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 29, 2020 at 12:23 PM
-- Server version: 5.5.62
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `cvman`
--

-- --------------------------------------------------------

--
-- Table structure for table `data`
--

CREATE TABLE IF NOT EXISTS `data` (
  `No` int(5) NOT NULL AUTO_INCREMENT,
  `Name` varchar(500) NOT NULL,
  `DOB` date NOT NULL,
  `Age` int(11) NOT NULL,
  `NIC` varchar(15) NOT NULL,
  `Address` varchar(500) NOT NULL,
  `Phone` int(10) NOT NULL,
  `Email` varchar(200) DEFAULT NULL,
  `Gender` varchar(10) DEFAULT NULL,
  `AL` varchar(50) DEFAULT NULL,
  `Diploma` varchar(500) DEFAULT NULL,
  `Degree` varchar(500) DEFAULT NULL,
  `Other` varchar(2000) DEFAULT NULL,
  `Status` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`NIC`),
  UNIQUE KEY `No` (`No`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=24 ;

--
-- Dumping data for table `data`
--

INSERT INTO `data` (`No`, `Name`, `DOB`, `Age`, `NIC`, `Address`, `Phone`, `Email`, `Gender`, `AL`, `Diploma`, `Degree`, `Other`, `Status`) VALUES
(1, 'saman kumara', '2003-02-05', 17, '123456789066', 'dsfsdd', 983452765, 'erwte', 'Male', 'Art', '[ICT, Mechanical ]', '[B.E.E.]', 'raseftreasrew', ''),
(2, 'fsafa', '2003-04-05', 0, '222222222v', 'dadsfds', 1234567890, 'fsdfsad', 'Male', 'Stream', 'fsdfsad', 'fsdfsad', NULL, ''),
(3, 'afsdfs', '2003-03-05', 0, '222234444v', 'dsf', 1234567890, 'tsrdgf', 'null', 'Stream', 'tsrdgf', 'tsrdgf', NULL, ''),
(4, 'fsdfsdf', '2020-02-29', 0, '231234567v', 'sadfdsfdsf', 984673625, 'sdfsdf', 'Male', 'Tech', '[Electrical ]', '[BA]', 'sdfsad', ''),
(5, 'fsdfsdf', '2020-02-29', 0, '251234567v', '', 984673625, 'sdfsdf', 'Male', 'Stream', '[Electrical ]', '[BA]', 'sdfsad', ''),
(17, 'fsdfsdf', '2000-02-29', 20, '251284567v', '', 984673625, 'sdfsdf', 'Male', 'Stream', '[Electrical ]', '[BA]', 'sdfsad', ''),
(6, 'afsdfs', '2003-03-05', 0, '252234444v', 'dsf', 1234567890, '', 'Male', 'Art', '', '', NULL, ''),
(7, 'afsdfs', '2003-03-05', 0, '252236444v', 'dsf', 987654321, '', 'null', 'Stream', '', '', NULL, ''),
(18, 'Kamal', '2000-02-29', 20, '351284567v', '', 984673625, 'sdfsdf', 'Male', 'Stream', '[Electrical ]', '[BA]', 'sdfsad', ''),
(19, 'Samal', '2002-02-28', 18, '351288567v', '', 984673625, 'sdfsdf', 'Fmale', 'Stream', '[Electrical , Mechanical ]', '[BA, B.E.E.]', 'sdfsad', ''),
(8, 'sdfsd', '2003-04-06', 17, '412943456v', 'fsdfdf', 767937078, 'fsdfs', 'Male', 'Stream', '[ICT, Electrical , Mechanical ]', '[BSc, BA, B.Acc.]', 'wefefsdf fsdfsd fsdf fsdfs fsf', 'Called'),
(9, 'fsafa', '2003-04-05', 0, '422222222v', 'dadsfds', 1234567890, 'fsdfsad', 'Male', 'Tech', 'fsdfsad', 'fsdfsad', NULL, 'safdfasd'),
(23, 'Krishna', '1998-04-05', 22, '432345434656', 'erfref', 234513657, 'sfsf', 'Male', 'Science', '[ICT]', '[BSc]', 'tsegfsdgsd', ''),
(22, 'kamala', '2003-04-02', 17, '434534543455', 'sdfasdf', 982384756, 'dsffa', 'null', 'Art', '[ICT]', '[BSc]', 'cadasdfa', ''),
(10, 'sdfsd', '2003-04-06', 17, '452943456v', 'fsdfdf', 767937078, 'fsdfs', 'Male', 'Stream', '[Electrical , Account]', '[B.Acc., B.E.E.]', NULL, ''),
(11, 'Kamal', '1995-04-06', 25, '456543456v', 'colombo', 812435544, 'ada@gmail.com', 'Male', 'Science', '', '[BSc]', '', ''),
(12, 'sdfsd', '2003-04-06', 17, '456943456v', 'fsdfdf', 767937078, 'fsdfs', 'Male', 'Stream', '[Electrical , Account]', '[B.Acc., B.E.E.]', NULL, ''),
(13, 'fsafa', '2003-04-05', 0, '522222222v', 'dadsfds', 123456789, 'fsdfsad', 'Male', 'Stream', 'fsdfsad', 'fsdfsad', NULL, 'safdfasd'),
(14, 'fsdf', '2020-10-01', 54, '532453453245345', 'hf', 1234567890, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(15, 'gdsgf', '2001-03-05', 19, '5435345345434', '', 1234543214, '', 'null', 'Stream', '', '', NULL, ''),
(21, 'GOGO', '2005-05-08', 15, '545436453v', 'fdasfa', 347285434, '', 'Male', 'Stream', '[]', '[]', '', ''),
(20, 'fasfa', '2005-05-07', 15, '546789345643', 'fsdfs', 237654736, 'fsdfas', 'Male', 'Art', '[ICT, ICT]', '[BA, BA]', '', ''),
(16, 'afsdfs', '2003-03-05', 0, '6252236444v', 'dsf', 1111111111, '', 'null', 'Stream', '', '', NULL, '');

-- --------------------------------------------------------

--
-- Table structure for table `summary`
--

CREATE TABLE IF NOT EXISTS `summary` (
  `ID` int(15) NOT NULL,
  `Date` datetime NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `user` varchar(15) DEFAULT NULL,
  `pw` varchar(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user`, `pw`) VALUES
('Officer1', 'off12345'),
('Officer2', 'off23456'),
('Interviewer', 'int12345'),
('Admin', 'add12345');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
