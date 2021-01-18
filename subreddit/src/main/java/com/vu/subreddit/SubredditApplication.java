package com.vu.subreddit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SubredditApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubredditApplication.class, args);
	}

}
