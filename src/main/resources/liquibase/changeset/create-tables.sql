--liquibase formatted sql

--changeset create-test-table:1
create table if not exists test
(
    id bigint primary key auto_increment,
    name varchar(255) not null unique,
    description varchar(255) not null unique
);



