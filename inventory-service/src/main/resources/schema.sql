DROP TABLE IF EXISTS EGGS;
CREATE SEQUENCE "EGG_SEQ"
  MINVALUE 1
  MAXVALUE 999999999
  INCREMENT BY 1
  START WITH 1
  NOCACHE
    NOCYCLE;

CREATE TABLE EGGS (
                    id BIGINT NOT NULL DEFAULT nextval('EGG_SEQ') PRIMARY KEY,
                    name VARCHAR(20) NOT NULL,
                    price INTEGER NOT NULL
);
DROP TABLE IF EXISTS POKEMON;
CREATE SEQUENCE "POKEMON_SEQ"
    MINVALUE 1
    MAXVALUE 999999999
    INCREMENT BY 1
    START WITH 1
    NOCACHE
    NOCYCLE;

CREATE TABLE POKEMON (
                      id BIGINT NOT NULL DEFAULT nextval('POKEMON_SEQ') PRIMARY KEY,
                      name VARCHAR(20) NOT NULL,
                      xp INTEGER NOT NULL,
                      type VARCHAR(20) NOT NULL,
                      life_point INTEGER NOT NULL,
                      combat_point INTEGER NOT NULL
);



