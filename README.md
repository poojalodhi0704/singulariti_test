# singulariti_test

Running the Application 
 Database
1. Username = root
2. Password = password
3. Create database name = singulariti
4. Sql squery :-

DROP TABLE IF EXISTS `singularity_test`;
CREATE TABLE `singularity_test`(
  `id` VARCHAR(36) NOT NULL,
  `country` VARCHAR(150) DEFAULT NULL,
  `player` VARCHAR(150) DEFAULT NULL,
   PRIMARY KEY(`id`)
)ENGINE=InnoDB;
Backend
   1.Install jdk 
   2.comile project mvn clean install
   3.Run project ?
           1.Go to directory base-ws
           2.Run mvn jetty:run 
 Frontend
1. Install Node.js
2. Run npm install to install app dependencies
3. Run npm start 
4. Run npm run lite
5. Go to http://localhost:3000
