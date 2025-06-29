use Day11;
CREATE TABLE emp (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    department VARCHAR(50),
    salary INT
);

INSERT INTO emp (id, name, department, salary) VALUES
(1, 'Anu', 'HR', 30000),
(2, 'Ravi', 'Finance', 40000),
(3, 'Sneha', 'HR', 32000),
(4, 'Raj', 'IT', 50000),
(5, 'Priya', 'IT', 55000),
(6, 'Kumar', 'Finance', 45000);

SELECT department, 
       COUNT(*) AS total_employees, 
       AVG(salary) AS average_salary
FROM emp
GROUP BY department;