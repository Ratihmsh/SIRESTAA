-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 04, 2024 at 06:03 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `siresta`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `nip` varchar(20) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL,
  `jabatan` varchar(50) NOT NULL,
  `no_tlp` varchar(15) NOT NULL,
  `email` varchar(50) NOT NULL,
  `oplud` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `kalender`
--

CREATE TABLE `kalender` (
  `tanggal` date NOT NULL,
  `jam` time NOT NULL,
  `acara` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `kegiatan`
--

CREATE TABLE `kegiatan` (
  `kegiatan` varchar(100) NOT NULL,
  `date` date NOT NULL,
  `waktu` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `keluar`
--

CREATE TABLE `keluar` (
  `nomor` varchar(50) NOT NULL,
  `pengirim` varchar(100) DEFAULT NULL,
  `kepada` varchar(100) DEFAULT NULL,
  `perihal` varchar(100) DEFAULT NULL,
  `hari_tanggal` varchar(100) DEFAULT NULL,
  `jenis` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `masuk`
--

CREATE TABLE `masuk` (
  `nomor` varchar(50) NOT NULL,
  `pengirim` varchar(50) DEFAULT NULL,
  `kepada` varchar(50) DEFAULT NULL,
  `perihal` varchar(50) DEFAULT NULL,
  `hari_tanggal` date DEFAULT NULL,
  `jenis` varchar(50) DEFAULT NULL,
  `surat` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `masuk`
--

INSERT INTO `masuk` (`nomor`, `pengirim`, `kepada`, `perihal`, `hari_tanggal`, `jenis`, `surat`) VALUES
('AA', 'AA', 'AA', 'AA', '2024-03-08', 'telegram', 'C:UsersWIN 10DocumentsTugas Menpro.txt'),
('JJ', 'JJ', 'JJ', 'JJ', '2024-03-15', 'notadinas', 'C:\\Users\\WIN 10\\Documents\\CV Ratih.docx'),
('ST/123/SSS', 'Paka Danu', 'Pak Yanu', 'Surat Tugas', '2024-04-18', 'umum', 'D:\\2023-5 KALENDER AKADEMIK 2023-2024.pdf'),
('ST/123/WWW', 'Paka Danu', 'Pak Yanu', 'Surat Tugas', '2024-04-18', 'umum', 'C:\\Users\\WIN 10\\Documents\\CV Ratih.docx');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`nip`);

--
-- Indexes for table `kalender`
--
ALTER TABLE `kalender`
  ADD PRIMARY KEY (`tanggal`,`jam`);

--
-- Indexes for table `keluar`
--
ALTER TABLE `keluar`
  ADD PRIMARY KEY (`nomor`);

--
-- Indexes for table `masuk`
--
ALTER TABLE `masuk`
  ADD PRIMARY KEY (`nomor`),
  ADD UNIQUE KEY `nomor` (`nomor`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
