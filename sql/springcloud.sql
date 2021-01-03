/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.31-log : Database - springcloud
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`springcloud` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `springcloud`;

/*Table structure for table `t_order` */

DROP TABLE IF EXISTS `t_order`;

CREATE TABLE `t_order` (
  `rid` int(10) NOT NULL AUTO_INCREMENT,
  `uid` varchar(100) DEFAULT NULL,
  `ruuid` varchar(100) DEFAULT NULL,
  `produce_name` varchar(100) DEFAULT NULL,
  `account` int(5) DEFAULT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_order` */

/*Table structure for table `t_products` */

DROP TABLE IF EXISTS `t_products`;

CREATE TABLE `t_products` (
  `pid` int(10) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(100) DEFAULT NULL,
  `product_desc` varchar(255) DEFAULT NULL,
  `inventory` int(10) DEFAULT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `t_products` */

insert  into `t_products`(`pid`,`product_name`,`product_desc`,`inventory`) values (1,'小米手机','小米100',450),(2,'华为手机','中华有为',1000),(3,'苹果手','昂贵的苹果',251);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
