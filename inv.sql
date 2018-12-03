-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: inv
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `employee` (
  `empID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `userName` varchar(16) NOT NULL,
  `password` varchar(32) NOT NULL,
  `salt` blob NOT NULL,
  `businessName` varchar(40) NOT NULL,
  `dept` varchar(40) NOT NULL,
  PRIMARY KEY (`empID`),
  KEY `empID` (`empID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `invdetails`
--

DROP TABLE IF EXISTS `invdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `invdetails` (
  `invID` int(11) unsigned NOT NULL,
  `ItemName` varchar(40) NOT NULL,
  `ManfName` varchar(40) NOT NULL,
  `supplier` varchar(40) NOT NULL,
  `quantity` int(11) unsigned DEFAULT NULL,
  `par` int(11) unsigned DEFAULT NULL,
  `price` float unsigned NOT NULL,
  KEY `invDetails_ibfk_1` (`invID`),
  CONSTRAINT `invDetails_ibfk_1` FOREIGN KEY (`invID`) REFERENCES `invsheet` (`invid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invdetails`
--

LOCK TABLES `invdetails` WRITE;
/*!40000 ALTER TABLE `invdetails` DISABLE KEYS */;
INSERT INTO `invdetails` VALUES (1,'Fruit loops','Kellog','no one',20,30,20.5),(1,'Frosted flakes','Kellog','no one',20,30,20.5),(1,'Applejacks','Kellog','no one',20,30,20.5),(1,'test','Kellog','no one',20,30,20.5);
/*!40000 ALTER TABLE `invdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `invsheet`
--

DROP TABLE IF EXISTS `invsheet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `invsheet` (
  `invID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `businessName` varchar(40) NOT NULL,
  `description` varchar(100) NOT NULL,
  `currentDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`invID`),
  KEY `invID` (`invID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invsheet`
--

LOCK TABLES `invsheet` WRITE;
/*!40000 ALTER TABLE `invsheet` DISABLE KEYS */;
INSERT INTO `invsheet` VALUES (1,'kellog','description','2018-12-03 02:37:28'),(2,'kellog','description','2018-12-03 02:37:30'),(3,'kellog','description','2018-12-03 02:37:31'),(4,'kellog','description','2018-12-03 02:37:32'),(5,'kellog','description','2018-12-03 02:37:33');
/*!40000 ALTER TABLE `invsheet` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-02 18:41:52
