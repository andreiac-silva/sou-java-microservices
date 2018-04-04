package com.cit.jimmy.fallback;

import org.springframework.stereotype.Component;

import com.cit.jimmy.feign.RobertFacade;

import feign.hystrix.FallbackFactory;

@Component
public class RobertFallbackFactory implements FallbackFactory<RobertFacade> {

	@Override
	public RobertFacade create(Throwable t) {
		return new RobertFallback(t);
	}

}
