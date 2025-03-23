package com.ammu.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired
	private LocalTime lt;
	
	//b method
	public String generateWishMessage(String name) {
		System.out.println("WishMessageGenerator.generateWishMessage()");
		int hour=lt.getHour();
		if(hour<12)
			return "Good Morning:"+name;
		else if(hour<16)
			return "Good Afternoon:"+name;
		else if(hour<20)
			return "Good Evening:"+name;
		else
			return "Good Night:"+name;
	}

}
