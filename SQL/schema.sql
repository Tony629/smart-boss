CREATE SCHEMA IF NOT EXISTS `smart-boss` DEFAULT CHARACTER SET utf8 ;

USE `smart-boss`;

/**
简历表
**/
CREATE TABLE IF NOT EXISTS `smart-boss`.`Profile` (
  `ProfileId` VARCHAR(36),
  `Name` VARCHAR(100) NOT NULL,
  `Gender` CHAR(1) NOT NULL,
  `WorkYear` INT,
  `Age` INT,
  `PositionApplied` VARCHAR(36),
  `Email` VARCHAR(200),
  `University` VARCHAR(200),
  `Phone` VARCHAR(20),
  `Wechat` VARCHAR(20),
  `Degree` VARCHAR(20),
  `Skills` TEXT,
  `ProjectExperience` TEXT,
  PRIMARY KEY (`ProfileId`))
ENGINE = InnoDB;


/***
面试意见
**/
CREATE TABLE IF NOT EXISTS `smart-boss`.`Intrview`(
    `Id` VARCHAR(36),
    `ProfileId` VARCHAR(36),
    `Comments` VARCHAR(300),
    `CreateDate` DATETIME,
    PRIMARY KEY(`Id`))
ENGINE = InnoDB;

/**
上传附件（简历-pdf excel）
**/
CREATE TABLE IF NOT EXISTS `smart-boss`.`Attachment`(
    `Id` VARCHAR(36),
    `ProfileId` VARCHAR(36),
    `FileName` VARCHAR(300),
    `Alias` VARCHAR(80),
    `Suffix` VARCHAR(10),
    `Content` TEXT,
    PRIMARY KEY(`Id`))
ENGINE = InnoDB;

/**
系统用户表
**/
CREATE TABLE IF NOT EXISTS `smart-boss`.`SysUser`(
    `Id` VARCHAR(36),
    `Name` VARCHAR(36),
    `NickName` VARCHAR(36),
    `Password` VARCHAR(125),
    `CreateDate` DATETIME,
    PRIMARY KEY(`Id`))
ENGINE = InnoDB;


