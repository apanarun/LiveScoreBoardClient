package com.virtusa.livescoreboard.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.virtusa.livescoreboard.model.CricketHomeCards;

@Repository
public interface CricketHomeCardsRepository extends MongoRepository<CricketHomeCards, String> {

}
