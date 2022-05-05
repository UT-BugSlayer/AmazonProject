package com.example.AmazonProject;

public class Podcast {

	private String name;
	private String description;
	private String source;
	private String audio;
	private String image;
	private String title;

	// define constructor
	public Podcast() {

	}

	public Podcast(String name, String description, String source, String audio, String image, String title) {
		super();
		this.name = name;
		this.description = description;
		this.source = source;
		this.audio = audio;
		this.image = image;
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getAudio() {
		return audio;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
