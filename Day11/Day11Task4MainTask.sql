use Day11;
CREATE TABLE sales (
    sale_id INT PRIMARY KEY,
    product_id INT,
    quantity INT
);

INSERT INTO sales (sale_id, product_id, quantity) VALUES
(1, 1, 5),
(2, 2, 10),
(3, 1, 2),
(4, 4, 7);
SELECT product_id, SUM(quantity) AS total_sold FROM sales GROUP BY product_id;