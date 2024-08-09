CREATE TABLE Limits(
                       id SERIAL PRIMARY KEY,
                       category VARCHAR(255) NOT NULL,
                       local_date_time TIMESTAMP NOT NULL,
                       month_limit VARCHAR(255) NOT NULL
);
CREATE TABLE Exchange(
                       id SERIAL PRIMARY KEY,
                       base_currency VARCHAR(255) NOT NULL,
                       counter_currency VARCHAR(255) NOT NULL,
                       date DATE NOT NULL,
                       rate DECIMAL(10,5) NOT NULL
);
CREATE TABLE Transaction(
                        account_from VARCHAR(255) NOT NULL,
                        account_to VARCHAR(255) NOT NULL,
                        amount DECIMAL NOT NULL,
                        category VARCHAR(255) NOT NULL,
                        currency VARCHAR(255) NOT NULL,
                        date_time TIMESTAMP NOT NULL,
                        limit_exceeded BOOLEAN NOT NULL,
                        limit_id INT,
                        FOREIGN KEY (limit_id) REFERENCES Limits(id)
);