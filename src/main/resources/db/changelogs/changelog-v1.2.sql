-- liquibase formatted sql
-- changeset filarty:3

ALTER TABLE users DROP COLUMN roles;

DROP TABLE user_roles;

CREATE TABLE user_roles (
    user_id BIGINT NOT NULL,
    role TEXT NOT NULL,
    PRIMARY KEY (user_id, role),
    FOREIGN KEY (user_id) REFERENCES users(id)
);
