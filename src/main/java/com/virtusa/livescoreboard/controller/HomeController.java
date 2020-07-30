package com.virtusa.livescoreboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.livescoreboard.model.CricketHomeCards;
import com.virtusa.livescoreboard.service.CricketHomeCardsService;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	CricketHomeCardsService cricketService;
	
	@GetMapping("/cards/cricket")
	public ResponseEntity<?> getUpcomingCards(){		
		return ResponseEntity.ok(cricketService.getAll());
	}
	
	@PostMapping("/cards/cricket/create")
	public CricketHomeCards createUpcomingCards(@RequestBody CricketHomeCards card) {
		return cricketService.create(card);		
	}

}
