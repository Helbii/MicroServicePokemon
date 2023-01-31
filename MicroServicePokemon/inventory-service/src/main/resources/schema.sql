DROP TABLE IF EXISTS EGG;
CREATE SEQUENCE "EGG_SEQ"
  MINVALUE 1
  MAXVALUE 999999999
  INCREMENT BY 1
  START WITH 1
  NOCACHE
    NOCYCLE;

CREATE TABLE EGGS (
                    id BIGINT NOT NULL DEFAULT nextval('EGG_SEQ') PRIMARY KEY,
                    eggs VARCHAR(20) NOT NULL,
                    price INTEGER NOT NULL,
                    creation_date DATETIME NOT NULL,
                    due_date DATETIME NOT NULL

);

DROP TABLE IF EXISTS UserH2;
CREATE SEQUENCE "USERS_SEQ"
  MINVALUE 1
  MAXVALUE 999999999
  INCREMENT BY 1
  START WITH 1
  NOCACHE
  NOCYCLE;

CREATE TABLE UserH2 (
                      id BIGINT NOT NULL DEFAULT nextval('USERS_SEQ') PRIMARY KEY,
                      name VARCHAR(50) NOT NULL,
                      experience INTEGER NOT NULL,
                      gold INTEGER NOT NULL,
                      levels INTEGER NOT NULL
);
