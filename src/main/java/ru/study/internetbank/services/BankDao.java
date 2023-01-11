package ru.study.internetbank.services;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class BankDao {

    final private JdbcTemplate jdbcTemplate;

    public BankDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public BigDecimal getBalance(String userId) {
        return jdbcTemplate.queryForObject(SELECT_BALANCE, BigDecimal.class, userId);
    }

    private static final String SELECT_BALANCE = "select current_balance from ibank.balance where user_id = ?";

}
