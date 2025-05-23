CREATE TABLE customers(
    customer_id UUID primary key,
    name varchar(64) not null,
    contact_name varchar(128) not null,
    email varchar(128) not null,
    phone varchar(24) not null
);

CREATE TABLE orders(
    order_id UUID primary key,
    customer_id UUID not null,
    order_info varchar (2048) not null,
    foreign key (customer_id) references customers(customer_id)
);