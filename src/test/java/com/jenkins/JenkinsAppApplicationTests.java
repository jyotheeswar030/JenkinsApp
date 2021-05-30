package com.jenkins;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsAppApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(JenkinsAppApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case Executed....");
		assertThat(true);
	}

}
