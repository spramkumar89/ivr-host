package com.servion.ivrhost;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HostController {
	
	@GetMapping("/ivr/host")
	public String processBackend(@RequestParam(defaultValue = "defaulthost") String hostMethod) {
		System.out.println(hostMethod + " - Processing");
		System.out.println(hostMethod + " - Processed");
		return hostMethod + "-Result";
	}

}
