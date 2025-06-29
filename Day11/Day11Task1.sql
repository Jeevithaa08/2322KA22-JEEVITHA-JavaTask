use Day11;
CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    course_id INT
);

INSERT INTO students (id, name, course_id) VALUES
(1, 'Jeevitha', 101),
(2, 'Arun', 101),
(3, 'Meera', 102),
(4, 'Kiran', 101),
(5, 'Divya', 103);
SELECT course_id, COUNT(*) AS total_students FROM students GROUP BY course_id;
