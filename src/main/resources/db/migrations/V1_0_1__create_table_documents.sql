create extension if not exists "uuid-ossp";

create table if not exists documents (
   id uuid default uuid_generate_v4(),
   tax_id bigint unique not null,
   passport varchar not null,
   additional_info varchar,
   primary key (id)
);