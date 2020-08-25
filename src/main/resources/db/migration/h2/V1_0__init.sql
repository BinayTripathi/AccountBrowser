-- Account table -  For simplicity user_name and account_number placed in same table that is not normalised
CREATE TABLE account (
	account_number VARCHAR(64) NOT NULL,
    user_name VARCHAR(64) NOT NULL,
    account_name VARCHAR(64) NOT NULL,
    account_type VARCHAR(64) NOT NULL,
    balance_date DATE NOT NULL,
    currency VARCHAR(64) NOT NULL,
    opening_balance DOUBLE(10) NOT NULL,
    PRIMARY KEY (account_number)
);

-- Transaction detail table
CREATE TABLE transaction_details (
	transaction_id VARCHAR(64) NOT NULL,
    account_number VARCHAR(64) NOT NULL,
    value_date DATE NOT NULL,
    currency VARCHAR(64) NOT NULL,
    debit_amount DOUBLE(10) DEFAULT 0.0,
    credit_amount DOUBLE(10) DEFAULT 0.0,
    card_type VARCHAR(64),
    transaction_narative  VARCHAR(64),
    PRIMARY KEY (transaction_id),
    FOREIGN KEY (account_number) REFERENCES account(account_number)
);


----  Creating accounts
insert into account (account_number, user_name,  account_name, account_type, balance_date, currency, opening_balance) 
values ('AC1', 'user1', 'account1', 'CURRENT',parsedatetime('29-05-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 'AUD', 100);

insert into account (account_number, user_name,  account_name, account_type, balance_date, currency, opening_balance) 
values ('AC2', 'user1', 'account2', 'CURRENT',parsedatetime('15-04-2018 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 'AUD', 100);

insert into account (account_number, user_name,  account_name, account_type, balance_date, currency, opening_balance) 
values ('AC3', 'user2', 'account3', 'CURRENT',parsedatetime('12-09-2016 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 'AUD', 100);

insert into account (account_number, user_name,  account_name, account_type, balance_date, currency, opening_balance) 
values ('AC4', 'user4', 'account4', 'CURRENT',parsedatetime('17-09-2019 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 'AUD', 100);



----Updating Transaction table
insert into transaction_details (transaction_id, account_number, value_date,  currency, debit_amount, credit_amount, card_type, transaction_narative)
values ('TX1', 'AC1', parsedatetime('19-05-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 'AUD',0,100, 'CREDIT','Transaction 1');

insert into transaction_details (transaction_id, account_number, value_date,  currency, debit_amount, credit_amount, card_type, transaction_narative)
values ('TX2', 'AC1', parsedatetime('21-04-2019 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 'AUD',0,1000, 'CREDIT','Transaction 2');

insert into transaction_details (transaction_id, account_number, value_date,  currency, debit_amount, credit_amount, card_type, transaction_narative)
values ('TX3', 'AC2', parsedatetime('22-04-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 'AUD',50,0, 'CREDIT','Transaction 3');


insert into transaction_details (transaction_id, account_number, value_date,  currency, debit_amount, credit_amount, card_type, transaction_narative)
values ('TX4', 'AC2', parsedatetime('23-02-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 'AUD',250,0, 'CREDIT','Transaction 4');


insert into transaction_details (transaction_id, account_number, value_date,  currency, debit_amount, credit_amount, card_type, transaction_narative)
values ('TX5', 'AC2', parsedatetime('25-04-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 'AUD',10,0, 'CREDIT','Transaction 5');

insert into transaction_details (transaction_id, account_number, value_date,  currency, debit_amount, credit_amount, card_type, transaction_narative)
values ('TX6', 'AC2', parsedatetime('12-02-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 'AUD',0,100, 'CREDIT','Transaction 6');


insert into transaction_details (transaction_id, account_number, value_date,  currency, debit_amount, credit_amount, card_type, transaction_narative)
values ('TX7', 'AC4', parsedatetime('29-11-2019 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 'AUD',0,200, 'CREDIT','Transaction 7');


insert into transaction_details (transaction_id, account_number, value_date,  currency, debit_amount, credit_amount, card_type, transaction_narative)
values ('TX8', 'AC1', parsedatetime('29-05-2018 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 'AUD',0,150, 'CREDIT','Transaction 8');





