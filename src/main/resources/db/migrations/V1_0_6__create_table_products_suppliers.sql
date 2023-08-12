create table if not exists products_suppliers(
    product_id uuid not null,
    supplier_id uuid not null,
    primary key (product_id, supplier_id),
    foreign key(product_id) references products(id),
    foreign key(supplier_id) references suppliers(id)
);