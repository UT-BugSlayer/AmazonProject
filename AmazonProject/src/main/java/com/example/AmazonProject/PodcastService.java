package com.example.AmazonProject;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PodcastService {

//	private PodcastRepository podcastRepository;
//
//	public PodcastService(PodcastRepository podcastRepository) {
//		this.podcastRepository = podcastRepository;
//	}

	private List<Podcast> podcasts = Arrays.asList(
			new Podcast("This American Life", "NPR Podcast", "npr.com", "npr audio", "npr image", "NPR Secrets"),
			new Podcast("Brain Sparks",
					"This podcast is hosted by usability and UI design expert, Jared Spool. It offers tona of value with many industry leaders sharing insights on usability, UX design, and UI design.",
					"https://www.uie.com/brainsparks/topics/podcasts/",
					"https://downloads.uie.fm/7/389/asset.uie.com/BSAL/UIEP015_Shipe_Goodwin.mp3",
					"https://uie.fm/assets/album-art/the-uie-podcast.png",
					"The Tension of Art and Science When Communicating Complex User Research"),
			new Podcast("The Dirt Show",
					"The Dirt Show is a podcast hosted by the team behind the UX design agency, Fresh Tilled Soil. One cool thing about this podcast is some topics follow a mini-series format, with multiple episodes and different guests talking about the same topic. For example, they have a mini-series on topics such as \"designing your career\" and \"designing the future\".",
					"http://www.freshtilledsoil.com/category/podcast/",
					"http://traffic.libsyn.com/thedirt/James_Aylward_-_Final.mp3", "",
					"Data-Driven Design with James Aylward of Pluralsight"));

	public List<Podcast> getAllPodcast() {
		return podcasts;
	}

	public Podcast getPodcast(String name) {
		return podcasts.stream().filter(p -> p.getName().equals(name)).findFirst().get();
	}

	public void addPodcast(Podcast podcast) {
		podcasts.add(podcast);
	}

}
