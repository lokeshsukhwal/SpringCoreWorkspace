package com.app.lokesh.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class BillService {
	
	/*
	 * @Scheduled(fixedDelay = 2000) //Millisecond (exact waiting time)
	 * [waiting time is Fixed no matter how much time taken by method for execution it's logic]
	 */	
	
	
	/* 
	 * @Scheduled(fixedRate = 3000) //Millisecond (Max Wait Time ) 
	 * (Including task execution time also)
	 * [waiting time + including task execution time ]
	 * waiting time is not fixed 
	 */
	
	/*
	 * Reference Doc :
	 * https://spring.io/blog/2020/11/10/new-in-spring-5-3-improved-cron-expressions
	 */	
	@Scheduled(cron = "*/3 * * * * *") //execute task in every 3 second
	public void generateInvoice() {
		System.out.println("Today Date & Time is : "+new Date());
	}
}
