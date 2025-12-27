package com.example.demo.entiy;

public class Post {

	private String postId;
	private String description;
	
	public Post() {
		
	}
	public Post(String postId, String description) {
		this.postId = postId;
		this.description = description;
	}
	public String getpId() {
		return postId;
	}
	public void setpId(String pId) {
		this.postId = pId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
