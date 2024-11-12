package org.example.services.impl;

import org.example.SpringBootDomain_InternetCafeApplication;
import org.example.domain.internetCafe.InternetCafe;
import org.example.services.IInternetCafeDomainService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertTrue;


/*
 * DOMAIN Service Tests
 * Strategy: Simple-Facade
 */

//JUnit.5
@SpringBootTest(classes = SpringBootDomain_InternetCafeApplication.class)
public class Test1_SimpleDomainService {
	private static Logger logger = Logger.getLogger(Test1_SimpleDomainService.class.getName());

	@Autowired
	private IInternetCafeDomainService service;
	@Test
	public void test() {
		logger.info("Service implementation object :: " + service);
		logger.info("Service implementation class :: " + service.getClass().getName());
		//
		Integer gamesCount = service.getInternetCafeGamesCount(1);
		assertTrue(gamesCount > 0, "Features not counting...");
		logger.info("Feature count autowired xml:: " + gamesCount);
	}
}
