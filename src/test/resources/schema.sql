drop table if exists user;
create table user
(
    user_key int auto_increment not null,
    name     varchar(200) not null,
    constraint user primary key (user_key),
)engine=innodb;