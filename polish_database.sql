CREATE DATABASE polish;
USE polish;

CREATE TABLE brands(
brand_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
brand_name VARCHAR(50) NOT NULL,
vegan BOOLEAN,
cruelty_free BOOLEAN,
website VARCHAR(250)
);

CREATE TABLE polishes(
polish_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
brand_name VARCHAR(50) NOT NULL,
polish_name VARCHAR(50) NOT NULL,
color1 VARCHAR(50) NOT NULL,
color2 VARCHAR(50),
color3 VARCHAR(50),
finish1 VARCHAR(50) NOT NULL,
finish2 VARCHAR(50),
finish3 VARCHAR(50),
limited_edition BOOLEAN
);

INSERT INTO brands (brand_name, vegan, cruelty_free, website)
VALUES ('OPI', FALSE, FALSE, 'https://www.opi.com');
INSERT INTO brands (brand_name, vegan, cruelty_free, website)
VALUES ('Loud Lacquer', TRUE, TRUE, 'https://www.loudlacquer.com');
INSERT INTO brands (brand_name, vegan, cruelty_free, website)
VALUES ('Cirque Colors', TRUE, TRUE, 'https://www.cirquecolors.com');

INSERT INTO polishes (brand_name, polish_name, color1, finish1, limited_edition)
VALUES ('OPI', 'Thank Glogg Its Friday!', 'Red', 'Shimmer', TRUE );
INSERT INTO polishes (brand_name, polish_name, color1, finish1, limited_edition)
VALUES ('OPI', 'Suzi Loves Cowboys', 'Brown', 'Creme', TRUE);
INSERT INTO polishes (brand_name, polish_name, color1, finish1, finish2, limited_edition)
VALUES ('Cirque Colors', 'Retail Therapy', 'Pink', 'Creme', 'Neon', TRUE);
INSERT INTO polishes (brand_name, polish_name, color1, finish1, finish2, limited_edition)
VALUES ('Cirque Colors', 'La Vie En Rose', 'Pink', 'Thermal', 'Shimmer', TRUE);
INSERT INTO polishes (brand_name, polish_name, color1, finish1, finish2, finish3, limited_edition)
VALUES ('Cirque Colors', 'Black Magic', 'Monochrome', 'Iridescent', 'Jelly', 'Multicolor', TRUE);
INSERT INTO polishes (brand_name, polish_name, color1, color2, finish1, limited_edition)
VALUES ('Loud Lacquer', 'Stephie', 'Pink', 'White', 'Topper',  FALSE);
INSERT INTO polishes (brand_name, polish_name, color1, finish1, limited_edition)
VALUES ('Loud Lacquer', 'Basic', 'White', 'Creme', FALSE);

SELECT * FROM brands;
SELECT * FROM polishes;

