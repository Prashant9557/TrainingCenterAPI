# TrainingCenterAPI
This is Spring Boot Rest API for managing training centers. it provides endpoints to create, retreive, update, and delete training centers with MySQL as the databases.

PROJECT SETUP 
 * Prerequistites
   make sure
   1. Java 21
   2. Maven (Build Tool)
   3. MySQL Server (Database)

CLONE REPOSITORY
   git clone https://github.com/Prashant9557/TrainingCenterAPI.git
   cd TrainingCenterAPI

CONFIGURE THE DATABASE (in MYSQL)
   CREATE DATABASE training_center_db; 
   
 Update the application.properties
   spring.datasource.url=jdbc:mysql://localhost:3306/training_center_db
   spring.datasource.username=root
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

  BUILD AND RUN
    mvn clean install
    mvn spring-boot:run
