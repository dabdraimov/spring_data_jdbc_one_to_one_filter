drop table if exists rental;
drop table if exists movie;

create table movie
(
    id          serial primary key,
    title       text,
    description text
);

create table rental
(
    movie    integer primary key references movie (id),
    duration text,
    price    integer
)
