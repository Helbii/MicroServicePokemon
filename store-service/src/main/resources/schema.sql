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
                    price INTEGER NOT NULL,
                    creation_date DATETIME NOT NULL,
                    due_time INT NOT NULL
);

