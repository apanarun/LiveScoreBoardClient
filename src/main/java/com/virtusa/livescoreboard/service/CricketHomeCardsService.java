package com.virtusa.livescoreboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.livescoreboard.model.CricketHomeCards;
import com.virtusa.livescoreboard.repository.CricketHomeCardsRepository;

@Service
public class CricketHomeCardsService {
	
	@Autowired
	CricketHomeCardsRepository repo;
	
	//Add new Cards
	public CricketHomeCards create(CricketHomeCards card) {
		return repo.save(card);
	}
	
	//Get All Upcoming Cards
	public List<CricketHomeCards> getAll() {
		return repo.findAll();
	}
}
