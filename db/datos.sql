-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: 127.0.0.1    Database: poo-estacionamiento
-- ------------------------------------------------------
-- Server version	5.6.25

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `AbonoPropietario`
--

LOCK TABLES `AbonoPropietario` WRITE;
/*!40000 ALTER TABLE `AbonoPropietario` DISABLE KEYS */;
INSERT INTO `AbonoPropietario` VALUES (1,'2017-05-11 19:41:55',123,123,2,1),(2,'2017-05-11 19:41:55',321,321,2,1),(3,'2017-05-11 19:42:08',9,330,2,1),(4,'2017-08-21 12:22:58',200,530,2,1);
/*!40000 ALTER TABLE `AbonoPropietario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `Ingreso`
--

LOCK TABLES `Ingreso` WRITE;
/*!40000 ALTER TABLE `Ingreso` DISABLE KEYS */;
/*!40000 ALTER TABLE `Ingreso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `Marca`
--

LOCK TABLES `Marca` WRITE;
/*!40000 ALTER TABLE `Marca` DISABLE KEYS */;
/*!40000 ALTER TABLE `Marca` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `Modelo`
--

LOCK TABLES `Modelo` WRITE;
/*!40000 ALTER TABLE `Modelo` DISABLE KEYS */;
/*!40000 ALTER TABLE `Modelo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `Permiso`
--

LOCK TABLES `Permiso` WRITE;
/*!40000 ALTER TABLE `Permiso` DISABLE KEYS */;
/*!40000 ALTER TABLE `Permiso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `PermisoUsuario`
--

LOCK TABLES `PermisoUsuario` WRITE;
/*!40000 ALTER TABLE `PermisoUsuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `PermisoUsuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `Porton`
--

LOCK TABLES `Porton` WRITE;
/*!40000 ALTER TABLE `Porton` DISABLE KEYS */;
/*!40000 ALTER TABLE `Porton` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `Propietario`
--

LOCK TABLES `Propietario` WRITE;
/*!40000 ALTER TABLE `Propietario` DISABLE KEYS */;
INSERT INTO `Propietario` VALUES (1,'Luiggi','Mario',34315672),(2,'Robles','Mario',34315671);
/*!40000 ALTER TABLE `Propietario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `Tarifa`
--

LOCK TABLES `Tarifa` WRITE;
/*!40000 ALTER TABLE `Tarifa` DISABLE KEYS */;
/*!40000 ALTER TABLE `Tarifa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `TipoVehiculo`
--

LOCK TABLES `TipoVehiculo` WRITE;
/*!40000 ALTER TABLE `TipoVehiculo` DISABLE KEYS */;
/*!40000 ALTER TABLE `TipoVehiculo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `Usuario`
--

LOCK TABLES `Usuario` WRITE;
/*!40000 ALTER TABLE `Usuario` DISABLE KEYS */;
INSERT INTO `Usuario` VALUES (1,'Nio','Polo','polo','asdqwe');
/*!40000 ALTER TABLE `Usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `Vehiculo`
--

LOCK TABLES `Vehiculo` WRITE;
/*!40000 ALTER TABLE `Vehiculo` DISABLE KEYS */;
/*!40000 ALTER TABLE `Vehiculo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-08-21 12:24:10
