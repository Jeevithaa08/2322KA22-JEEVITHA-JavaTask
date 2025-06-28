use Day08;
CREATE TABLE Department (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50)
);

CREATE TABLE Employee (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    salary DECIMAL(10,2),
    dept_id INT,
    FOREIGN KEY (dept_id) REFERENCES Department(dept_id)
);

INSERT INTO Department VALUES (1, 'HR');
INSERT INTO Department VALUES (2, 'IT');
INSERT INTO Department VALUES (3, 'Finance');

INSERT INTO Employee VALUES (101, 'Anu', 35000.00, 2);
INSERT INTO Employee VALUES (102, 'Vikram', 40000.00, 3);
INSERT INTO Employee VALUES (103, 'Divya', 32000.00, 1);
INSERT INTO Employee VALUES (104, 'Karan', 50000.00, 2);
INSERT INTO Employee VALUES (105, 'Neha', 37000.00, 3);