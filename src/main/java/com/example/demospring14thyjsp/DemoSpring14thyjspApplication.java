package com.example.demospring14thyjsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
@Controller
public class DemoSpring14thyjspApplication {

	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/");
		viewResolver.setSuffix(".jsp");
		viewResolver.setViewNames("jsp/*");
		viewResolver.setOrder(1);
		return viewResolver;
	}

	@RequestMapping("/a")
	public String a() {
		return "index";
	}

	@RequestMapping("/b")
	public String b() {
		return "jsp/welcome";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoSpring14thyjspApplication.class, args);
	}
}
