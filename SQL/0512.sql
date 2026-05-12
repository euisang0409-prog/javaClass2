SELECT *
FROM member
WHERE join_date >= DATE_SUB(CURDATE(), INTERVAL 1 YEAR);

select p_name 
from publisher p
where exists (select 1 from book b where b.p_id = p.p_id);

select b.title,b.price
from publisger p
join book b
on p.p_id = b.p_id
where all > (select price from book where price);

select p_id, AVG(price)
from book
group by p_id
having avg(price) >= 20000;


update book
set price = price * 1.1
where p_id = (select p_id from publisher where p_name = '서울출판사');

select p.p_name, b.titel
from publisher p
left join  book b
on p.p_id = b.p_id;

alter table member
add phon VARCHAR(15);

create index idx_mem_id
on member(mem_id);

create view v_pub_book as 
select p.p_name,b.title 
from publisher p
join book b
on p.p_id = b.p_id;

delete from member
where join_date < '2023-01-01';

select b.title, p_name
from book b
full outer join publisher p
on b.p_id = p.p_id;

insert into member_backup select * from member;

create table student(
	s_id INT primary key,
	name varchar(20) not null,
	major varchar(50)
);

insert into student(s_id,name,majoir)
values (202401,'홍길동','컴퓨터');

update student
set major = '데이터분석'
where s_id = 202401;

select *
from book
where price >= 15000
order by price desc;

select p_id, AVG(price)
from book
group by p_id
where avg(price) >= 10000;

select s.name, sc.point
from student s
join score sc 
on s.s_id = sc.s_id;

select price,title
from book
where price = (select max(price) from book);

select *
from student
order by major asc, s_id desc;

create index idx_product_search
on product(p_name,price);

-- 1.
-- 2.
delete from student;

select *
from score
where s_id in(select s_id from score where point = 100);

select name
from student
where major is null;

select count(*) as 학생수
from student;

update book
set price = price * 0.9 as 할인가
where title

select title

select id
from member m
join order o
on m.id = o.id

cha

create database if not exists student
character set utf8_ 샬라샬라
collate 

select name, (select AVG(point) from score) as 전체평균
from student;

select *
form (select major, avg(point) as avg_p from score group by major ) as major
where avg(point) >= 90;
	


