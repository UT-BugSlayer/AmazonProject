package com.example.AmazonProject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.AmazonProject.entity.Podcast;
import com.example.AmazonProject.repository.PlayerRepository;

@Service
public class PlayerService {

	private PlayerRepository playerRepository;

	public PlayerService(PlayerRepository playerRepository) {
		this.playerRepository = playerRepository;
	}

	public Iterable<Podcast> list() {
		return playerRepository.findAll();
	}

	public Podcast save(Podcast podcast) {
		return playerRepository.save(podcast);
	}

	public void save(List<Podcast> podcasts) {
		playerRepository.saveAll(podcasts);
	}

}
