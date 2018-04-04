package com.cit.jimmy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cit.jimmy.feign.RobertFacade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class JimmyService {

	@Autowired
	private RobertFacade robertFacade;

	public String getNextSong() {
		log.info("Oh my! I need to talk to Robert about the next song!");
		return this.robertFacade.getNextSong();
	}
}