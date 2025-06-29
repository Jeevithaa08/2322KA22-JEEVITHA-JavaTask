use Day11;
CREATE TABLE employees (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    department VARCHAR(50),
    salary INT
);

INSERT INTO employees (id, name, department, salary) VALUES
(1, 'Anu', 'HR', 30000),
(2, 'Ravi', 'Finance', 40000),
(3, 'Sneha', 'HR', 32000),
(4, 'Raj', 'IT', 50000),
(5, 'Priya', 'IT', 55000);
SELECT department, AVG(salary) AS avg_salary FROM employees GROUP BY department;