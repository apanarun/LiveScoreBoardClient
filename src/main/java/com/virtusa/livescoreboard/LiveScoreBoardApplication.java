package com.virtusa.livescoreboard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.virtusa.livescoreboard.config.AppProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class LiveScoreBoardApplication {
	
//	private static final Logger LOGGER=LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(LiveScoreBoardApplication.class, args);
	}

}
