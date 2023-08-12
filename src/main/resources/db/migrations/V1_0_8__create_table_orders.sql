create table if not exists orders (
    customer_id uuid not null,
    product_id uuid not null,
    quantity integer DEFAULT 1,
    order_date timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    primary key (customer_id, product_id),
    foreign key(customer_id) references customers(id),
    foreign key(product_id) references products(id)
);