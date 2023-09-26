-- 1
SELECT *
FROM student
WHERE age = 20;
--2
SELECT DISTINCT marks
FROM student
ORDER BY marks DESC
    LIMIT 1 OFFSET 1;
--3
SELECT *
FROM student
WHERE name LIKE 'R%';

--4
SELECT DISTINCT marks
FROM student
ORDER BY marks ASC
    LIMIT 3;
