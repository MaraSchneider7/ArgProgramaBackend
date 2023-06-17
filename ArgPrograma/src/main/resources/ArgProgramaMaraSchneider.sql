CREATE DATABASE  IF NOT EXISTS `argprograma` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `argprograma`;
-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: argprograma
-- ------------------------------------------------------
-- Server version	8.0.33

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
-- Table structure for table `proyecto`
--

DROP TABLE IF EXISTS `proyecto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proyecto` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(1000) DEFAULT NULL,
  `fecha_inicio` datetime(6) DEFAULT NULL,
  `link` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proyecto`
--

LOCK TABLES `proyecto` WRITE;
/*!40000 ALTER TABLE `proyecto` DISABLE KEYS */;
/*!40000 ALTER TABLE `proyecto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `apellido` varchar(255) DEFAULT NULL,
  `descripcion_titulo_profesional` varchar(1000) DEFAULT NULL,
  `educacion` varchar(1000) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `experiencia_laboral` varchar(1000) DEFAULT NULL,
  `github` varchar(255) DEFAULT NULL,
  `info_sobre_usuario` varchar(1000) DEFAULT NULL,
  `linkedin` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `sesion` bit(1) DEFAULT NULL,
  `titulo_profesional` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'Schneider','Actualmente desempeñándome como Frontend Developer, aprendiendo cosas nuevas y produciendo trabajo de calidad.','Tecnicatura en programación - UTN Regional Delta, En curso','mara','Actualmente trabajo como Frontend Developer para CDT - Soluciones tecnológicas, allí cuento con un equipo genial de personas que colaboran de forma organizada para llegar a los objetivos propuestos.','https://github.com/MaraSchneider7','Mi interés en la tecnología comenzó en 2021, cuando vi una publicación de instagram de Junior Achievement. Ellos ofrecían becas para capacitar chicos en Soporte IT nivel trainee y luego de varios meses en cuarentena decidí que no era mala idea probar estudiar algo nuevo, por lo cual me postulé. Para mi asombro quedé seleccionada y, luego de 6 meses de realizar cursos técnicos y fortalecer mis habilidades blandas con excelentes profesores, me animé a buscar un trabajo relacionado.Otra de mis sorpresas fue quedar seleccionada en las entrevistas para el puesto que ocupo actualmente: Analista Programadora, o dicho de otra forma \'Full Stack Developer\', si bien mi trabajo está enfocado en el lado Frontend de la programación, sigo capacitándome para desempeñarme en ambos lados. ¡Disfruto mucho de diseñar y crear páginas web!','https://ar.linkedin.com/in/schneider-mara','Mara','mara',_binary '\0','Full Stack Developer Jr');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-17 12:27:11
