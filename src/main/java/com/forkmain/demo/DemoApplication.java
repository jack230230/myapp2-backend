package com.forkmain.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

@Controller
class HelloController {

	@RequestMapping("/")
	@ResponseBody 
    public String hello() {
        return "Hello world!";
    }

	@RequestMapping("/health")
	@ResponseBody 
    public String health() {
        return "ok";
    }


	@RequestMapping("/env")
	@ResponseBody 
    public String env() {
        return System.getenv("ENV_NAME");
    }
}
