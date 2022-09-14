package com.rank.model;

import org.springframework.stereotype.Service;

@Service
public class PlayerDetail {

    private int playerId;
    private float balance;

    public float getBalance() {
        return balance;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

}
