create database coviz;

\c coviz;

create table countries
(
  date  date,
  country  text,
  confirmed  real,
  recovered  real,
  deaths  real
);

\copy countries from 'data/countries.csv' with delimiter ',' CSV HEADER;

