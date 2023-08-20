create extension if not exists pgcrypto;


create table if not exists _users (
    id uuid default uuid_generate_v4(),
    user_name varchar not null,
    user_pass varchar not null,
    user_role varchar not null,
    primary key(user_name)
);

insert into _users (user_name, user_pass, user_role) values
('user_name', crypt('user_password', gen_salt('bf')), 'ROLE_USER'),
('admin','admin', 'ROLE_ADMIN'),
('user', crypt('user', gen_salt('bf')), 'ROLE_USER');