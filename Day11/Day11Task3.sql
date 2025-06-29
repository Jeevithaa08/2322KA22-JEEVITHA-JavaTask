use Day11;
CREATE TABLE products (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    price INT
);

INSERT INTO products (id, name, price) VALUES
(1, 'Laptop', 55000),
(2, 'Mouse', 500),
(3, 'Monitor', 15000),
(4, 'Keyboard', 1500);
SELECT MAX(price) AS max_price, MIN(price) AS min_price FROM products;