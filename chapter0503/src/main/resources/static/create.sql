create database `chapter05` default character set utf8;
use `chapter05`;
create table `book`(
    `id` int(11) not null auto_increment,
    `name` varchar (128) default null ,
    `author` varchar (64) default null ,
    primary key (`id`)
) engine =innodb default charset =utf8;

create database `jpa` default character set utf8;
创建数据库 不需要创建表
Step 1: From your project repository, bring in the changes and test.

git fetch origin
git checkout -b feature-A origin/feature-A
git merge master
Step 2: Merge the changes and update on GitHub.

git checkout master
git merge --no-ff feature-A
git push origin master
