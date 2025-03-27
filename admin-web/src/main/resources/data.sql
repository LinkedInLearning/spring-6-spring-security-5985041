INSERT INTO customers (customer_id, name, contact_name, email, phone) values (RANDOM_UUID(), 'Acme', 'Wylie Coyote', 'wcoyote@acme.com', '1-515-555-2348');
INSERT INTO customers (customer_id, name, contact_name, email, phone) values (RANDOM_UUID(), 'Spacely Space Sprockets', 'George Jettson', 'gjettson@spacely.com', '1-515-555-2350');
INSERT INTO customers (customer_id, name, contact_name, email, phone) values (RANDOM_UUID(), 'Callahan Auto', 'Thomas Callhan', 'tcallahan@callhhanauto.com', '1-515-555-2333');
INSERT INTO customers (customer_id, name, contact_name, email, phone) values (RANDOM_UUID(), 'Dundler Mifflin Inc', 'Michael Scott', 'mscott@dundlermifflin.com', '1-515-555-2320');
INSERT INTO customers (customer_id, name, contact_name, email, phone) values (RANDOM_UUID(), 'Stark Industries', 'Tony Stark', 'tstark@stark.com', '1-515-555-7777');
INSERT INTO customers (customer_id, name, contact_name, email, phone) values (RANDOM_UUID(), 'Initech', 'Peter Gibbons', 'pgibbons@initec.com', '1-515-555-0666');
INSERT INTO customers (customer_id, name, contact_name, email, phone) values (RANDOM_UUID(), 'Wayne Enterprises', 'Bruce Wayne', 'bwayne@wayne.com', '1-515-555-1111');

INSERT INTO orders (order_id, customer_id, order_info) values (RANDOM_UUID(), (SELECT customer_id FROM customers where name = 'Acme'), '1500 Widgets');
INSERT INTO orders (order_id, customer_id, order_info) values (RANDOM_UUID(), (SELECT customer_id FROM customers where name = 'Acme'), '3000 Widgets');
INSERT INTO orders (order_id, customer_id, order_info) values (RANDOM_UUID(), (SELECT customer_id FROM customers where name = 'Callahan Auto'), '200 Widgets');