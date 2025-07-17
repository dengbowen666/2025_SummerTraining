-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: gowork
-- ------------------------------------------------------
-- Server version	5.7.31

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
-- Current Database: `gowork`
--

/*!40000 DROP DATABASE IF EXISTS `gowork`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `gowork` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `gowork`;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg'),(2,'picture2','upload/picture2.jpg'),(3,'picture3','upload/picture3.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gangweiluyong`
--

DROP TABLE IF EXISTS `gangweiluyong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gangweiluyong` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gangweimingcheng` varchar(200) NOT NULL COMMENT '岗位名称',
  `gangweiyaoqiu` varchar(200) DEFAULT NULL COMMENT '岗位要求',
  `renshu` int(11) DEFAULT NULL COMMENT '人数',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `luyongshuoming` varchar(200) DEFAULT NULL COMMENT '录用说明',
  `shifoupinkunsheng` varchar(200) DEFAULT NULL COMMENT '是否贫困生',
  `luyongriqi` date DEFAULT NULL COMMENT '录用日期',
  `bumenbianhao` varchar(200) DEFAULT NULL COMMENT '部门编号',
  `bumenmingcheng` varchar(200) DEFAULT NULL COMMENT '部门名称',
  `crossuserid` bigint(20) DEFAULT NULL COMMENT '跨表用户id',
  `crossrefid` bigint(20) DEFAULT NULL COMMENT '跨表主键id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 COMMENT='岗位录用';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gangweiluyong`
--

LOCK TABLES `gangweiluyong` WRITE;
/*!40000 ALTER TABLE `gangweiluyong` DISABLE KEYS */;
INSERT INTO `gangweiluyong` VALUES (81,'2025-06-30 08:08:16','岗位名称1','岗位要求1',1,'学号1','姓名1','录用说明1','是','2025-06-30','部门编号1','部门名称1',1,1),(82,'2025-06-30 08:08:16','岗位名称2','岗位要求2',2,'学号2','姓名2','录用说明2','是','2025-06-30','部门编号2','部门名称2',2,2),(83,'2025-06-30 08:08:16','岗位名称3','岗位要求3',3,'学号3','姓名3','录用说明3','是','2025-06-30','部门编号3','部门名称3',3,3),(84,'2025-06-30 08:08:16','岗位名称4','岗位要求4',4,'学号4','姓名4','录用说明4','是','2025-06-30','部门编号4','部门名称4',4,4),(85,'2025-06-30 08:08:16','岗位名称5','岗位要求5',5,'学号5','姓名5','录用说明5','是','2025-06-30','部门编号5','部门名称5',5,5),(86,'2025-06-30 08:08:16','岗位名称6','岗位要求6',6,'学号6','姓名6','录用说明6','是','2025-06-30','部门编号6','部门名称6',6,6);
/*!40000 ALTER TABLE `gangweiluyong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gangweixinxi`
--

DROP TABLE IF EXISTS `gangweixinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gangweixinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gangweimingcheng` varchar(200) NOT NULL COMMENT '岗位名称',
  `gangweiyaoqiu` varchar(200) DEFAULT NULL COMMENT '岗位要求',
  `gongzuoneirong` varchar(200) DEFAULT NULL COMMENT '工作内容',
  `xinzidaiyu` varchar(200) DEFAULT NULL COMMENT '薪资待遇',
  `xuqiurenshu` int(11) DEFAULT NULL COMMENT '需求人数',
  `renshu` int(11) DEFAULT NULL COMMENT '人数',
  `gongzuoshijian` varchar(200) DEFAULT NULL COMMENT '工作时间',
  `gongzuodidian` varchar(200) DEFAULT NULL COMMENT '工作地点',
  `bumenbianhao` varchar(200) DEFAULT NULL COMMENT '部门编号',
  `bumenmingcheng` varchar(200) DEFAULT NULL COMMENT '部门名称',
  `fuzejiaoshi` varchar(200) DEFAULT NULL COMMENT '负责教师',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='岗位信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gangweixinxi`
--

LOCK TABLES `gangweixinxi` WRITE;
/*!40000 ALTER TABLE `gangweixinxi` DISABLE KEYS */;
INSERT INTO `gangweixinxi` VALUES (51,'2025-06-30 08:08:16','岗位名称1','岗位要求1','工作内容1','薪资待遇1',1,1,'工作时间1','工作地点1','部门编号1','部门名称1','负责教师1','13823888881','是',''),(52,'2025-06-30 08:08:16','岗位名称2','岗位要求2','工作内容2','薪资待遇2',2,2,'工作时间2','工作地点2','部门编号2','部门名称2','负责教师2','13823888882','是',''),(53,'2025-06-30 08:08:16','岗位名称3','岗位要求3','工作内容3','薪资待遇3',3,3,'工作时间3','工作地点3','部门编号3','部门名称3','负责教师3','13823888883','是',''),(54,'2025-06-30 08:08:16','岗位名称4','岗位要求4','工作内容4','薪资待遇4',4,4,'工作时间4','工作地点4','部门编号4','部门名称4','负责教师4','13823888884','是',''),(55,'2025-06-30 08:08:16','岗位名称5','岗位要求5','工作内容5','薪资待遇5',5,5,'工作时间5','工作地点5','部门编号5','部门名称5','负责教师5','13823888885','是',''),(56,'2025-06-30 08:08:16','岗位名称6','岗位要求6','工作内容6','薪资待遇6',6,6,'工作时间6','工作地点6','部门编号6','部门名称6','负责教师6','13823888886','是','');
/*!40000 ALTER TABLE `gangweixinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jixiaoxinchou`
--

DROP TABLE IF EXISTS `jixiaoxinchou`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jixiaoxinchou` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gangweimingcheng` varchar(200) DEFAULT NULL COMMENT '岗位名称',
  `gangweiyaoqiu` varchar(200) DEFAULT NULL COMMENT '岗位要求',
  `kaoheneirong` longtext COMMENT '考核内容',
  `kaoheqingkuang` varchar(200) NOT NULL COMMENT '考核情况',
  `kaohepingji` varchar(200) NOT NULL COMMENT '考核评级',
  `kaohewenjian` varchar(200) DEFAULT NULL COMMENT '考核文件',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `xinchoujine` int(11) DEFAULT NULL COMMENT '薪酬金额',
  `kaoheriqi` date DEFAULT NULL COMMENT '考核日期',
  `bumenbianhao` varchar(200) DEFAULT NULL COMMENT '部门编号',
  `bumenmingcheng` varchar(200) DEFAULT NULL COMMENT '部门名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8 COMMENT='绩效薪酬';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jixiaoxinchou`
--

LOCK TABLES `jixiaoxinchou` WRITE;
/*!40000 ALTER TABLE `jixiaoxinchou` DISABLE KEYS */;
INSERT INTO `jixiaoxinchou` VALUES (91,'2025-06-30 08:08:16','岗位名称1','岗位要求1','考核内容1','合格','优','','学号1','姓名1','13823888881',1,'2025-06-30','部门编号1','部门名称1'),(92,'2025-06-30 08:08:16','岗位名称2','岗位要求2','考核内容2','合格','优','','学号2','姓名2','13823888882',2,'2025-06-30','部门编号2','部门名称2'),(93,'2025-06-30 08:08:16','岗位名称3','岗位要求3','考核内容3','合格','优','','学号3','姓名3','13823888883',3,'2025-06-30','部门编号3','部门名称3'),(94,'2025-06-30 08:08:16','岗位名称4','岗位要求4','考核内容4','合格','优','','学号4','姓名4','13823888884',4,'2025-06-30','部门编号4','部门名称4'),(95,'2025-06-30 08:08:16','岗位名称5','岗位要求5','考核内容5','合格','优','','学号5','姓名5','13823888885',5,'2025-06-30','部门编号5','部门名称5'),(96,'2025-06-30 08:08:16','岗位名称6','岗位要求6','考核内容6','合格','优','','学号6','姓名6','13823888886',6,'2025-06-30','部门编号6','部门名称6');
/*!40000 ALTER TABLE `jixiaoxinchou` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mianshijilu`
--

DROP TABLE IF EXISTS `mianshijilu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mianshijilu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `mianshibianhao` varchar(200) DEFAULT NULL COMMENT '面试编号',
  `gangweimingcheng` varchar(200) DEFAULT NULL COMMENT '岗位名称',
  `gangweiyaoqiu` varchar(200) DEFAULT NULL COMMENT '岗位要求',
  `mianshiqingkuang` varchar(200) DEFAULT NULL COMMENT '面试情况',
  `mianshishuoming` longtext COMMENT '面试说明',
  `renshu` int(11) DEFAULT NULL COMMENT '人数',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shifoupinkunsheng` varchar(200) DEFAULT NULL COMMENT '是否贫困生',
  `mianshiriqi` date DEFAULT NULL COMMENT '面试日期',
  `bumenbianhao` varchar(200) DEFAULT NULL COMMENT '部门编号',
  `bumenmingcheng` varchar(200) DEFAULT NULL COMMENT '部门名称',
  PRIMARY KEY (`id`),
  UNIQUE KEY `mianshibianhao` (`mianshibianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 COMMENT='面试记录';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mianshijilu`
--

LOCK TABLES `mianshijilu` WRITE;
/*!40000 ALTER TABLE `mianshijilu` DISABLE KEYS */;
INSERT INTO `mianshijilu` VALUES (71,'2025-06-30 08:08:16','1111111111','岗位名称1','岗位要求1','通过面试','面试说明1',1,'学号1','姓名1','是否贫困生1','2025-06-30','部门编号1','部门名称1'),(72,'2025-06-30 08:08:16','2222222222','岗位名称2','岗位要求2','通过面试','面试说明2',2,'学号2','姓名2','是否贫困生2','2025-06-30','部门编号2','部门名称2'),(73,'2025-06-30 08:08:16','3333333333','岗位名称3','岗位要求3','通过面试','面试说明3',3,'学号3','姓名3','是否贫困生3','2025-06-30','部门编号3','部门名称3'),(74,'2025-06-30 08:08:16','4444444444','岗位名称4','岗位要求4','通过面试','面试说明4',4,'学号4','姓名4','是否贫困生4','2025-06-30','部门编号4','部门名称4'),(75,'2025-06-30 08:08:16','5555555555','岗位名称5','岗位要求5','通过面试','面试说明5',5,'学号5','姓名5','是否贫困生5','2025-06-30','部门编号5','部门名称5'),(76,'2025-06-30 08:08:16','6666666666','岗位名称6','岗位要求6','通过面试','面试说明6',6,'学号6','姓名6','是否贫困生6','2025-06-30','部门编号6','部门名称6');
/*!40000 ALTER TABLE `mianshijilu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shenqinggangwei`
--

DROP TABLE IF EXISTS `shenqinggangwei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shenqinggangwei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gangweimingcheng` varchar(200) NOT NULL COMMENT '岗位名称',
  `gangweiyaoqiu` varchar(200) DEFAULT NULL COMMENT '岗位要求',
  `gangweixingzhi` varchar(200) DEFAULT NULL COMMENT '岗位性质',
  `xinzidaiyu` varchar(200) DEFAULT NULL COMMENT '薪资待遇',
  `renshu` int(11) NOT NULL COMMENT '人数',
  `bumenbianhao` varchar(200) DEFAULT NULL COMMENT '部门编号',
  `bumenmingcheng` varchar(200) DEFAULT NULL COMMENT '部门名称',
  `shenqingliyou` longtext COMMENT '申请理由',
  `shenqingjindu` varchar(200) DEFAULT NULL COMMENT '申请进度',
  `shenqingriqi` date DEFAULT NULL COMMENT '申请日期',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `yuanxi` varchar(200) DEFAULT NULL COMMENT '院系',
  `zhuanye` varchar(200) DEFAULT NULL COMMENT '专业',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `shifoupinkunsheng` varchar(200) NOT NULL COMMENT '是否贫困生',
  `crossuserid` bigint(20) DEFAULT NULL COMMENT '跨表用户id',
  `crossrefid` bigint(20) DEFAULT NULL COMMENT '跨表主键id',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='申请岗位';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shenqinggangwei`
--

LOCK TABLES `shenqinggangwei` WRITE;
/*!40000 ALTER TABLE `shenqinggangwei` DISABLE KEYS */;
INSERT INTO `shenqinggangwei` VALUES (61,'2025-06-30 08:08:16','岗位名称1','岗位要求1','岗位性质1','薪资待遇1',1,'部门编号1','部门名称1','申请理由1','已面试','2025-06-30','学号1','姓名1','院系1','专业1','13823888881','是',1,1,'是',''),(62,'2025-06-30 08:08:16','岗位名称2','岗位要求2','岗位性质2','薪资待遇2',1,'部门编号2','部门名称2','申请理由2','已面试','2025-06-30','学号2','姓名2','院系2','专业2','13823888882','是',2,2,'是',''),(63,'2025-06-30 08:08:16','岗位名称3','岗位要求3','岗位性质3','薪资待遇3',1,'部门编号3','部门名称3','申请理由3','已面试','2025-06-30','学号3','姓名3','院系3','专业3','13823888883','是',3,3,'是',''),(64,'2025-06-30 08:08:16','岗位名称4','岗位要求4','岗位性质4','薪资待遇4',1,'部门编号4','部门名称4','申请理由4','已面试','2025-06-30','学号4','姓名4','院系4','专业4','13823888884','是',4,4,'是',''),(65,'2025-06-30 08:08:16','岗位名称5','岗位要求5','岗位性质5','薪资待遇5',1,'部门编号5','部门名称5','申请理由5','已面试','2025-06-30','学号5','姓名5','院系5','专业5','13823888885','是',5,5,'是',''),(66,'2025-06-30 08:08:16','岗位名称6','岗位要求6','岗位性质6','薪资待遇6',1,'部门编号6','部门名称6','申请理由6','已面试','2025-06-30','学号6','姓名6','院系6','专业6','13823888886','是',6,6,'是','');
/*!40000 ALTER TABLE `shenqinggangwei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2025-06-30 08:08:16');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xuesheng`
--

DROP TABLE IF EXISTS `xuesheng`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xuesheng` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xuehao` varchar(200) NOT NULL COMMENT '学号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `yuanxi` varchar(200) DEFAULT NULL COMMENT '院系',
  `zhuanye` varchar(200) DEFAULT NULL COMMENT '专业',
  `chushengriqi` date DEFAULT NULL COMMENT '出生日期',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xuehao` (`xuehao`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='学生';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xuesheng`
--

LOCK TABLES `xuesheng` WRITE;
/*!40000 ALTER TABLE `xuesheng` DISABLE KEYS */;
INSERT INTO `xuesheng` VALUES (31,'2025-06-30 08:08:16','学号1','123456','姓名1','男','13823888881','院系1','专业1','2025-06-30'),(32,'2025-06-30 08:08:16','学号2','123456','姓名2','男','13823888882','院系2','专业2','2025-06-30'),(33,'2025-06-30 08:08:16','学号3','123456','姓名3','男','13823888883','院系3','专业3','2025-06-30'),(34,'2025-06-30 08:08:16','学号4','123456','姓名4','男','13823888884','院系4','专业4','2025-06-30'),(35,'2025-06-30 08:08:16','学号5','123456','姓名5','男','13823888885','院系5','专业5','2025-06-30'),(36,'2025-06-30 08:08:16','学号6','123456','姓名6','男','13823888886','院系6','专业6','2025-06-30');
/*!40000 ALTER TABLE `xuesheng` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonggongbumen`
--

DROP TABLE IF EXISTS `yonggongbumen`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonggongbumen` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bumenbianhao` varchar(200) NOT NULL COMMENT '部门编号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `bumenmingcheng` varchar(200) NOT NULL COMMENT '部门名称',
  `bumentupian` varchar(200) DEFAULT NULL COMMENT '部门图片',
  `bangongdidian` varchar(200) DEFAULT NULL COMMENT '办公地点',
  `fuzejiaoshi` varchar(200) DEFAULT NULL COMMENT '负责教师',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  PRIMARY KEY (`id`),
  UNIQUE KEY `bumenbianhao` (`bumenbianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='用工部门';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonggongbumen`
--

LOCK TABLES `yonggongbumen` WRITE;
/*!40000 ALTER TABLE `yonggongbumen` DISABLE KEYS */;
INSERT INTO `yonggongbumen` VALUES (41,'2025-06-30 08:08:16','部门编号1','123456','部门名称1','upload/yonggongbumen_bumentupian1.jpg','办公地点1','负责教师1','13823888881'),(42,'2025-06-30 08:08:16','部门编号2','123456','部门名称2','upload/yonggongbumen_bumentupian2.jpg','办公地点2','负责教师2','13823888882'),(43,'2025-06-30 08:08:16','部门编号3','123456','部门名称3','upload/yonggongbumen_bumentupian3.jpg','办公地点3','负责教师3','13823888883'),(44,'2025-06-30 08:08:16','部门编号4','123456','部门名称4','upload/yonggongbumen_bumentupian4.jpg','办公地点4','负责教师4','13823888884'),(45,'2025-06-30 08:08:16','部门编号5','123456','部门名称5','upload/yonggongbumen_bumentupian5.jpg','办公地点5','负责教师5','13823888885'),(46,'2025-06-30 08:08:16','部门编号6','123456','部门名称6','upload/yonggongbumen_bumentupian6.jpg','办公地点6','负责教师6','13823888886');
/*!40000 ALTER TABLE `yonggongbumen` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yuanxi`
--

DROP TABLE IF EXISTS `yuanxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yuanxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuanxi` varchar(200) NOT NULL COMMENT '院系',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yuanxi` (`yuanxi`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='院系';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yuanxi`
--

LOCK TABLES `yuanxi` WRITE;
/*!40000 ALTER TABLE `yuanxi` DISABLE KEYS */;
INSERT INTO `yuanxi` VALUES (11,'2025-06-30 08:08:16','院系1'),(12,'2025-06-30 08:08:16','院系2'),(13,'2025-06-30 08:08:16','院系3'),(14,'2025-06-30 08:08:16','院系4'),(15,'2025-06-30 08:08:16','院系5'),(16,'2025-06-30 08:08:16','院系6');
/*!40000 ALTER TABLE `yuanxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhuanye`
--

DROP TABLE IF EXISTS `zhuanye`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhuanye` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuanxi` varchar(200) DEFAULT NULL COMMENT '院系',
  `zhuanye` varchar(200) NOT NULL COMMENT '专业',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhuanye` (`zhuanye`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='专业';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhuanye`
--

LOCK TABLES `zhuanye` WRITE;
/*!40000 ALTER TABLE `zhuanye` DISABLE KEYS */;
INSERT INTO `zhuanye` VALUES (21,'2025-06-30 08:08:16','院系1','专业1'),(22,'2025-06-30 08:08:16','院系2','专业2'),(23,'2025-06-30 08:08:16','院系3','专业3'),(24,'2025-06-30 08:08:16','院系4','专业4'),(25,'2025-06-30 08:08:16','院系5','专业5'),(26,'2025-06-30 08:08:16','院系6','专业6');
/*!40000 ALTER TABLE `zhuanye` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

