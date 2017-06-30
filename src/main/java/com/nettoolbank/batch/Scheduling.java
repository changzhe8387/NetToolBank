package com.nettoolbank.batch;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Configuration
@EnableScheduling
@Service
public class Scheduling {

	@Scheduled(fixedDelay=1000)
	public void scheduling(){
		System.out.println("定期バッチが流している");
	}
}
