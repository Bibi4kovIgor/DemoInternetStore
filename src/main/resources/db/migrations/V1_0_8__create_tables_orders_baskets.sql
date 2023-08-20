create table if not exists orders (
    customer_id uuid not null,
    product_id uuid not null,
    quantity integer DEFAULT 1,
    order_date timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    primary key (customer_id, product_id, order_date),
    foreign key(customer_id) references customers(id),
    foreign key(product_id) references products(id)
);

create table if not exists baskets (
--  This field is not unique
--  It is used for union customers
--  products choices into one place
    id uuid default uuid_generate_v4(),
    customer_id uuid not null,
    product_id uuid not null,
    quantity double precision DEFAULT 1.0,
    create_date timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    primary key (id, customer_id, product_id),
    foreign key(customer_id) references customers(id),
    foreign key(product_id) references products(id)
);