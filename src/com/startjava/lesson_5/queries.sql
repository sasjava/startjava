\echo �������� ��� �������
SELECT * FROM jaegers;

\echo ���������� ������ �� ������������ �������
SELECT * FROM jaegers WHERE status <> 'Destroyed';

\echo ���������� ������� ���������� �����: Mark-1 � Mark-4
SELECT * FROM jaegers WHERE mark IN ('Mark-1', 'Mark-4');

\echo ���������� ���� �������, ����� Mark-1 � Mark-4
SELECT * FROM jaegers WHERE mark NOT IN ('Mark-1', 'Mark-4');

\echo ������������ ������� �� �������� �� ������� mark
SELECT * FROM jaegers ORDER BY mark;

\echo ���������� ���������� � ����� ������ ������
SELECT * FROM jaegers ORDER BY launch ASC LIMIT 1;

\echo ���������� �������, ������� ���������� ������ ���� kaiju
SELECT * FROM jaegers WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM jaegers);

\echo ���������� ������� ��� �������
SELECT AVG(weight) FROM jaegers;

\echo ��������� �� ������� ���������� ������������ kaiju � �������, ������� �� ��� ��� �� ���������
UPDATE jaegers SET kaijuKill = kaijuKill + 1 WHERE status <> 'Destroyed';

\echo ������� ������������ �������
DELETE FROM jaegers WHERE status = 'Destroyed';
