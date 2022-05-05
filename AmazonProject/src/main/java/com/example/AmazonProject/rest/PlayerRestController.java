package com.example.AmazonProject.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.AmazonProject.entity.Podcast;
import com.example.AmazonProject.service.PlayerService;

@RestController
@RequestMapping("/podcasts")
public class PlayerRestController {

	private PlayerService playerService;

	public PlayerRestController(PlayerService playerService) {
		this.playerService = playerService;
	}

	@GetMapping("/list")
	public Iterable<Podcast> list() {
		return playerService.list();
	}
}
