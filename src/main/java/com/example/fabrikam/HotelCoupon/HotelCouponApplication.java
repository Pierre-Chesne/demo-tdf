package com.example.fabrikam.HotelCoupon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication

public class HotelCouponApplication extends SpringBootServletInitializer {

	private static final Logger log = LoggerFactory.getLogger(HotelCouponApplication.class);

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(HotelCouponApplication.class);
    }


	public static void main(String[] args) {
		SpringApplication.run(HotelCouponApplication.class, args);
	}
}