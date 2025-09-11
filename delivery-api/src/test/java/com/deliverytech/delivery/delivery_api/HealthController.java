package com.deliverytech.delivery.delivery_api;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

	@GetMapping("/health")
 	public Map<String, String> health() {

 		return Map.of(
 		"status", "UP",
 		"timemestamp", LocalDateTime.now().toString(),
 		"service", "Delivery API",
 		"javaVersion", System.getProperty("java.version")
 	);

 	} 

 @GetMapping("/info")
 public AppInfo info() {

 	return new AppInfo(
 	"Delivery Tech API",
 	"1.0.0",
 	"Everton T. Ribeiro",
 	"JDK 21",
 	"Spring Boot 3.5.5"
 	);
	
 } 

  // Record para demonstrar recurso do Java 14+ (disponível no JDK 21)
 public record AppInfo(
 String applicaƟon,
 String version,
 String developer,
 String javaVersion,
 String framework
 ) {
 }
} 