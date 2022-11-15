CREATE DATABASE IF NOT EXISTS `cruise_company`;
USE `cruise_company`;

CREATE TABLE IF NOT EXISTS `roles` (
    `code` varchar(50) PRIMARY KEY NOT NULL,
    `name` varchar(255) NOT NULL
    );

CREATE TABLE IF NOT EXISTS `cruise` (
    `id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    `name` varchar(255) NOT NULL,
    `start` datetime NOT NULL,
    `duration` time NOT NULL,
    `passengers_capacity` int NOT NULL
    );

CREATE TABLE IF NOT EXISTS `stuff` (
    `id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    `name` varchar(255) NOT NULL,
    `surname` varchar(255) NOT NULL,
    `position` varchar(255) NOT NULL,
    `cruise_id` int NOT NULL,
    CONSTRAINT `cruise_idx` FOREIGN KEY (`cruise_id`) REFERENCES `cruise`(`id`)
    );

CREATE TABLE IF NOT EXISTS `users` (
    `id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    `name` varchar(255) NOT NULL,
    `surname` varchar(255) NOT NULL,
    `email` varchar(255) NOT NULL,
    `password` varchar(255) NOT NULL,
    `role_id` varchar(50) NOT NULL,
    `wallet` int,
    `has_document` bool,
    CONSTRAINT `user_role_idx` FOREIGN KEY (`role_id`) REFERENCES `roles`(`code`)
    );

CREATE TABLE IF NOT EXISTS `status` (
    `status` varchar(50) PRIMARY KEY NOT NULL
    );

CREATE TABLE IF NOT EXISTS `tickets` (
    `id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    `price` decimal(15,2) NOT NULL,
    `status_id` varchar(50) NOT NULL,
    `user_id` int,
    `cruise_id` int NOT NULL,
    CONSTRAINT `status_idx` FOREIGN KEY (`status_id`) REFERENCES `status`(`status`),
    CONSTRAINT `user_idx` FOREIGN KEY (`user_id`) REFERENCES `users`(`id`),
    CONSTRAINT `cruise_tickets_idx` FOREIGN KEY (`cruise_id`) REFERENCES `cruise`(`id`)
    );

CREATE TABLE IF NOT EXISTS `ports` (
    `id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    `name` varchar(255) NOT NULL,
    `arrival_time` datetime NOT NULL,
    `departure_time` datetime NOT NULL
    );

CREATE TABLE IF NOT EXISTS `cruise_ports` (
    `cruise_id` int NOT NULL,
    `port_id` int NOT NULL,
    PRIMARY KEY(`cruise_id`, `port_id`),
    CONSTRAINT `cruise_ports_idx` FOREIGN KEY (`cruise_id`) REFERENCES `cruise`(`id`),
    CONSTRAINT `port_idx` FOREIGN KEY (`port_id`) REFERENCES `ports`(`id`)
    );