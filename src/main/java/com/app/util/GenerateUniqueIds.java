package com.app.util;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class GenerateUniqueIds {
	
	public String generateId(int size) {
		UUID uuid=UUID.randomUUID();
		
		return uuid.toString().replaceAll("-", "");
	}
}
