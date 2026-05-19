create table product(
	product_id INT primary key auto_increment,
	product_name varchar(100) not null,
	price INT not null,
	stock INT not null
);

insert into product(product_name, price, stock)
values ('노트북', 1200000,10),
		('마우스',20000,50),
		('키보드',80000,30);

update product
set price = price * 1.1
where stock <= 20;

delete from product
where price <= 10000;

select product_name,price
from product
where price >= 50000;

select count(*) as total_count,
	AVG(price) as avg_price,
	max(price) AS max_price,
	min(price) AS min_price
from product;

select stock, count(*)
from product 
group by 

select p.product_name, c.category_name
from product p
join category c
on p.category_id = c.category_id;

select product_name,price
from product
where price > (select AVG(price) from product);

create view v_product_category_sales as
select c.category_name,p.product_name,p.price,p.count(*) as total_count
from product p
join categorty c
on p.category_id = c.category_id
where count(*) >= 2;

select d.dept_name,count(*), AVG(e.salary)
from employee e
join department d
on e.dept_id = d.dept_id
group by d.dept_name
having count(*) >= 2;

















