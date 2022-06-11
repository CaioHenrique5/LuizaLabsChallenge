create table testdb.communication(
id int NOT NULL AUTO_INCREMENT primary key,
type varchar(255) NOT NULL,
sendTime Date,
destination varchar(255) NOT NULL,
message varchar(255) NOT NULL);