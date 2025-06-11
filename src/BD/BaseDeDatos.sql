/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  domin
 * Created: 06/10/2025
 */

CREATE DATABASE software_ingenieria;
USE software_ingenieria;


CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
   
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    email VARCHAR(100),
    
  
    usuario VARCHAR(30) NOT NULL UNIQUE,
    clave VARCHAR(100) NOT NULL,
    
   
    rol ENUM('administrador', 'usuario', 'moderador') NOT NULL DEFAULT 'usuario',
    ultimo_acceso DATETIME NULL,
    
    fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  
    INDEX idx_usuario (usuario)
);


INSERT INTO usuarios (
    nombre, 
    apellido, 
    email, 
    usuario, 
    clave, 
    rol
) VALUES (
    'Francisco',
    'Dominguez',
    'admin@empresa.com',
    'admin',
    'admin', 
    'administrador'
);