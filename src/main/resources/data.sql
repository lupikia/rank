
INSERT INTO Player (id, username, balance) VALUES (1, 'david', CAST(3000 AS Decimal(18, 0)));
INSERT INTO Player (id, username, balance) VALUES (2, 'paul', CAST(440 AS Decimal(18, 0)));
INSERT INTO PlayerTransactions (id, playerId, transactionType, amount) VALUES (1, 2, 'WAGER', CAST(50 AS Decimal(18, 0)));
INSERT INTO PlayerTransactions (id, playerId, transactionType, amount) VALUES (2, 1, 'WIN', CAST(15 AS Decimal(18, 0)));