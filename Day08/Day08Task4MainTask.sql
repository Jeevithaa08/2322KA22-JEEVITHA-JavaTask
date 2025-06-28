use Day08Tasks;
CREATE TABLE Book (
    book_id INT PRIMARY KEY,
    title VARCHAR(100),
    author VARCHAR(50)
);

CREATE TABLE Member (
    member_id INT PRIMARY KEY,
    member_name VARCHAR(50),
    contact VARCHAR(15)
);

CREATE TABLE Borrow (
    borrow_id INT PRIMARY KEY,
    member_id INT,
    book_id INT,
    borrow_date DATE,
    FOREIGN KEY (member_id) REFERENCES Member(member_id),
    FOREIGN KEY (book_id) REFERENCES Book(book_id)
);

INSERT INTO Book VALUES (1, 'Java Basics', 'James Gosling');
INSERT INTO Book VALUES (2, 'Python 101', 'Guido van Rossum');
INSERT INTO Book VALUES (3, 'C++ Guide', 'Bjarne Stroustrup');

INSERT INTO Member VALUES (1, 'Anu', '9876543210');
INSERT INTO Member VALUES (2, 'priya', '9123456780');
INSERT INTO Member VALUES (3, 'Sneha', '9998887776');

INSERT INTO Borrow VALUES (1, 1, 2, '2025-06-20');
INSERT INTO Borrow VALUES (2, 2, 1, '2025-06-21');
INSERT INTO Borrow VALUES (3, 3, 3, '2025-06-22');
