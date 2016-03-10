
/**
 创建用户的数据表的字段
 */
create table user_t(
  id int not null auto_increment,
  user_name char(20) not null,
  password char(50) null,
  age int not null,
  primary key(id)
);
