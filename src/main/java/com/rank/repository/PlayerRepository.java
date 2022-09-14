package com.rank.repository;

import com.rank.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PlayerRepository extends JpaRepository<Player, Integer> {

    Player findByUsername(String username);
}
