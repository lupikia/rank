package com.rank.model;

import org.springframework.stereotype.Service;

@Service
public class PlayerBalance {

    private int transactionId;

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    private float balance;
}
