http://www.sivalabs.in/2012/10/mybatis-tutorial-part1-crud-operations.html
my.cnf
[mysqld]
..
lower_case_table_names=1

CREATE TABLE  USER (
  user_id int(10) unsigned NOT NULL auto_increment,
  email_id varchar(45) NOT NULL,
  password varchar(45) NOT NULL,
  first_name varchar(45) NOT NULL,
  last_name varchar(45) default NULL,
  PRIMARY KEY  (user_id),
  UNIQUE KEY Index_2_email_uniq (email_id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;