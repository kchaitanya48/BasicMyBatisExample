https://www.javacodegeeks.com/2012/11/mybatis-tutorial-crud-operations-and-mapping-relationships-part-1.html

=================================================================

CREATE TABLE  user (
  user_id int(10) unsigned NOT NULL auto_increment,
  email_id varchar(45) NOT NULL,
  password varchar(45) NOT NULL,
  first_name varchar(45) NOT NULL,
  last_name varchar(45) default NULL,
  PRIMARY KEY  (user_id),
  UNIQUE KEY Index_2_email_uniq (email_id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

====================================================================

CREATE TABLE  blog (
  blog_id int(10) unsigned NOT NULL auto_increment,
  blog_name varchar(45) NOT NULL,
  created_on datetime NOT NULL,
  PRIMARY KEY  (blog_id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



====================================================================

CREATE TABLE details.student(
   ID int(10) NOT NULL AUTO_INCREMENT,
   NAME varchar(100) NOT NULL,
   BRANCH varchar(255) NOT NULL,
   PERCENTAGE int(3) NOT NULL,
   PHONE int(11) NOT NULL,
   EMAIL varchar(255) NOT NULL,
   PRIMARY KEY (`ID`)
);

=======================================================
https://www.tutorialspoint.com/mybatis/mybatis_stored_procedures.htm
DELIMITER //
   DROP PROCEDURE IF EXISTS details.read_recordById //
   CREATE PROCEDURE details.read_recordById (IN emp_id INT)
	
   BEGIN 
      SELECT * FROM STUDENT WHERE ID = emp_id; 
   END// 
	
DELIMITER ;

================================