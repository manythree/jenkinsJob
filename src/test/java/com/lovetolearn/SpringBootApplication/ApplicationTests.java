package com.lovetolearn.SpringBootApplication;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ApplicationTests {

	public static final Logger logger = LoggerFactory.getLogger(Application.class);


	@Test
	void contextLoads() {
		logger.info("test are working correctly");
        assertTrue(true);
	}

}
