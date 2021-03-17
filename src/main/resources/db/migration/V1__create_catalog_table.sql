CREATE TABLE catalog
(
     sku          VARCHAR(32) NOT NULL,
     title       VARCHAR(255) NOT NULL,
     price       DECIMAL NOT NULL,
     PRIMARY KEY (sku)
  );