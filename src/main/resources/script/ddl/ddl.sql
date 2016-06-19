CREATE DATABASE sinau_hibernate;

use sinau_hibernate;

create table EMPLOYEE (
   id BIGINT NOT NULL auto_increment,
   first_name VARCHAR(20) default NULL,
   salary     DECIMAL  default NULL,
   PRIMARY KEY (id)
);

create table ADDRESS (
   id BIGINT NOT NULL,
   street_name VARCHAR(40) default NULL,
   city_name VARCHAR(40) default NULL,
   state_name VARCHAR(40) default NULL,
   zipcode VARCHAR(10) default NULL,
   CONSTRAINT FK_EMPLOYEE FOREIGN KEY (id) REFERENCES employee(id)
);

CREATE TABLE DEPARTMENT(
	id bigint not null,
    department varchar(128) not null,
    primary key(id)
);

alter table employee add column department_id bigint not null;

alter table employee add constraint fk_department_employee foreign key(department_id) references DEPARTMENT(id);
