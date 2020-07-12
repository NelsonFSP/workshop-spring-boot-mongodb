package com.nelson.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.nelson.workshopmongo.domain.User;
import com.nelson.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	private UserRepository UserRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		UserRepository.deleteAll();
		
		User maria= new User(null, "Maria Brown", "maria@gmail.com");
		User alex= new User(null, "Alex Green", "alex@gmail.com");
		User bob= new User(null, "BobGrey", "bob@gmail.com");	
		
		UserRepository.saveAll(Arrays.asList(maria, alex, bob));
		
	}

}