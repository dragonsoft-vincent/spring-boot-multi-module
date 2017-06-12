package com.ktjr.ktwd.web;

import com.ktjr.ktwd.product.ProductApplication;
import com.ktjr.ktwd.user.UserApplication;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WebApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder()
			.bannerMode(Banner.Mode.CONSOLE)
			.sources(UserApplication.class,
					ProductApplication.class,
					WebApplication.class)
			.run(args);
	}

}
