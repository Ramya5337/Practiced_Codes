package com.ammu;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.ammu.sbeans.WishMessageGenerator;

@SpringBootApplication
public class SpringBootProj01AssignmentWishMessageGeneratorApplication {
	@Bean(name="ltime")
	public LocalTime createTime() {
		System.out.println("SpringBootProj01AssignmentWishMessageGeneratorApplication.createTime()");
		return LocalTime.now();
	}

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBootProj01AssignmentWishMessageGeneratorApplication.class, args);
		WishMessageGenerator generator =ctx.getBean(WishMessageGenerator.class,"wmg");
		String msg=generator.generateWishMessage("ramya");
		System.out.println(msg);
		((ConfigurableApplicationContext) ctx).close();
	}

}
