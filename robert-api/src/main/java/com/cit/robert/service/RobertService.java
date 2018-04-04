package com.cit.robert.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RobertService {

	private final static String SONG = "Que tiro foi esse";

	public String getNextSong() {
		log.info("Robert thinking about the next song...");
		return SONG;
	}
}
