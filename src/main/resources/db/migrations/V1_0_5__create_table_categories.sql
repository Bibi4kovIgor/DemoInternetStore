create table if not exists categories (
    id uuid default uuid_generate_v4(),
    name varchar not null,
    description varchar not null,
    primary key (id)
);