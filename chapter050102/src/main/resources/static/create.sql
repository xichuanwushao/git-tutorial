create database `chapter05` default character set utf8;
use `chapter05`;
create table `book`(
    `id` int(11) not null auto_increment,
    `name` varchar (128) default null ,
    `author` varchar (64) default null ,
    primary key (`id`)
) engine =innodb default charset =utf8;

