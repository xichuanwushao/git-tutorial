create database `chapter05-1` default character set utf8;
use `chapter05-1`;
create table `book`(
    `id` int(11) not null auto_increment,
    `name` varchar (128) default null ,
    `author` varchar (64) default null ,
    primary key (`id`)
) engine =innodb default charset =utf8;

insert into `book` (`id`,`name`,`author`) values (1,'三国演义','罗贯中');
insert into `book` (`id`,`name`,`author`) values (2,'西游记','吴承恩');

create database `chapter05-2` default character set utf8;
use `chapter05-2`;
create table `book`(
    `id` int(11) not null auto_increment,
    `name` varchar (128) default null ,
    `author` varchar (64) default null ,
    primary key (`id`)
) engine =innodb default charset =utf8;

insert into `book` (`id`,`name`,`author`) values (1,'三国演义','罗贯中');
insert into `book` (`id`,`name`,`author`) values (2,'西游记','吴承恩');