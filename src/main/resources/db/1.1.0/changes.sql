create table ibank.balance (
    id bigint primary key generated always as identity,
    name text,
    current_balance numeric
);
