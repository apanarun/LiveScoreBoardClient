package com.virtusa.livescoreboard.controller;

import org.springframework.web.bind.annotation.RestController;

import com.virtusa.livescoreboard.exception.ResourceNotFoundException;
import com.virtusa.livescoreboard.model.User;
import com.virtusa.livescoreboard.repository.UserRepository;
import com.virtusa.livescoreboard.security.CurrentUser;
import com.virtusa.livescoreboard.security.UserPrincipal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class UserController {
	
	@Autowired
    private UserRepository userRepository;

    @GetMapping("/user/me")
    @PreAuthorize("hasRole('USER')")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        return userRepository.findById(userPrincipal.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getId()));
    }
	
}
