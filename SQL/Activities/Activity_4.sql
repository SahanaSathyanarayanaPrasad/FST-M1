REM   Script: Activity_4
REM   Alter table and update column

ALTER TABLE salesman ADD grade int;

describe salesman


UPDATE salesman SET grade=100;

SELECT * FROM salesman;

