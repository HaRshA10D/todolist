
CREATE TABLE users (
    id BIGINT PRIMARY KEY,
    name VARCHAR(64) NOT NULL,
    org_id VARCHAR(16) NOT NULL,
    nick_name VARCHAR(16) NOT NULL,
    created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP NOT NULL
);
