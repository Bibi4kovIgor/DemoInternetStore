create table if not exists customers (
    id uuid default uuid_generate_v4 (),
    first_name varchar not null,
    last_name varchar not null,
    phone varchar not null,

--  timestamp means that date will be converted to milliseconds
--  it store milliseconds count from January 1, 1970 to given data
    birth_date timestamp with time zone,

    login varchar not null,
    email varchar not null,
    password varchar not null,
    document_id uuid,
    primary key (id),
    foreign key(document_id) references documents(id)
);