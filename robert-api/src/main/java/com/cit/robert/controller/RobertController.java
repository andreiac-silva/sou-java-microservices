package com.cit.robert.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cit.robert.service.RobertService;

@RestController
public class RobertController {

	@Autowired
	private RobertService robertService;

	@GetMapping("/next-song")
	public String getNextSong() {
		return this.robertService.getNextSong();
	}
}
