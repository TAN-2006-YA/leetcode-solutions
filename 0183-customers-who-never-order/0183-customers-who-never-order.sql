# Write your MySQL query statement below
select c.name as Customers from customers as c
left join orders as o
on c.id=o.customerId
where c.id  not in (select customerid from orders);