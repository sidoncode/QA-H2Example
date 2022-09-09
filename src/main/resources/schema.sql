DROP TABLE IF EXISTS CITY;
CREATE TABLE CITY (
    ID int NOT NULL,
    city_code varchar(255) NOT NULL,
    city_name varchar(255),
    city_pincode int
);

CREATE TABLE STUDENT (
    id int NOT NULL,
    name varchar(255) NOT NULL,
    age int,
    email varchar(255)
);

