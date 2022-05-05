package com.example.AmazonProject;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.AmazonProject.entity.Podcast;
import com.example.AmazonProject.service.PlayerService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class AmazonProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmazonProjectApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(PlayerService playerService) {
		return args -> {
			// read JSON and write to db
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Podcast>> typeReference = new TypeReference<List<Podcast>>() {
			};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/awesome-podcasts.json");

			try {
				System.out.println("***  TRY  *****");
				List<Podcast> podcast = mapper.readValue(inputStream, typeReference);
				playerService.save(podcast);
				System.out.println("Podcast saved");
			} catch (IOException e) {
				System.out.println("Unable to save " + e.getMessage());
			}

		};
	}

}
