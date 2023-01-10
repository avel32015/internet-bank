alter table ibank.balance
    add column name text;

update ibank.balance
    set name = user_id;

drop index ui_balance_user_id;

alter table ibank.balance
    drop column user_id;
