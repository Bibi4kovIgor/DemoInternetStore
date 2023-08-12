create table if not exists suppliers (
    id uuid default uuid_generate_v4(),
    name varchar not null,
    organisation_name varchar not null,
    email varchar not null,
    password varchar not null,
    phone varchar not null,
    document_id uuid,
    primary key (id),
    foreign key(document_id) references documents(id)
);