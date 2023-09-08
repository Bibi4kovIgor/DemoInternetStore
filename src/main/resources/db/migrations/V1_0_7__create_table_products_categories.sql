create table if not exists products_categories (
    category_id uuid not null,
    product_id uuid not null,
    primary key (category_id, product_id),
    foreign key(category_id) references categories(id),
    foreign key(product_id) references products(id)
);