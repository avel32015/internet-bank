alter table ibank.balance
    add column user_id text;

update ibank.balance
    set user_id = coalesce(name, 'user-' || id);

alter table ibank.balance
    alter column user_id set not null;

create unique index ui_balance_user_id
    on ibank.balance(user_id);

alter table ibank.balance
    drop column name;

insert into ibank.balance (user_id)
values ('test');
