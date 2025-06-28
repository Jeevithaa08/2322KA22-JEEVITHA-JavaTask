
use Day08Tasks;
-- Student Table
CREATE TABLE Student (
    student_id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    course_id INT
);
CREATE TABLE Course (
    course_id INT PRIMARY KEY,
    course_name VARCHAR(50),
    fee DECIMAL(10, 2)
);
