CREATE database meuBanco;
use meuBanco;

CREATE USER andreia identified by 'poo2';
GRANT ALL PRIVILEGES ON meuBanco to 'andreia';
flush privileges;