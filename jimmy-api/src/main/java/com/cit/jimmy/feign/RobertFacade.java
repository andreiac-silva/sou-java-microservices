package com.cit.jimmy.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.cit.jimmy.fallback.RobertFallbackFactory;

@FeignClient(value = "${rest.client.robert.url}", fallbackFactory = RobertFallbackFactory.class)
public interface RobertFacade {

	@GetMapping("/next-song")
	public String getNextSong();
}
