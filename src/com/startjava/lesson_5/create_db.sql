CREATE DATABASE Jaegers;
\c jaegers;
CREATE TABLE jaegers(
id serial, 
modelName text, 
mark text, 
height real, 
weight real, 
status text, 
origin text, 
launch date, 
kaijuKill int);

\ir init_db.sql
\ir queries.sql