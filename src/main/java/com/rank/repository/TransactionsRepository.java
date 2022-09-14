package com.rank.repository;

import com.rank.entity.Transactions;
import com.rank.model.PlayerDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionsRepository  extends JpaRepository<Transactions, Integer> {

    List<PlayerDetail> findByPlayerId(Integer playerId);

}
