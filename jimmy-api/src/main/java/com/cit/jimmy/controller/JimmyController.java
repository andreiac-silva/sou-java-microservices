package com.cit.jimmy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cit.jimmy.service.JimmyService;

@RestController
@RequestMapping(value = "/jimmy")
public class JimmyController {

	@Autowired
	private JimmyService jimmyService;

	@GetMapping("/play-guitar")
	public String playGuitar() {
		String song = this.jimmyService.getNextSong();
		return "Playing " + song;
	}
}
