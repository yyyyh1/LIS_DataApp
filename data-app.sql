drop table  if exists user;
create table user (
                      id bigint(20) NOT NULL AUTO_INCREMENT,
                      name varchar(100) not null ,
                      age int,
                      title varchar(100) not null ,
                      hometown varchar(200),
                      PRIMARY KEY (`id`) USING BTREE
)