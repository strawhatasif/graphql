CREATE TABLE users
(
 user_id VARCHAR(36) PRIMARY KEY NOT NULL,
 user_name VARCHAR(60) NOT NULL,
 first_name VARCHAR(60) NOT NULL
);
create table reviews
(
 review_id VARCHAR(36) NOT NULL,
 user_id VARCHAR(36) NOT NULL,
 title VARCHAR(100),
 description VARCHAR(350),
 rating INTEGER
);
