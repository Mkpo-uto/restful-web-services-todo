package com.mkpoutoe.rest.webservices.restful_web_services.helloworld;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {
	
	//@RequestMapping(method=RequestMethod.GET, path="/hello-world")
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World Bean");
	}
	
	@GetMapping(path="/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}

	
	@GetMapping(path="/greetings")
	public List<HelloWorldBean> helloWorldList(){
		return Arrays.asList(
				new HelloWorldBean("Hello World Mkpo-uto"),
				new HelloWorldBean("Hello World Edima"),
				new HelloWorldBean("Hello World Etimbuk"),
				new HelloWorldBean("Hello World InyeneObong")
				);
	}
}
