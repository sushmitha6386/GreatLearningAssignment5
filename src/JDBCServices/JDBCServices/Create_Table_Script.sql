CREATE TABLE user (
    user_id int(11) NOT NULL AUTO_INCREMENT,
    first_name varchar(45) NOT NULL,
    last_name varchar(45) NOT NULL,    
    email_address varchar(45) NOT NULL,
    PRIMARY KEY (`user_id`)
);