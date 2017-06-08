# singulariti_test dev environment setup

Running the Application
 Database
1. Create database name = singulariti
2. Sql squery :-

CREATE DATABASE singulariti;

DROP TABLE IF EXISTS `singularity_test`;
CREATE TABLE `singulariti_test`(
  `id` VARCHAR(36) NOT NULL,
  `country` VARCHAR(150) DEFAULT NULL,
  `player` VARCHAR(150) DEFAULT NULL,
   PRIMARY KEY(`id`)
)ENGINE=InnoDB;

Backend
   1.Install jdk(8)
   2.comile projecti: 
        a.cd to singulariti_test_backend/singulariti_test
        b.Run mvn clean install
        c.cd to singulariti_test_backend/singulariti_test/scripts
        d.copy the property file singulariti.properties to location {{user.home}}/property_files/
   3.Run project 
           1.Go to directory base-ws(This directory hosts the webservices)
           2.Run mvn jetty:run
 Frontend
1. Install Node.js and npm
2. Run npm install to install app dependencies
3. Run npm start
4. Run npm run lite
5. Go to http://localhost:3000