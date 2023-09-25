# ���̺� ��ȸ
show tables; -- ��ü ���̺� ��ȸ
select * from test01; -- test01 ��ȸ
desc test01; -- ���̺� ���� Ȯ��

-- insert
insert into test01 (name,age) values ('kim',40);
-- num �� null ���� �ָ� null �� ���°� �ƴ϶� auto ���ڰ� �߻��ȴ�
insert into test01 values (null,'son',26,189.9,now(),'2023-01-01');

-- ���̺� ���� ����(add ,drop column,modify, rename column)
alter table test01 add hp varchar(20) default '010-111-1111'; -- �÷� �߰�
alter table test01 drop column age;-- age �÷� ����
alter table test01 rename column birthday to birth; -- �÷��� ����

-- ���̺�� �����̵�  test01�� member �� ����
alter table test01 rename member;

-- sawon ���̺� ����-�������ǵ鵵 �߰��ϱ�
create table sawon (
              num smallint auto_increment,
              name varchar(20),
              score smallint,
              gender varchar(10),
              buseo varchar(10),
              constraint pk_sawon_num primary key(num),
  		constraint ck_sawon_score check (score between 0 and 100),
 		constraint ck_sawon_gender check (gender in ('����','����')));
        
 desc sawon;    
 -- sawon �� �������ǵ� Ȯ���ϱ�
 select * from information_schema.table_constraints where table_name='sawon';
 
 -- ����Ÿ �߰�
 insert into sawon values (null,'���ϳ�',89,'����','ȫ����');
 -- ���� ���� ���� Ȯ���ϱ�
 -- Error Code: 3819. Check constraint 'ck_sawon_score' is violated.
insert into sawon values (null,'�̵γ�',120,'����','ȫ����');
-- Error Code: 3819. Check constraint 'ck_sawon_gender' is violated.
insert into sawon values (null,'�̵γ�',120,'��','ȫ����');

-- ����� �� ����Ÿ ���� 7�� ���� �߰�
 insert into sawon values (null,'��ȣ��',90,'����','�λ��');
insert into sawon values (null,'�Ѱ���',67,'����','������');
insert into sawon values (null,'������',79,'����','ȫ����');
insert into sawon values (null,'����â',99,'����','�λ��');
insert into sawon values (null,'��ȣ��',100,'����','������');
insert into sawon values (null,'�̼���',87,'����','�λ��');
insert into sawon values (null,'����',74,'����','ȫ����');
insert into sawon values (null,'���̶�',97,'����','�λ��');

-- select limit 
select * from sawon order by name;
select * from sawon order by name limit 0,3; -- 0(ù��)������ 3�� ��ȸ
select * from sawon order by name limit 3,3; -- 3������ 3��
   
-- �����Լ��� ����
select concat('Hello','Kitty','!!') from dual;
-- sawon �� name ���� '��' �� ������ ����Ÿ ��ȸ
select * from sawon where name like concat('%','��','%');
select replace('Happy Day!!','Happy','Nice') from dual;-- Happy �� Nice �� �����ؼ� ���
select instr('Happy Day','Day') from dual; -- 7 : Day �� ��ġã�� (1����)
select instr('Happy Day','Hello') from dual; -- ������� 0

-- ����
select left('Have a Nice Day',4) from dual; -- ���ʿ��� 4���� ���� : Have
select right('Have a Nice Day',8) from dual; -- �����ʿ��� 8���� ���� : Nice Day
select mid('Have a Nice Day',6,6) from dual; -- ���ʿ��� 4���� ���� :6������ 6���� : a Nice
select substring('Have a Nice Day',6,6) from dual; -- ���ʿ��� 4���� ���� :6������ 6���� : a Nice

-- ��������
select ltrim('    Hello    ') from dual; -- ���� ���� ����
select rtrim('    Hello    ') from dual; -- ������ ���� ����
select trim('    Hello    ') from dual; -- ���� ���� ����

-- ��ҹ��� ��ȯ
select lcase('Happy') from dual; -- �ҹ���
select lower('Happy') from dual; -- �ҹ���
select ucase('Happy') from dual; -- �빮��
select upper('Happy') from dual; -- �빮��

select reverse('Happy') from dual; -- �Ųٷ�

-- �����Լ�
select if(1=2,'happy','nice') from dual;
select name,score,if(score>=90,'�հ�','���հ�') "��" from sawon;

-- ����Ŭ�� NVL �� mysql ������ ifnull
select name,height from member;
select name,ifnull(height,0) from member;

-- �����Լ�
select ceiling(5.3), ceiling(5.9) from dual; -- ������ �ø�
select floor(5.3), floor(5.9) from dual; -- ������ ����
select truncate(2.348,2) from dual; -- �Ҽ��� 2�ڸ����� ���,������ ����
select mod(7,2) from dual;  -- ������

-- Group  by
-- �μ��� �ο���,�ְ�����,��������,�������
select buseo �μ�,count(*) �ο���,max(score) �ְ�����,min(score) ��������,
	avg(score) ������� from sawon group by buseo;
    
-- join ����
create table bitclass (
   idx smallint primary key,
   class varchar(30),
   price int,
   gigan smallint);

create table stu (
   num smallint auto_increment primary key,
   name varchar(20),
   idx smallint,
   sugangday date,
   constraint stu_fk_idx foreign key(idx) references bitclass(idx));

-- bitclass �� ����Ÿ �߰�
insert into bitclass values (100,'Java',110000,10);
insert into bitclass values (200,'HTML5',90000,8);
insert into bitclass values (300,'jQuery',130000,12);
insert into bitclass values (400,'Oracle',180000,20);

-- stu �� ����Ÿ �߰�
insert into stu (name,idx,sugangday) values ('kim',200,now());
insert into stu (name,idx,sugangday) values ('lee',100,now());
insert into stu (name,idx,sugangday) values ('son',300,now());
insert into stu (name,idx,sugangday) values ('min',400,now());

-- inner join 1
select class,price,gigan,name,sugangday
from bitclass b,stu s
where b.idx=s.idx;


select *
from bitclass b,stu s
where b.idx=s.idx;

-- inner join 2
select name,class,gigan,price,sugangday
from bitclass b
inner join stu s on b.idx=s.idx;

select *
from bitclass b
inner join stu s on b.idx=s.idx;

-- sub table �� ����Ÿ�� �߰��� ���¿��� �θ����̺��� ����Ÿ�� �����غ���
delete from bitclass where idx=100; -- ���� �߻�

-- sub ���̺��� ����Ÿ���� ���� ������ �θ� ���̺��� ����Ÿ ����
delete from stu where idx=100;
delete from bitclass where idx=100; 

-- ������ join ���̺� ��� �����ϱ�
drop table stu;
drop table bitclass;

drop table member;