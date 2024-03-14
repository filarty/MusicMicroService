-- liquibase formatted sql
-- changeset filarty:1

CREATE TABLE users (
    id SERIAL PRIMARY KEY NOT NULL UNIQUE,
    username TEXT NOT NULL UNIQUE,
    email TEXT NOT NULL UNIQUE,
    password TEXT NOT NULL,
    roles TEXT NOT NULL,
    is_active BOOLEAN NOT NULL
);

CREATE TABLE roles (
    id SERIAL PRIMARY KEY NOT NULL UNIQUE,
    roles TEXT NOT NULL,
    user_id SERIAL,
    FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
)
