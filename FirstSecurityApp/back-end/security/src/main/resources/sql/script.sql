create table users(
                      id int not null auto_increment primary key ,
                      username varchar(50) not null,
                      password varchar(255) not null,
                      enabled int not null
);

create table authorities (
                             id int not null auto_increment primary key ,
                             username varchar(50) not null,
                             authority varchar(50) not null
);

insert into users values (null, 'happy', '12345', '1');
insert into authorities values (null, 'happy', 'write');


create table customer(
                         id int not null auto_increment primary key,
                         email varchar(45) not null,
                         pwd varchar(255) not null,
                         role varchar(45) not null
);

insert into customer (email, pwd, role) VALUES ('admin@gmail.com', 'admin', 'admin');

