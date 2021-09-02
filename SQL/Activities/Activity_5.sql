REM   Script: Activity_5
REM   updating the data in the salesman table

SELECT * FROM salesman;

SELECT * FROM salesman where SALESMAN_CITY = 'Rome';

update salesman set GRADE = 200 where SALESMAN_CITY = 'Rome';

UPDATE salesman SET grade=300 WHERE salesman_name='James Hoog';

UPDATE salesman SET salesman_name='Pierre' WHERE salesman_name='McLyon';

SELECT * FROM salesman;

