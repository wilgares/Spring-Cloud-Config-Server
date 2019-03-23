# Spring-Cloud-Config-Server
Leer properties desde un repositorio git de acuerdo a un profile


## 1.- configurar el properties del proyecto server con la URL donde esta guardados tus properties
spring.cloud.config.server.git.uri=https://github.com/wilgares/Spring-Cloud-Config-Server

## 2.- ingresar a la carptea server y levantar el servidor 
    mvn spring-boot:run
   (se levanta en el puerto 80)
   
## 3.- Configurar el bootstrap.properties del cliente
    spring.application.name=xxx    <--- nombre de la aplicacion del properties
	 spring.profiles.active=development    <-- perfil del aplicativo (desa,cert,prod..etc)
	 spring.cloud.config.uri=http://localhost:8888   <-- url del server

## 4.-ingresar a la carpeta client y arracar el cliente
    mvn spring-boot:run
    
## 5.- abrir un explorador de internet

    http://localhost:8888/xxx/development/master    <--OK
    http://localhost:8888/xxx/production/master    <-- no existe el perfil production
      

