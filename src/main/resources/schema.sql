create table reviews
(
 review_id varchar(36) not null,
 user_id varchar(36) not null,
 title varchar(100),
 description varchar(350),
 rating integer
);
create table users
(
 user_id varchar(36) not null,
 user_name varchar(60) not null,
 first_name varchar(60) not null
);