-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: fiche
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `fiche`
--

LOCK TABLES `fiche` WRITE;
/*!40000 ALTER TABLE `fiche` DISABLE KEYS */;
INSERT INTO `fiche` VALUES (1,1000,'2000-11-11 00:00:00','2022-05-13 00:00:00','ds',1,'oui'),(2,50000,'2022-02-06 00:00:00','2022-05-13 00:00:00','ds',1,'oui'),(3,50000,'2022-02-06 00:00:00','2022-05-13 00:00:00','ds',1,'oui'),(4,50000,'2022-02-06 00:00:00','2022-05-13 00:00:00','ds',1,'oui'),(5,50000,'2022-02-06 00:00:00','2022-05-13 00:00:00','ds',1,'oui'),(6,75,'2022-04-28 00:00:00','2022-05-13 00:00:00','ds',1,'oui'),(7,8000,'2022-05-06 00:00:00','1666-06-06 00:00:00','????',1,'oui validé'),(8,8000,'2022-05-06 00:00:00','1666-06-06 00:00:00','????',1,'oui validé'),(9,36500,'2022-05-18 00:00:00','1666-06-06 00:00:00','????',1,'oui validé'),(10,36500,'2022-05-18 00:00:00','1666-06-06 00:00:00','????',1,'oui validé'),(11,10296,'2022-05-12 00:00:00','1666-06-06 00:00:00','????',1,'oui validé'),(12,1012,'2022-05-12 00:00:00','1666-06-06 00:00:00','????',1,'oui validé'),(13,3,'2022-05-06 00:00:00','1666-06-06 00:00:00','????',1,'oui validé'),(14,6,'2022-05-05 00:00:00','1666-06-06 00:00:00','????',1,'oui validé'),(15,48,'2022-05-11 00:00:00','1666-06-06 00:00:00','????',1,'oui validé'),(16,3,'2022-05-20 00:00:00','1666-06-06 00:00:00','????',1,'oui validé'),(17,3,'2022-05-11 00:00:00','1666-06-06 00:00:00','????',1,'oui validé'),(18,3,'2022-05-20 00:00:00','1666-06-06 00:00:00','????',1,'oui validé'),(19,48,'2022-05-11 00:00:00','1666-06-06 00:00:00','????',1,'oui validé'),(20,75,'2022-05-27 00:00:00','1666-06-06 00:00:00','????',1,'oui validé'),(21,75,'2022-05-20 00:00:00','1666-06-06 00:00:00','????',1,'oui validé'),(22,75,'2022-05-20 00:00:00','1666-06-06 00:00:00','????',1,'oui validé'),(23,75,'2022-05-05 00:00:00','1666-06-06 00:00:00','????',1,'oui validé');
/*!40000 ALTER TABLE `fiche` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `frais`
--

LOCK TABLES `frais` WRITE;
/*!40000 ALTER TABLE `frais` DISABLE KEYS */;
INSERT INTO `frais` VALUES (1,'5','TextField[id=montantunitaire, styleClass=text-input text-field]','5','TextField[id=montantunitaire2, styleClass=text-input text-field]','5','TextField[id=montantunitaire3, styleClass=text-input text-field]',1,1,'1','25','25','25',''),(2,'5','5','5','5','5','5',1,1,'1','25','25','25','');
/*!40000 ALTER TABLE `frais` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `frais_hf`
--

LOCK TABLES `frais_hf` WRITE;
/*!40000 ALTER TABLE `frais_hf` DISABLE KEYS */;
INSERT INTO `frais_hf` VALUES (1,'2000-11-11 00:00:00','externe','50',1),(2,'2000-11-11 00:00:00','externe','50',1),(3,'2000-11-11 00:00:00','externe','50',1),(4,'2022-04-28 00:00:00','externe','50',1),(5,'2022-05-10 00:00:00','sqggsdgs','500',1),(6,'2022-04-26 00:00:00','qdgqgd','qgdgdq',1),(7,'2022-04-26 00:00:00','qdgqgd','5000',1),(8,'2022-05-07 00:00:00','qq','5000',1),(9,'2022-05-07 00:00:00','qq','5000',1),(10,'2022-05-19 00:00:00','qdgqd','5000',1),(11,'2022-05-11 00:00:00','shfsh','50000',1),(12,'2022-05-12 00:00:00','taxi','50000',1),(13,'2022-05-13 00:00:00','taxi ','1500',1),(14,'2022-05-04 00:00:00','taxi driver','5000',1),(15,'2022-05-04 00:00:00','taxi driver','5000',1),(16,'2022-05-04 00:00:00','maquillage','5000',1),(17,'2022-05-04 00:00:00','maquillage','5000',1),(18,'2022-05-04 00:00:00','maquillage','5000',1),(19,'2022-05-10 00:00:00','qsgq','5000',1),(20,'2022-05-10 00:00:00','qsgq','5000',1),(21,'2022-05-13 00:00:00','dj','1',1),(22,'2022-05-09 00:00:00','xhjcv','1200',1),(23,'2022-05-05 00:00:00','d','111',1),(24,'2022-05-13 00:00:00','cfxcf','500',1),(25,'2022-05-12 00:00:00','dsggf','150',1),(26,'2022-04-25 00:00:00','dgs','10',1),(27,'2022-05-11 00:00:00','dsqgq','50',1),(28,'2022-05-10 00:00:00','sgw','50',1),(29,'2022-05-11 00:00:00','ssrhh','41445',1),(30,'2022-05-11 00:00:00','ssrhh','41445',1),(31,'2022-05-03 00:00:00','whw','10',1),(32,'2022-05-03 00:00:00','whw','10',1),(33,'2022-05-04 00:00:00','whw','10',1);
/*!40000 ALTER TABLE `frais_hf` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `typefrais`
--

LOCK TABLES `typefrais` WRITE;
/*!40000 ALTER TABLE `typefrais` DISABLE KEYS */;
INSERT INTO `typefrais` VALUES (1,'cool',500);
/*!40000 ALTER TABLE `typefrais` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `typevehicule`
--

LOCK TABLES `typevehicule` WRITE;
/*!40000 ALTER TABLE `typevehicule` DISABLE KEYS */;
INSERT INTO `typevehicule` VALUES (1,'4CV Diesel '),(2,'5/6CV Diesel'),(3,'4CV Essence'),(4,'5/6CV Essence');
/*!40000 ALTER TABLE `typevehicule` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `visiteur`
--

LOCK TABLES `visiteur` WRITE;
/*!40000 ALTER TABLE `visiteur` DISABLE KEYS */;
INSERT INTO `visiteur` VALUES (1,'1A','rein','arnaud',3,'rein','visiteur'),(2,'1aa','satan','bete',4,'bete','comptable'),(3,'1aa','satan','bete',4,'',''),(4,'1aa','satan','bete',4,'',''),(5,'1aa','satan','bete',4,'',''),(6,'1aa','satan','bete',4,'',''),(7,'1aa','satan','bete',4,'',''),(8,'1aa','satan','bete',4,'',''),(9,'sqg','qdgs','',4,'',''),(10,'anraud','qgqdg','arijahtigiqg',4,'',''),(11,'qsgq','qggqsdgdq','sqgddqs',4,'',''),(12,'fqsfq','qdfq','qfdqf',4,'',''),(13,'qgq','qgd','qgdqgsd',4,'',''),(14,'qgqdd','qdgq','dqsgqd',4,'',''),(15,'qgqdd','qdgq','dqsgqd',4,'',''),(16,'qdfsdq','dfqsdf','qdf',4,'',''),(17,'qdfsdq','dfqsdf','qdf',4,'',''),(18,'qgq','qdgqd','qqdg',4,'',''),(19,'wf','wf','shf',4,'',''),(20,'1978T','De Niro','Robert',4,'notFinish','comptable'),(21,'1978T','De Niro','Robert',4,'notFinish','comptable'),(22,'1978T','De Niro','Robert',4,'notFinish','comptable'),(23,'12','De Niro','Robert',4,'notFinish','comptable'),(24,'2000','rein','julie',4,'notFinish','comptable'),(25,'2000','rein','julie',4,'notFinish','comptable'),(26,'2000','rein','julie',4,'notFinish','comptable'),(27,'1111','qesh','qsd',4,'notFinish','comptable'),(28,'1111','qesh','qsd',4,'notFinish','comptable'),(29,'f','fdww','ffbxbb',4,'notFinish','comptable'),(30,'sqg','qgq','qdgqds',4,'notFinish','comptable'),(31,'f','f','f',4,'notFinish','comptable'),(32,'ff','ff','ff',4,'notFinish','comptable'),(33,'f','f','f',4,'notFinish','comptable'),(34,'f','f','f',4,'notFinish','comptable'),(35,'ddd','ffd','ddd',4,'notFinish','comptable'),(36,'uu','uu','uu',4,'notFinish','comptable'),(37,'qgdqs','qdsg','qdsg',4,'notFinish','comptable'),(38,'qgdqs','qdsg','qdsg',4,'notFinish','comptable'),(39,'qsg','sqgq','sdqgd',4,'notFinish','comptable'),(40,'qsg','sqgq','sdqgd',4,'notFinish','comptable'),(41,'sqgh','sfdhhf','cjg',4,'notFinish','comptable');
/*!40000 ALTER TABLE `visiteur` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-16  6:14:08
