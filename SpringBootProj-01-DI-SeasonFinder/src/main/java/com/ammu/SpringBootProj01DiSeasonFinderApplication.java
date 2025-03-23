package com.ammu;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.ammu.sbeans.SeasonFinder;

@SpringBootApplication
public class SpringBootProj01DiSeasonFinderApplication {
	@Bean(name="ldate")
	public LocalDate createDate() {
		return LocalDate.now();
	}

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBootProj01DiSeasonFinderApplication.class, args);
		SeasonFinder sf=ctx.getBean(SeasonFinder.class,"season");
		String msg=sf.findSeason();
		System.out.println("season name::"+msg);
		((ConfigurableApplicationContext) ctx).close();
	}

}
