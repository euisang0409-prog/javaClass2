select dept_id, count(*)
from employee
group by dept_id
having count(*);

select age
from student
order by age desc ;

select dept_id,count(*)
from employee
group by dept_id 
having count >= 2;

select name,salary
from employee
where salary > (select AVG(salary) from employee);

create index idx_name
on student(name);

select name,salary
from employee
where salary > (select AVG(salary) from employee);

select s.name, c.class_name
from student s
join class c
on s.class_id = c.id;

select dept_id, count(*)
from employee
group by dept_id
having count(*) >= 2;

select name, salary
from employee
where salary > (select avg(salary) from employee);

create index idx_name
on student(name);

select dept_id, count(*)
from employee
group by dept_id;

select age
from student
order by age desc ;

select dept_id, count(*)
from employee
group by dept_id
having count(*) >= 2;

select s.name, c.class_name
from stdunet s
join class c
on s.class_id = c.id;

delimiter //

create procedure get_price()

begin 
	declare v_price INT;
	
	select price
	into v_price
	from product
	where product_id = 1;
	
	select v_price;
end //

delimiter ;

delimiter //

create procedure get_price(in p_id INT)
begin
declare v_price INT;

	select price
	into v_price
	from product
	where product_id = p_id;

	select v_price;
end //

delimiter ;


delimiter //

create procedure check_stock(in p_id int )

begin
	
	declare v_stock INT;
	
	select stock
	into v_stock
	from product
	where product_id = p_id;
	
	if v_stock >= 10 then
		select '재고충분' as message;
	else
		select 	'재고부족' as message;
	end if;
	
end	// 

delimiter ;

delimiter //

create procedure update_product(in p_id int)

begin
	
	declare v_stock int;
	
	select stock
	into v_stock
	from product
	where product_id = p_id;
	
	if v_stock = 0 then
	select '품절 처리 (삭제)' as message;
	
	else
		update product
		set price = * 1.1
		where product_id = p_id;
	
	select '가격 10% 인상' as message;
end if;
	
	
end

	
	




















