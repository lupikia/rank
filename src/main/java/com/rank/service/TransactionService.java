package com.rank.service;
import com.rank.entity.Transactions;
import com.rank.repository.TransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    @Autowired
    TransactionsRepository transactions;

    public Integer addNewTransaction(Transactions newEntry) {
       Transactions tempData =  transactions.saveAndFlush(newEntry);
        return tempData.getId();
    }
}
