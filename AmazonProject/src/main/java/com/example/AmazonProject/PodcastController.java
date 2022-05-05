package com.example.AmazonProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/podcasts")
public class PodcastController {

	@Autowired
	private PodcastService podcastService;
//
//	@Autowired
//	public PodcastController(PodcastService podcastService) {
//		this.podcastService = podcastService;
//	}

	@GetMapping("/list")
	public List<Podcast> getAllPodcast() {
		return podcastService.getAllPodcast();
	}

	@GetMapping("/list/{name}")
	public Podcast getPodcast(@PathVariable String name) {
		return podcastService.getPodcast(name);
	}

	@PostMapping("/list")
	public void addPodcast(@RequestBody Podcast podcast) {
		podcastService.addPodcast(podcast);
	}

	@PutMapping("/list/name")
	public void updatePodcast() {

	}

	@DeleteMapping("/list/name")
	public void deletePodcast() {

	}

}
