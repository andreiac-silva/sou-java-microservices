package com.cit.jimmy.fallback;

import com.cit.jimmy.feign.RobertFacade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RobertFallback implements RobertFacade {

	private static final String DEFAULT_SONG = "Quatro semanas de amor (o seu nome eu escrevi na areia...)";
	private final Throwable cause;

	public RobertFallback(Throwable cause) {
		this.cause = cause;
	}

	@Override
	public String getNextSong() {
		log.error(cause.getMessage());
		return DEFAULT_SONG;
	}
}
