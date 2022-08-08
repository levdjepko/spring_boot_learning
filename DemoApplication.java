
package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {
	static List<String> names = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		names.add("firstname");
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

		// http://localhost:8080/getall
	@GetMapping("/getall")
	public String getAll(@RequestParam(value = "name", defaultValue = "World") String name) {
		return names.toString();
	}
	
		// http://localhost:8080/insert?name=LEV
	@GetMapping("/insert")
	public String insertName(@RequestParam(value = "name", defaultValue = "empty") String name) {
		names.add(name);
		return new String(name + "has been stored");
	}

}
            
