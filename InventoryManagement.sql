-- MySQL dump 10.13  Distrib 5.7.24, for Linux (x86_64)
--
-- Host: localhost    Database: invMang
-- ------------------------------------------------------
-- Server version	5.7.24-0ubuntu0.18.04.1

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
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `empID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `userName` varchar(16) NOT NULL,
  `password` varchar(16) NOT NULL,
  `businessName` varchar(40) NOT NULL,
  `dept` varchar(40) NOT NULL,
  PRIMARY KEY (`empID`),
  KEY `empID` (`empID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invDetails`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (NULL ,'jboarts', 'od)*(#2@h1F', 'Boarts Shorts', 'Shorts');
INSERT INTO `employee` VALUES (NULL ,'aboyd', '#2@h1Fod)*(', 'Al Kitchen', 'Good FOOD');
INSERT INTO `employee` VALUES (NULL ,'jbennet', '#2@h1Fod)*(', 'WMU', 'Professor');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `invSheet`
--

DROP TABLE IF EXISTS `invSheet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `invSheet` (
  `invID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `description` varchar(100) NOT NULL, 
  `currentDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`invID`),
  KEY `invID` (`invID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invSheet`
--

LOCK TABLES `invSheet` WRITE;
/*!40000 ALTER TABLE `invSheet` DISABLE KEYS */;
INSERT INTO `invSheet` VALUES (NULL,'description', NULL);
INSERT INTO `invSheet` VALUES (NULL ,'description2', NULL);
INSERT INTO `invSheet` VALUES (NULL ,'description3', NULL);
/*!40000 ALTER TABLE `invSheet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `invDetails`
--

DROP TABLE IF EXISTS `invDetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `invDetails` (
  `invID` int(11) unsigned NOT NULL,
  `ItemName` varchar(40) NOT NULL,
  `ManfName` varchar(40) NOT NULL,
  `supplier` varchar(40) NOT NULL,
  `quantity` int(11) unsigned DEFAULT NULL,
  `par` int(11) unsigned DEFAULT NULL,
  `price` float unsigned NOT NULL,
  CONSTRAINT `invDetails_ibfk_1` FOREIGN KEY (`invID`) REFERENCES `invSheet` (`invID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invDetails`
--

LOCK TABLES `invDetails` WRITE;
/*!40000 ALTER TABLE `invDetails` DISABLE KEYS */;
INSERT INTO `invDetails` VALUES (1 ,'Fruit Loops', 'Kellogg', 'Kellogg', 100, 50, 3.00);
INSERT INTO `invDetails` VALUES (2 ,'Corn Flakes', 'Kellogg', 'Kellogg', 10, 25, 2.56);
INSERT INTO `invDetails` VALUES (3 ,'Chex', 'Kellogg', 'Kellogg', 15, 35, 2.54);
/*!40000 ALTER TABLE `invDetails` ENABLE KEYS */;
UNLOCK TABLES;

/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-20 16:44:24
