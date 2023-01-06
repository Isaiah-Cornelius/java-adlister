USE adlister_db;

DROP TABLE IF EXISTS ads;

CREATE TABLE ads (
    ads_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    users_id INT UNSIGNED,
    title VARCHAR(50) NOT NULL,
    description VARCHAR(50) NOT NULL,
    PRIMARY KEY (ads_id),
    CONSTRAINT fk_users_id FOREIGN KEY (users_id) REFERENCES users(id)

)