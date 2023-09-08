create table if not exists products (
    id uuid default uuid_generate_v4(),
    name varchar not null,
    vendor_code varchar unique not null,
    quantity double precision DEFAULT 1.0,
    availability boolean DEFAULT FALSE,
    price numeric not null,
    description varchar,
    primary key (id)
);