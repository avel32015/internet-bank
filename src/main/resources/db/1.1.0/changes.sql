create table ibank.balance (
    id bigint primary key generated always as identity,
    name text,
    currentBalance number
);
