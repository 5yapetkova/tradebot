package com.advanced.tradebot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan({"com.advanced.tradebot.model"})
public class TradeBotApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradeBotApplication.class, args);
	}

}
